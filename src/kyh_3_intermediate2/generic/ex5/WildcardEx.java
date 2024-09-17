package kyh_3_intermediate2.generic.ex5;

import kyh_3_intermediate2.generic.animal.Animal;

public class WildcardEx {
    // 이것은 제네릭 메서드이다.
    // Box<Dog> dogBox를 전달한다. 타입 추론에 의해 T는 Dog가 된다.
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 이것은 제네릭 메서드가 아닌, 일반적인 메서드이다.
    // Box<Dog> dogBox를 전달한다. 와일드카드 ?는 모든 타입을 받을 수 있다.
    // ※ 와일드카드는 "타입이 확정된 특정 제네릭 타입"을 매개변수로 지정할 때 사용한다.
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    // 매개변수 타입과 반환 타입이 동일해야 하는 경우에는 제네릭 메서드를 사용한다.
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    // 와일드카드를 사용한 일반 메서드의 경우,
    // 매개변수 타입과 반환 타입을 명확히 동일하게 만드는 것이 불가능하다.
    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
