package files;

public class File {
    String name;
    String path;
    boolean isDirectory;

    public File(String name, String path, boolean isDir)
    {
        this.name = name;
        this.path = path;
        isDirectory = isDir;
    }

    public File()
    {

    }
}
