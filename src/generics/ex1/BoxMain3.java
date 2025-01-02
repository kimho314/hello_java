package generics.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시점에 T의 타입 결정
        integerBox.setValue(10);
        Integer value = integerBox.getValue(); // no need to down casting
        System.out.println("value = " + value);


        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("hello");
        String value2 = stringBox.getValue();
        System.out.println("value2 = " + value2);
    }
}
