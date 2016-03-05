package eca.patterns.composite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClientTest {

    private Composite subComponent;
    private Composite component;
    private Client client;

    @BeforeMethod
    public void setUp() throws Exception {
        subComponent = new Composite();
        subComponent.addComponent(new Leaf());

        component = new Composite();
        component.addComponent(subComponent);
        component.addComponent(new Leaf());

        client = new Client(component);
    }

    @Test
    public void operation() throws Exception {
        client.operation();
    }

    @Test
    public void operation_withRemoveSubComponentLeaf() throws Exception {
        Component leafOfSubComponent = subComponent.getChild(0);
        subComponent.removeComponent(leafOfSubComponent);
        client.operation();
    }
}