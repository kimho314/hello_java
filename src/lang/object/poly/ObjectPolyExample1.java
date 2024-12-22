package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj){
        switch(obj){
            case Car car -> car.move();
            case Dog dog -> dog.sound();
            default -> throw new IllegalStateException("Unexpected value: " + obj);
        }
    }
}
