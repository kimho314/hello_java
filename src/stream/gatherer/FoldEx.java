package stream.gatherer;

import java.util.List;
import java.util.stream.Gatherers;

public class FoldEx {

    public static void main(String[] args) {
        List<String> list = Constants.numbers.stream()
            .gather(Gatherers.fold(() -> "", (string, number) -> string + "/" + number))
            .toList();
        System.out.println(list);
    }
}
