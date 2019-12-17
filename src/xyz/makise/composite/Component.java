package xyz.makise.composite;

import java.util.List;

abstract class Component {
    /*
     * �ṩһ��parentָ���丸�ڵ㣬����ʵ�������νṹ���Ե����ϵķ���
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
