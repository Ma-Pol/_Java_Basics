package kyh_3_intermediate2.generic.ex2;

import kyh_3_intermediate2.generic.animal.Animal;
import kyh_3_intermediate2.generic.animal.Cat;
import kyh_3_intermediate2.generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("돔울", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog); // Animal = Dog
        animalBox.set(cat); // Animal = Cat
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
