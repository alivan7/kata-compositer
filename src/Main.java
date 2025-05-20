import kata1.File;
import kata1.Folder;
import kata2.Menu;
import kata2.MenuItem;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file1.txt", 200);


        Folder folder  = new Folder("Documentos");
        folder.addComponent(file1);
        folder.addComponent(file2);

        folder.showDetails("");

        MenuItem menuItem1 = new MenuItem("Pique Macho", 35);
        MenuItem menuItem2 = new MenuItem("Sopa de Mani", 20);
        MenuItem menuItem3 = new MenuItem("Mocochinchi", 2.5);

        Menu almuerzo = new Menu("Almuerzo Familiar");
        almuerzo.add(menuItem1);
        almuerzo.add(menuItem2);
        almuerzo.add(menuItem3);

        almuerzo.showDetails("");

    }
}