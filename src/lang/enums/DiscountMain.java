package lang.enums;

import java.util.Arrays;

public class DiscountMain {

    public static void main(String[] args) {
        int price = 10_000;

//        printDiscount(GradeV2.BASIC, price);
//        printDiscount(GradeV2.GOLD, price);
//        printDiscount(GradeV2.DIAMOND, price);

        Arrays.stream(GradeV2.values())
            .forEach(grade -> printDiscount(grade, price));
    }

    public static void printDiscount(GradeV2 grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
