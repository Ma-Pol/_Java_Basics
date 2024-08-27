package kyh_3_intermediate1.lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
//        Class helloClass = Hello.class;
        Class helloClass = Class.forName("kyh_3_intermediate1.lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
