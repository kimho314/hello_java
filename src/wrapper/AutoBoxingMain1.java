package wrapper;

public class AutoBoxingMain1 {

    public static void main(String[] args) {
        int value = 7;
        Integer integer = Integer.valueOf(value); // boxed

        int int1 = integer.intValue(); // unboxed

        System.out.println("boxed value = " + integer);
        System.out.println("unboxed value = " + int1);

        System.out.println("=======================");

        int value2 = 7;
        Integer integer2 = value; // auto boxing

        int int2 = integer; // auto unboxing

        System.out.println("auto boxing value = " + integer2);
        System.out.println("auto unboxing value = " + int2);
    }
}
