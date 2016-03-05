package eca.patterns.composite;

/**
 * Leafs are objects that have no children.
 * They implement services described by the Component interface.
 * For example a file object implements move, copy, rename, as well as getSize methods which are related to the Component interface.
 */
public class Leaf implements Component{

    public void doOperation() {
        System.out.println("Last element in the tree");
    }
}
