package generics.ex4;

import generics.animal.Animal;
import generics.animal.Cat;
import generics.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printAndReturnGeneric(dogBox);
        WildCardEx.printWildCardV1(dogBox);
        WildCardEx.printWildCardV2(dogBox);
        Animal animal = WildCardEx.printAndReturnWildCard(dogBox);
    }
}
