package kyh_3_intermediate1.examples.nested.inner;

public class InnerOuter {

    private static final int outClassValue = 3;
    private final int outInstanceValue = 2;

    class Inner {
        private final int innerInstanceValue = 1;

        public void print() {
            // 자기 자신에 접근
            System.out.println(innerInstanceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outInstanceValue);

            // 외부 클래스의 클래스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outClassValue);
        }
    }
}
