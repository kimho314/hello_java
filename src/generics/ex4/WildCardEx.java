package generics.ex4;

import generics.animal.Animal;

public class WildCardEx {
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("name = " + t.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("name = " + t.getName());
        return t;
    }

    // 제네릭 메서드가 아니다. 일반적인 메서드이다.
    // 와일드카드 ?는 모든 타입을 받을 수 있다.
    //Box<Dog>, Box<Cat>, Box<Object>
    static void printWildCardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static void printWildCardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("?.name = " + animal.getName());
    }

    static Animal printAndReturnWildCard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("name = " + animal.getName());
        return animal;
    }
}
