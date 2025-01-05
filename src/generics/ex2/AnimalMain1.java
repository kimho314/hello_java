package generics.ex2;

import generics.animal.Animal;
import generics.animal.Cat;
import generics.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("doggy", 100);
        Cat kitty = new Cat("kitty", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog foundDog = dogBox.get();
        System.out.println("foundDog: " + foundDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(kitty);
        Cat foundCat = catBox.get();
        System.out.println("foundCat: " + foundCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal foundAnimal = animalBox.get();
        System.out.println("foundAnimal: " + foundAnimal);
    }
}
