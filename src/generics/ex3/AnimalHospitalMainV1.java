package generics.ex3;

import generics.animal.Cat;
import generics.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 300);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();

//        dogHospital.set(cat); // compile error!!
        
        dogHospital.set(dog);
        Dog dog2 = dogHospital.bigger(new Dog("dog2", 200));
        System.out.println("biggerDog: " + dog2);
    }
}
