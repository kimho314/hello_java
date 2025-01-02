package lang.string;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat(" java");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
    }
}
