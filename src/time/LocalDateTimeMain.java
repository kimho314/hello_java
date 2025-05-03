package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(2023, 10, 21, 10, 20, 10);
        System.out.println(now);
        System.out.println(localDateTime);

        System.out.println("====================");
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);

        System.out.println("====================");
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime2);

        System.out.println("====================");
        LocalDateTime localDateTime3 = localDateTime2.plusDays(100);
        System.out.println(localDateTime3);

        System.out.println();
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인지? " + now.isBefore(localDateTime));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인지? " + now.isAfter(localDateTime));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 같은가? " + now.isEqual(localDateTime));
    }
}
