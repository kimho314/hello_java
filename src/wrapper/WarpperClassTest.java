package wrapper;

public class WarpperClassTest {

    public static void main(String[] args) {
        Integer int1 = Integer.valueOf(10);
        Integer int2 = Integer.valueOf(20); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변

        System.out.println(int1.equals(int2));

        System.out.println(int1.intValue());
        System.out.println(int2.intValue());
    }

}
