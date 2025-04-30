package stream.gatherer;

import java.util.List;
import java.util.stream.Gatherers;

public class ScanEx {

    public static void main(String[] args) {
        List<Integer> list = Constants.numbers.stream()
            .gather(Gatherers.scan(() -> 4, Integer::sum))
            .toList();
        System.out.println(list);
    }
}
