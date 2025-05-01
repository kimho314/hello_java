package lang.enums;

public class EnumMethodMain {

    public static void main(String[] args) {
        //모든 enum 반환
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            System.out.println("name= " + grade.name() + ", ordinal=" + grade.ordinal());
        }

        //String -> ENUM 변환
        String input = "GOLD";
        Grade grade = Grade.valueOf(input);
        System.out.println(grade);
    }
}
