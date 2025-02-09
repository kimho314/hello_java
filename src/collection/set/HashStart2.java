package collection.set;

import java.util.Arrays;

public class HashStart2 {

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[100];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
    }
}
