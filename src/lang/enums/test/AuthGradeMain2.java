package lang.enums.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AuthGradeMain2 {

    public static void main(String[] args) throws IOException {
        printInputGrade();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        AuthGrade grade = AuthGrade.valueOf(str);
        printYourAuthGrade(grade);
        printMenu(grade);
    }

    private static void printMenu(AuthGrade grade) {
        System.out.println("==메뉴 목록==");
        switch (grade) {
            case GUEST -> System.out.println("- 메인 화면");
            case LOGIN -> System.out.println("- 메인 화면\n- 이메일 관리 화면");
            case ADMIN -> System.out.println("- 메인 화면\n- 이메일 관리 화면\n- 관리자 화면");
        }
    }

    private static void printYourAuthGrade(AuthGrade grade) {
        System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");
    }

    private static void printInputGrade() {
        StringBuilder sb = new StringBuilder();
        sb.append("당신의 등급을 입력하세요[");
        String join = Arrays.stream(AuthGrade.values())
            .map(Enum::name)
            .collect(Collectors.joining(", "));
        sb.append(join);
        sb.append("]").append(": ");
        System.out.println(sb);
    }
}
