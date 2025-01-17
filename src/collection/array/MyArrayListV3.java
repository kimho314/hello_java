package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elements;
    private int size = 0;

    public MyArrayListV3() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }

    public int size() {
        return this.size;
    }

    public void add(int index, Object o) {
        if (size == elements.length) {
            grow();
        }
        shiftRightFrom(index);
        this.elements[index] = o;
        this.size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
    }

    public void add(Object o) {
        if (size == elements.length) {
            grow();
        }
        this.elements[this.size] = o;
        this.size++;
    }

    private void grow() {
        int oldCapacity = this.elements.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        this.elements = Arrays.copyOf(elements, newCapacity);
    }

    public Object get(int idx) {
        return this.elements[idx];
    }

    public Object set(int index, Object o) {
        Object old = get(index);
        this.elements[index] = o;
        return old;
    }

    public Object remove(int index) {
        Object oldValue = get(index);
        shiftLeftFrom(index);

        this.size--;
        this.elements[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
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
