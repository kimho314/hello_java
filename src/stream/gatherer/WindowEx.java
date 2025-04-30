package stream.gatherer;

import java.util.List;
import java.util.stream.Gatherers;

public class WindowEx {

    public static void main(String[] args) {
        List<List<Integer>> windows = Constants.numbers.stream()
            .gather(Gatherers.windowFixed(2))
            .toList();

        System.out.println(windows);
    }
}
