package lang.enums.test.http;

import java.util.Arrays;

public class HttpStatusMain1 {

    public static void main(String[] args) {
        Arrays.stream(HttpStatus.values())
            .forEach(System.out::println);
    }
}
