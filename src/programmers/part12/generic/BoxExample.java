package programmers.part12.generic;

public class BoxExample {
    public static void main(String[] args) {
        Box box = new Box();

        box.setObj(new Object());
        Object obj = box.getObj();

        box.setObj("Hello");
        String str = (String) box.getObj(); // String 타입으로 형변환이 필요함
        System.out.println(str);

        box.setObj(1);
        int value = (int) box.getObj(); // int 타입으로 형변환이 필요함
        System.out.println(value);
    }
}
