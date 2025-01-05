package generics.ex2;

import generics.animal.Animal;
import generics.animal.Cat;
import generics.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("doggy", 100);
        Cat kitty = new Cat("kitty", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(kitty);

        Animal animal1 = animalBox.get();
        System.out.println("animal1: " + animal1);
        animal1.sound();
    }
}
