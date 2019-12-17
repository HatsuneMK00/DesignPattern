package xyz.makise.command;

class ConcreteReceiver1 extends Receiver{
    @Override
    void doSomething() {
        System.out.println("Receiver1 doing something");
    }

    @Override
    void doOtherThing() {
        System.out.println("Receiver1 doing other thing");
    }
}
