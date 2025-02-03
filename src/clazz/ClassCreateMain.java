package clazz;

public class ClassCreateMain {

    public static void main(String[] args)
        throws Exception {
        Class<Hello> helloClass = Hello.class;
//        Class<?> helloClass2 = Class.forName("lang.class.Hello");

        Hello hello = helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result " + result);

        
    }
}
