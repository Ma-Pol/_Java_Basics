package kyh_1_introductory.casting;

public class Casting4 {
    public static void main(String[] args) {
        // 같은 타입끼리의 계산은 같은 타입의 결과를 출력한다.
        // 서로 다른 타입끼리의 계산은 둘 중 큰 범위의 타입으로 자동 형변환이 일어난다.
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); // 1.5

        double div4 = (double) 3 / 2; // 리터럴 3을 형변환
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b; // a를 형변환
        System.out.println("result = " + result); // 1.5
    }
}
