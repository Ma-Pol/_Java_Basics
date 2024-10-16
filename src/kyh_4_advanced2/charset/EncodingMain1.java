package kyh_4_advanced2.charset;

import java.nio.charset.Charset;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.*;

public class EncodingMain1 {
    private static final Charset EUC_KR = Charset.forName("EUC_KR");
    private static final Charset MS_949 = Charset.forName("MS_949");

    public static void main(String[] args) {
        System.out.println("== ASCII 영문 처리 ==");
        encoding("A", US_ASCII);
        encoding("A", ISO_8859_1);
        encoding("A", EUC_KR);
        encoding("A", MS_949);
        encoding("A", UTF_8);
        encoding("A", UTF_16BE);

        System.out.println("\n== 한글 지원 ==");
        encoding("가", EUC_KR); // 0~255 기준: [176, 161], -128~127(자바) 기준: [-80, -95]
        encoding("가", MS_949); // 1byte의 첫 비트를 부호 표기로 보느냐, 숫자로 보느냐의 차이
        encoding("가", UTF_8);
        encoding("가", UTF_16BE);
    }

    private static void encoding(String text, Charset charset) {
        byte[] bytes = text.getBytes(charset);
        System.out.printf("%s -> [%s] 인코딩 -> %s %sbyte\n",
                text, charset, Arrays.toString(bytes), bytes.length);
        // String.getBytes(charset) 메서드를 사용하면 String 문자열을 byte 배열로 변경할 수 있다.
        // 이때 Charset 객체를 전달하면 그 문자 집합에 맞게 byte 배열로 변경해준다.
        // Charset 객체를 전달하지 않으면 현재 시스템에서 사용하는 기본 문자 집합을 사용한다.
    }
}
