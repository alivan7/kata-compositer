package kata2;

public class MenuItem implements MenuComponent{
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Plato: " + name + ", Precio: " + price  + "Bs.");
    }
}
