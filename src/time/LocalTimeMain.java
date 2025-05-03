package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime localTime = LocalTime.of(10, 20, 10);
        System.out.println(now);
        System.out.println(localTime);

        LocalTime localTime2 = localTime.plusSeconds(30);
        System.out.println(localTime2);
    }
}
