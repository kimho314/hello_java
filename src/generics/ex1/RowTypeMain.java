package generics.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        // GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.setValue(10);
        Object value = integerBox.getValue();
        Integer integer = (Integer) value;
        System.out.println("integer = " + integer);
    }
}
