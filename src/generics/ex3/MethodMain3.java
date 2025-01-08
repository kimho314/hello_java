package generics.ex3;

import generics.animal.Cat;
import generics.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("dog", 100);
        Cat cat = new Cat("cat", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat: " + returnCat);
    }
}
