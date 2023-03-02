package stack;

public class Set<T> {
    SetElement<T> head;

    boolean add(T item) {
        if (!contains(item)) {
            SetElement<T> newSetElement = new SetElement<T>(item, head);
            head = newSetElement;
            return true;
        }
        return false;
    }

    boolean contains(T item) {
        SetElement<T> current = head;
        while (current != null) {
            if (current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    boolean remove(T item) {
        if (head == null) {
            return false;
        }
        if (head.value == item) {
            head = head.next;
            return true;
        }
        SetElement<T> current = head;
        while (current.next != null) {
            if (current.next.value == item) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
