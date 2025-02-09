package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets(DEFAULT_INITIAL_CAPACITY);
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets(capacity);
    }

    private void initBuckets(int capacity) {
        this.buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        this.size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean remove = bucket.remove(Integer.valueOf(value));
        if (remove) {
            size--;
            return true;
        } else {
            return false;
        }
    }


    private int hashIndex(int value) {
        return value % this.capacity;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
            "buckets=" + Arrays.toString(buckets) +
            ", size=" + size +
            ", capacity=" + capacity +
            '}';
    }
}
