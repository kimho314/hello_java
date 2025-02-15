package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets(DEFAULT_INITIAL_CAPACITY);
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets(capacity);
    }

    private void initBuckets(int capacity) {
        this.buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        this.size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean remove = bucket.remove(value);
        if (remove) {
            size--;
            return true;
        } else {
            return false;
        }
    }


    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
            "buckets=" + Arrays.toString(buckets) +
            ", size=" + size +
            ", capacity=" + capacity +
            '}';
    }
}
