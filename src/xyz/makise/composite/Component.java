package xyz.makise.composite;

import java.util.List;

abstract class Component {
    /*
     * 提供一个parent指向其父节点，可以实现在树形结构上自底向上的访问
     * */
    private Component parent;

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }
    
    abstract void operation();

    List getChildren(){
        return null;
    }

    void addComponent(Component component){}

    void removeComponent(Component component){}
}
