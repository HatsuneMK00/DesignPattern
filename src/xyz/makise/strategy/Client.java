package xyz.makise.strategy;

class Client {
    public static void main(String[] args) {
        Strategy1 strategy1 = new Strategy1();
        Context context = new Context(strategy1);
        context.exec();
    }
}
