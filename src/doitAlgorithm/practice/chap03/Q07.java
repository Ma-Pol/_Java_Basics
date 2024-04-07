package doitAlgorithm.practice.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PhyscData[] x = { // 시력의 내림차순으로 정렬 삽입
                new PhyscData("박준서", 175, 2.0),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("황지안", 169, 0.8),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("강민하", 162, 0.3),
        };

        System.out.print("시력이 몇인 사람을 찾고 있나요?: ");
        double vision = Double.parseDouble(br.readLine());
        int idx = Arrays.binarySearch(
                x, // 조사할 배열 x
                new PhyscData("", 0, vision), // 찾아야 할 객체 (시력이 vision인 객체)
                PhyscData.VISION_ORDER // VISION_ORDER를 활용하여 조사
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

        // 시력의 내림차순으로 검색하기 위한 Comparator 시작
        public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return d1.vision > d2.vision ? -1 :
                        d1.vision < d2.vision ? 1 : 0;
            }
        }
        // 시력의 내림차순으로 검색하기 위한 Comparator 끝
    }
}
