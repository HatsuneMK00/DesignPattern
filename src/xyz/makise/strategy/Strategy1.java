package xyz.makise.strategy;

class Strategy1 implements IStrategy {
    @Override
    public void exec() {
        System.out.println("Strategy1 doing something");
    }
}
