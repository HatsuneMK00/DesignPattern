package xyz.makise.builder;

class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Product aTypeConcreteProduct1 = director.getATypeConcreteProduct1();
        aTypeConcreteProduct1.templateMethod();
        Product bTypeConcreteProduct2 = director.getBTypeConcreteProduct2();
        bTypeConcreteProduct2.templateMethod();
    }
}
