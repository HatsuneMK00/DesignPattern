package xyz.makise.composite;

/*
 * 虽然父类中有getChildren,addComponent等方法，但是对于Leaf叶子节点来说并没有什么用
 * */
public class Leaf extends Component {
    @Override
    void operation() {
        /*
        * 叶子节点需要做的操作 显示也可以 或其他什么也行
        * */
    }
}
