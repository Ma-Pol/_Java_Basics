package programmers.part08.inner_class;

public class InnerClassExample {
    // 내부 클래스 1
    // 중첩 클래스 또는 instance 클래스
    private class Cal {
        int value = 0;

        public void plus() {
            value++;
        }
    }

    // 내부 클래스 2
    // 정적 중첩 클래스 또는 static 클래스
    private static class Cal2 {
        int value = 0;

        public void plus() {
            value++;
        }
    }

    // 내부 클래스 3
    // 지역 중첩 클래스 또는 local 클래스
    public void method() {
        class Cal3 {
            int value = 0;

            public void plus() {
                value++;
            }
        }

        Cal3 cal3 = new Cal3();
        cal3.plus();
        System.out.println(cal3.value);
    }

    public static void main(String[] args) {
        // 내부 클래스 1
        InnerClassExample ice = new InnerClassExample();
        InnerClassExample.Cal cal = ice.new Cal(); // InnerClassExample 클래스 내 Cal 클래스의 인스턴스 생성

        cal.plus();
        System.out.println(cal.value);

        System.out.println("=====================================");

        // 내부 클래스 2
        InnerClassExample.Cal2 cal2 = new InnerClassExample.Cal2(); // InnerClassExample 클래스 내 Cal2 클래스의 인스턴스 생성

        cal2.plus();
        System.out.println(cal2.value);

        System.out.println("=====================================");

        // 내부 클래스 3
        ice.method(); // method() 메서드 호출(직접 해당 메서드 내의 내부 클래스를 불러오는 것은 불가능)
    }
}
