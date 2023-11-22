package programmers.part12.generic;

public class BoxGenericExample {
    public static void main(String[] args) {
        BoxGeneric<String> box1 = new BoxGeneric<String>();

        box1.setObj("hello");
        String str = box1.getObj(); // 형변환 생략 가능
        System.out.println(str);


        BoxGeneric<Integer> box2 = new BoxGeneric<Integer>();

        box2.setObj(6);
        int value = box2.getObj(); // 형변환 생략 가능
        System.out.println(value);
    }
}
