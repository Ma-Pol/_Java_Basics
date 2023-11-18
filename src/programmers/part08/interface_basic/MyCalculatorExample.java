package programmers.part08.interface_basic;

public class MyCalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new MyCalculator();

        System.out.println(cal.plus(3, 4));
        System.out.println(cal.multiple(3, 4));
        System.out.println();
        System.out.println(cal.exec(3, 4));
        System.out.println();
        System.out.println(Calculator.exec2(3, 4));
    }
}
