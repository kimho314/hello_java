package generics.container;

public class Container<T> {
    private T item;

    public Container() {
        this(null);
    }

    public Container(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public boolean isEmpty() {
        return this.item == null;
    }
}
