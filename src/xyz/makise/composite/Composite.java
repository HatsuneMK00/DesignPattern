package xyz.makise.composite;

import java.util.ArrayList;
import java.util.List;

/*
* 树形结构中的组合节点
* */
public class Composite extends Component {
    private ArrayList<Component> childComponents = new ArrayList<>();

    @Override
    List getChildren() {
        return childComponents;
    }

    @Override
    void addComponent(Component component) {
        component.setParent(this);
        childComponents.add(component);
    }

    @Override
    void removeComponent(Component component) {
        component.setParent(null);
        childComponents.remove(component);
    }

    /*
    * 在组合节点（中间节点）可以有自己的操作
    * */
    @Override
    void operation() {
        /*
        * 可以在这里先写上组合节点自己的operation，再遍历所有的孩子节点
        * */
        for (Component component:childComponents
             ) {
            component.operation();
        }
    }
}
