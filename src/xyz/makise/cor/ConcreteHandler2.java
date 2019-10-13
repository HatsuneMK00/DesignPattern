package xyz.makise.cor;

public class ConcreteHandler2 extends Handler {
    @Override
    protected int getHandlerLevel() {
        return 2;
    }

    @Override
    protected Response echo(Request request) {
        Response response = new Response();
        System.out.println("Handler2 handling request");
        return response;
    }
}
