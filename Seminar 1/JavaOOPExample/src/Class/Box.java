package Class;

public class Box<E, V> {
    private E[] contents;
    private V amount;

    public Box(E[] contents, V amount) {
        this.contents = contents;
        this.amount = amount;
    }

    public E[] getContents() {
        return this.contents;
    }

    public V getAmount() {
        return this.amount;
    }
}
