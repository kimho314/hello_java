package generics.ex3;

public class GenericMethod {
    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("Object print: " + t);
        return t;
    }
}
