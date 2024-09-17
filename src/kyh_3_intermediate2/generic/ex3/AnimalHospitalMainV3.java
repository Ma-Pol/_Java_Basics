package kyh_3_intermediate2.generic.ex3;

import kyh_3_intermediate2.generic.animal.Cat;
import kyh_3_intermediate2.generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        // 타입 매개변수 제한을 통해 원하는 타입만 인자로 전달할 수 있다.
//        AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>(); // 컴파일 오류 발생
//        AnimalHospitalV3<Object> objectHospital = new AnimalHospitalV3<>(); // 컴파일 오류 발생

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1 해결: 개 병원에 고양이 전달
//        dogHospital.set(cat); // 다른 타입 입력: 컴파일 오류

        // 문제2 해결: 개 타입 변환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
