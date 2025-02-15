package collection.set;

public class StringHashMain {

    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char chA = 'A';
        char chB = 'B';
        System.out.println("charA = " + (int) chA);
        System.out.println("charB = " + (int) chB);

        int hashCode = hashCode("A");
        System.out.println("hasCode('A') = " + hashCode);
        int hashCodeB = hashCode("B");
        System.out.println("hasCode('B') = " + hashCodeB);

        int hashIndex = hashIndex(hashCode);
        System.out.println("hashIndex('A') = " + hashIndex);
    }

    private static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    private static int hashIndex(int hashCode) {
        return hashCode % CAPACITY;
    }
}
