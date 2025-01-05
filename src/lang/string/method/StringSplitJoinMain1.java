package lang.string.method;

public class StringSplitJoinMain1 {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orage";

        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        System.out.println();

        String joined = String.join(",", split);
        System.out.println(joined);
        String joined2 = String.join("+", "A", "B", "C");
        System.out.println(joined2);
    }
}
