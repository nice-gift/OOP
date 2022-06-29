package model.container;

public abstract class AbstractContainer implements Container {
    boolean isEmpty() {
        return size() == 0;
    }
}
