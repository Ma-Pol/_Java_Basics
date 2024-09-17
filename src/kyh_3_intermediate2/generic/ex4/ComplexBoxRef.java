package kyh_3_intermediate2.generic.ex4;

import kyh_3_intermediate2.generic.animal.Animal;

public class ComplexBoxRef<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + z.getClass().getName());
//        z.getName(); // 호출 불가. 매개변수는 <Z> 타입이다. <T extends Animal> 타입이 아니다.

        return z;
    }
}
