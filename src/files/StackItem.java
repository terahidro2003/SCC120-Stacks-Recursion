package files;

public class StackItem {
    File file;
    int indent;

    public StackItem(File file, int indent)
    {
        this.file = file;
        this.indent = indent;
    }

    public StackItem()
    {

    }
}
