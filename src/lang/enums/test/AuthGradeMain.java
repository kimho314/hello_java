package lang.enums.test;

import java.util.Arrays;

public class AuthGradeMain {

    public static void main(String[] args) {
        Arrays.stream(AuthGrade.values())
            .forEach(System.out::println);
    }
}
