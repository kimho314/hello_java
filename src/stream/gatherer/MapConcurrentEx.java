package stream.gatherer;

import java.util.List;
import java.util.stream.Gatherers;

public class MapConcurrentEx {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> list = Constants.numbers.stream()
            .gather(Gatherers.mapConcurrent(1, number -> number * 2))
            .toList();
        long end = System.currentTimeMillis();
        System.out.println("duration = " + (end - start) + " millis." + list);

        System.out.println();
        start = System.currentTimeMillis();
        List<Integer> list2 = Constants.numbers.stream()
            .gather(Gatherers.mapConcurrent(3, number -> number * 2))
            .toList();
        end = System.currentTimeMillis();
        System.out.println("duration = " + (end - start) + " millis." + list2);
    }
}
