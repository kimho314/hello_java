package collection.list;

import java.util.List;

public class BatchProcessor {

    private final List<Integer> list;

    public BatchProcessor(List<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.addFirst(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("size: " + size + ", duration: " + (endTime - startTime) + "ms");
    }
}
