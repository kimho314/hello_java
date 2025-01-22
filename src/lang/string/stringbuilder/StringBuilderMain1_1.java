package lang.string.stringbuilder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        System.out.println("sb = " + sb);

        sb.insert(3, "Java");
        System.out.println("insert = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);
    }
}
