package kyh_3_intermediate1.examples.nested.test;

public class AnonymousMain {

    public static void main(String[] args) {
        Hello hello = new Hello() {

            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };

        hello.hello();
    }
}