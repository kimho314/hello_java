package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate localDate = LocalDate.of(2023, 10, 21);
        System.out.println(localDate);

        LocalDate plusDays = localDate.plusDays(1);
        System.out.println(plusDays);
    }
}
