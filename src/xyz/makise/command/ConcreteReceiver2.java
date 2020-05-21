package xyz.makise.command;

class ConcreteReceiver2 extends Receiver{
    @Override
    void doSomething() {
        System.out.println("Receiver2 doing something");
    }

    @Override
    void doOtherThing() {
        System.out.println("Receiver2 doing other thing");
    }
}
