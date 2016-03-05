package eca.patterns.composite;

/**
 * The client manipulates objects in the hierarchy using the component interface.
 */
public class Client {

    private final Component component;

    public Client(Component component) {
        this.component = component;
    }

    public void operation() {
        component.doOperation();
    }

}
