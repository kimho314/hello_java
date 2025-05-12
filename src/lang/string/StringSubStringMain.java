package lang.string;

public class StringSubStringMain {

    public static void main(String[] args) {
        System.out.println("unhappy".substring(2));
        System.out.println("Harbison".substring(3));
        System.out.println("emptiness".substring(9));
//        System.out.println("emptiness".substring(10)); //.StringIndexOutOfBoundsException occurs
        System.out.println("123".substring(2));
    }
}
