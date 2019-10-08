package xyz.makise.builder.lessbuilder;

class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder aTypeConcreteBuilder1 = director.getATypeConcreteProduct1();
        aTypeConcreteBuilder1.templateMethod();
        Builder bTypeConcreteBuilder2 = director.getBTypeConcreteProduct2();
        bTypeConcreteBuilder2.templateMethod();
    }
}
