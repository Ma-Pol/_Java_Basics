package kyh_3_intermediate1.lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        // 반환 값을 사용하지 않으면 add가 실행되지 않은 것 처럼 보임
        System.out.println("obj1 = " + obj1.getValue());
    }
}
