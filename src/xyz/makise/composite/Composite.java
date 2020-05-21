package xyz.makise.composite;

import java.util.ArrayList;
import java.util.List;

/*
* ���νṹ�е���Ͻڵ�
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
    * ����Ͻڵ㣨�м�ڵ㣩�������Լ��Ĳ���
    * */
    @Override
    void operation() {
        /*
        * ������������д����Ͻڵ��Լ���operation���ٱ������еĺ��ӽڵ�
        * */
        for (Component component:childComponents
             ) {
            component.operation();
        }
    }
}
