package kyh_3_intermediate2.generic.ex3;

import kyh_3_intermediate2.generic.animal.Animal;

// 타입 매개변수를 특정 타입으로 제한할 수 있다.
public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
