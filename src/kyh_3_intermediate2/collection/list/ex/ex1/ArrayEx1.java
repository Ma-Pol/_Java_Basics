package kyh_3_intermediate2.collection.list.ex.ex1;

// 아래 코드를 리스트로 변경
// ListEx1
public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }

        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
