package kyh_4_advanced2.io.file.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

// 라인 단위로 읽기
public class ReadTextFileV2 {
    private static final String PATH = "temp/hello2.txt";

    public static void main(String[] args) throws IOException {
        String writeString = "abc\n가나다";
        System.out.println("== Write String ==");
        System.out.println(writeString);

        Path path = Path.of(PATH);

        // 파일에 쓰기
        Files.writeString(path, writeString, UTF_8);

        // 파일에서 읽기
        System.out.println("== Read String ==");

        // readAllLines(path): 파일을 한 번에 다 읽고, 라인 단위로 List에 나누어 저장 후 반환
        List<String> lines = Files.readAllLines(path, UTF_8);
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ": " + lines.get(i));
        }

        // lines(path): 파일을 한 줄 단위로 나누어 읽는다. Lambda, Stream 이해 필요
        Stream<String> lineStream = Files.lines(path, UTF_8);
        lineStream.forEach((line) -> System.out.println(line));
        lineStream.close();
    }
}
