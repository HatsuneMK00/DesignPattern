package xyz.makise.command;

abstract class Command {
//    这边直接在基类里依赖所有具体的Receiver类（执行者类）
//    可以考虑依赖具体类还是依赖抽象类
//    感觉上依赖抽象类更好一些 因为具体的Receiver类都是做事的没有什么属性
//    但是具体类可以多一些个性方法 虽然不符合契约但是反正也封装起来了
//    Command类可能有N个实现类 也是这个模式的缺点之一 即具体Command类可能会膨胀的很大 每一个指令都封装为了一个类
//    为的是避免命令字符串解析 也方便扩展
    ConcreteReceiver1 concreteReceiver1 = new ConcreteReceiver1();
    ConcreteReceiver2 concreteReceiver2 = new ConcreteReceiver2();
    abstract void execute();
}
