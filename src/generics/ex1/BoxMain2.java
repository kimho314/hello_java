package generics.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox ingerBox = new ObjectBox();
        ingerBox.setValue(10);
        Object value = ingerBox.getValue();
        Integer integer = (Integer) value;
        System.out.println("integer = " + integer);


        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String str = (String) stringBox.getValue();
        System.out.println("str = " + str);

        ObjectBox ingerBox2 = new ObjectBox();
        ingerBox2.setValue(10);
        Object value2 = ingerBox2.getValue();
        String str2 = (String) value2; // ClassCastException 발생
        System.out.println("Str2 = " + str2);
    }
}
