package kyh_4_advanced2.annotation.java;

public class OverrideMain {
    static class A {
        public void call() {
            System.out.println("A.call");
        }
    }

    static class B extends A {
//        @Override // 주석 풀면 컴파일 오류 발생
        public void caal() { // 오타로 인해 오버라이드되지 않음
            System.out.println("B.call");
        }
    }

    public static void main(String[] args) {
        A a = new B();
        a.call();
    }
    /*
     * @Override는 @Retention(RetentionPolicy.SOURCE) 로 설정되어 있다.
     * 따라서 컴파일 이후에 @Override 애노테이션은 제거된다.
     */
}
