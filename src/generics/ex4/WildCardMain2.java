package generics.ex4;

import generics.animal.Animal;
import generics.animal.Cat;
import generics.animal.Dog;

public class WildCardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox); // compile error
//        writeBox(catBox); // compile error

        Object object = objBox.get();
        System.out.println(object);
        Animal animal = animalBox.get();
        System.out.println(animal);
    }

    // parameter로 Animal 보다 상위의 객체만 받을 수 있음
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 200));
    }
}
