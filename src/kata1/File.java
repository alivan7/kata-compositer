package kata1;

public class File implements FileSystemComponent{
    private int size;
    private String name;

    public File(String name, int size) {
        this.size = size;
        this.name = name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Archivo: " + this.name + ", Tamaño: " + this.size + "KB");
    }
}
