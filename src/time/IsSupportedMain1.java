package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int minute = now.get(
            ChronoField.SECOND_OF_MINUTE); // Unsupported field 발생!!. LocalDate 클래스는 년,월,일만 지원하므로 SECOND_OF_MINUTE 필드 조히하려고 하면 에러 발생
        System.out.println("minute = " + minute);
    }
}
