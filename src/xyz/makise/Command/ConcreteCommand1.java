package xyz.makise.Command;

public class ConcreteCommand1 extends Command {
//    这里可以通过构造函数传默认的Receiver类对象来实现与Client上层类完全解耦
//    或者不完全解耦 由高层调用者把需要的Receiver传进来也行
    @Override
    void execute() {
        super.concreteReceiver1.doSomething();
        super.concreteReceiver2.doSomething();
    }
}
