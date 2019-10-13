package xyz.makise.cor;

public class ConcreteHandler1 extends Handler {
    @Override
    protected int getHandlerLevel() {
        return 1;
    }

    @Override
    protected Response echo(Request request) {
        Response response = new Response();
        System.out.println("Handler1 handling request");
        return response;
    }
}
