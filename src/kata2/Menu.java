package kata2;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent{
    private String name;
    private List<MenuComponent> components;

    public Menu(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public double getPrice() {
        return components.stream().mapToDouble(MenuComponent::getPrice).sum();
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Menú: " + this.name + ", Precio Total:" + getPrice() + "Bs.");
        for (MenuComponent component : components) {
            component.showDetails(indent + "  ");
        }
    }
    public void add(MenuComponent component) {
        components.add(component);
    }
}
