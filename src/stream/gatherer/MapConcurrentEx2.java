package stream.gatherer;

import java.util.List;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class MapConcurrentEx2 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        List<Integer> list = Stream.of(1, 2, 10, 20, 30, 40)
            .gather(
                Gatherers.mapConcurrent(5, n -> {
                    try {
                        Thread.sleep(n * 1000);
                    } catch (InterruptedException e) {
                        System.out.println("Task  " + n + " was interrupted");
                        Thread.currentThread().interrupt();
                    }
                    return n;
                })
            )
            .limit(3)
            .toList();

        long end = System.currentTimeMillis();
        System.out.println("duration = " + (end - start) + " millis." + list);
    }
}
