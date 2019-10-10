package xyz.makise.Command;

//具体Receiver类是有限的 因为实际做事的人有限
abstract class Receiver {
    abstract void doSomething();
    abstract void doOtherThing();
}
