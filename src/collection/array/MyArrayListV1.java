package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elements;
    private int size = 0;

    public MyArrayListV1() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }

    public int size() {
        return this.size;
    }

    public void add(Object o) {
        this.elements[this.size] = o;
        this.size++;
    }

    public Object get(int idx) {
        return this.elements[idx];
    }

    public Object set(int index, Object o) {
        Object old = get(index);
        this.elements[index] = o;
        return old;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(this.elements, this.size)) +
                " size=" + this.size + ", capacity=" + this.elements.length;
    }
}
