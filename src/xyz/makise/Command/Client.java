package xyz.makise.Command;

class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command command1 = new ConcreteCommand1();
        invoker.setCommand(command1);
        invoker.action();
        Command command3 = new ConcreteCommand3();
        invoker.setCommand(command3);
        invoker.action();
    }
}
