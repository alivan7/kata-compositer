package kata1;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return children.stream().mapToInt(FileSystemComponent::getSize).sum();
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Carpeta: " + this.name + ", Tamaño Total: " + getSize() + "KB");
        for (FileSystemComponent component : children) {
            component.showDetails(indent + "  ");
        }
    }
    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }
}
