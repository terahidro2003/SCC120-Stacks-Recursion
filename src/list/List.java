package list;

public class List {
    ListElement head;

    public List(){
        head = null;
    }

    public void append(Object value)
    {
        ListElement el = new ListElement();
        el.data = value;
        if(head == null)
        {
            head = el;
            el.next = null;
            return;
        }

        ListElement current = new ListElement();
        current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = el;
    }

    public void print()
    {
        printRecursive(head);
    }

    private void printRecursive(ListElement el)
    {
        System.out.println(el.data);
        el = el.next;
        if(el == null) return;
        else printRecursive(el);
    }
}
