package kyh_1_introductory.array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int studentCount = scanner.nextInt();

        int[][] students = new int[studentCount][3];
        String[] subjects = {"국어", "영어", "수학",};

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                students[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < students.length; i++) {
            int total = 0;

            for (int j = 0; j < students[i].length; j++) {
                total += students[i][j];
            }

            double average = (double) total / students[i].length;

            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
