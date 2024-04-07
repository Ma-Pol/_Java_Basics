package doitAlgorithm.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class PhysExamSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PhyscData[] x = { // 키의 오름차순으로 정렬 삽입
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("황지안", 169, 0.8),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("박준서", 175, 2.0),
        };

        System.out.print("키가 몇 cm인 사람을 찾고 있나요?: ");
        int height = Integer.parseInt(br.readLine());
        int idx = Arrays.binarySearch(
                x, // 조사할 배열 x
                new PhyscData("", height, 0.0), // 찾아야 할 객체 (키가 height인 객체)
                PhyscData.HEIGHT_ORDER // HEIGHT_ORDER를 활용하여 조사
        );

        if (idx < 0)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.printf("그 값은 x[%d]에 있습니다.\n찾은 데이터: %s\n", idx, x[idx]);


        br.close();
    }

    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        // 키의 오름차순으로 검색하기 위한 Comparator 시작
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return d1.height - d2.height; // int 데이터이기에 가능한 방법
                        // (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0 으로도 가능
            }
        }
        // 키의 오름차순으로 검색하기 위한 Comparator 끝
    }
}
