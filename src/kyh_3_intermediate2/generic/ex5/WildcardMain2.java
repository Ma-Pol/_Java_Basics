package kyh_3_intermediate2.generic.ex5;

import kyh_3_intermediate2.generic.animal.Animal;
import kyh_3_intermediate2.generic.animal.Cat;
import kyh_3_intermediate2.generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox); // 하한이 Animal 이므로 Dog 대입 불가
//        writeBox(catBox); // 하한이 Animal 이므로 Cat 대입 불가

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    // 와일드카드는 상한(extends) 뿐만 아니라 하한(super)도 지정할 수 있다.
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
