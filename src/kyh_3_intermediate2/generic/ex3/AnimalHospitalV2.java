package kyh_3_intermediate2.generic.ex3;

import kyh_3_intermediate2.generic.animal.Animal;

public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        animal.toString();
        animal.equals(null);
        // 컴파일 오류 발생. T의 타입을 메서드 정의 시점에서는 확인할 수 없음.
        // => Object의 기능만 사용할 수 있다.
//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 크기: " + animal.getSize());
//        animal.sound();
    }

    public T getBigger(Animal target) {
        // 컴파일 오류 발생
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
