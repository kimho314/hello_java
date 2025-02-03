package clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<String> stringClass = String.class;
//        Class<? extends String> stringClass2 = new String().getClass();
//        Class<?> stringClass3 = Class.forName("java.lang.String");

        Field[] fields = stringClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        Method[] methods = stringClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        System.out.println("Superclass: " + stringClass.getSuperclass().getName());

        Class<?>[] interfaces = stringClass.getInterfaces();
        for (Class<?> interfaceClass : interfaces) {
            System.out.println("interface = " + interfaceClass);
        }

        System.out.println("===============");
        Name name = new Name("hoseop");
        Field[] recordFields = name.getClass().getDeclaredFields();
        for (Field f : recordFields) {
            System.out.println("field = " + f);
        }
    }

    static record Name(String name) {

    }
}
