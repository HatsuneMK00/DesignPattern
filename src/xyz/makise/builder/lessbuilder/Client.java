package xyz.makise.builder.lessbuilder;

class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Product aTypeConcreteProduct1 = builder.getATypeConcreteProduct1();
        aTypeConcreteProduct1.templateMethod();
        Product bTypeConcreteProduct2 = builder.getBTypeConcreteProduct2();
        bTypeConcreteProduct2.templateMethod();
    }
}
