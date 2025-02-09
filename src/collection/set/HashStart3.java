package collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashStart3 {

    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        List<Integer> inputs = new ArrayList<>();
        inputs.add(1);
        inputs.add(2);
        inputs.add(5);
        inputs.add(8);
        inputs.add(14);
        inputs.add(99);
        Integer[] inputArray = new Integer[CAPACITY];
        for (Integer elem : inputs) {
            add(inputArray, elem);
        }
        System.out.println("inputArray = " + Arrays.toString(inputArray));
    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
