package stack;

public class SetElement<T> {
    T value;
    SetElement<T> next;

    public SetElement(T value, SetElement<T> next) {
        this.value = value;
        this.next = next;
    }
}
