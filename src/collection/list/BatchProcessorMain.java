package collection.list;

import java.util.LinkedList;
import java.util.List;

public class BatchProcessorMain {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(); // 602ms
        List<Integer> list = new LinkedList<>(); // 8ms

        BatchProcessor batchProcessor = new BatchProcessor(list);
        batchProcessor.logic(100_000);
    }

}
