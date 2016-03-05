package eca.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * A Composite stores child components in addition to implementing methods defined by the component interface.
 * Composites implement methods defined in the Component interface by delegating to child components.
 * In addition composites provide additional methods for adding, removing, as well as getting components.
 */
public class Composite implements Component {

    private List<Component> child = new ArrayList<Component>();

    public void doOperation() {
        for (Component component : child) {
            component.doOperation();
        }
    }

    public void addComponent(Component component) {
        child.add(component);
    }

    public void removeComponent(Component component) {
        child.remove(component);
    }

    public Component getChild(int index) {
        return child.get(index);
    }

}
