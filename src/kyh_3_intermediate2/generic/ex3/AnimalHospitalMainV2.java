package kyh_3_intermediate2.generic.ex3;

import kyh_3_intermediate2.generic.animal.Cat;
import kyh_3_intermediate2.generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        // 문제사항: Animal 또는 그 자식 타입 뿐만 아니라 전혀 상관없는 타입 또한 사용할 수 있다.
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}
