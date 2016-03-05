package eca.patterns.composite;

/**
 * Component is the abstraction for leafs and composites.
 * It defines the interface that must be implemented by the objects in the composition.
 * For example a file system resource defines move, copy, rename, and getSize methods for files and folders.
 */
public interface Component {

    void doOperation();

}
