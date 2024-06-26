package doitAlgorithm.chap03;

public class GenericClassTester {
    public static void main(String[] args) {
        GenericClass<String> s = new GenericClass<>("ABC");
        GenericClass<Integer> n = new GenericClass<>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }

    static class GenericClass<T> {
        private T xyz;

        public GenericClass(T t) {
            this.xyz = t;
        }

        public T getXyz() {
            return this.xyz;
        }
    }
}
