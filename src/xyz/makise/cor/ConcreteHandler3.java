package xyz.makise.cor;

public class ConcreteHandler3 extends Handler {
    @Override
    protected int getHandlerLevel() {
        return 3;
    }

    @Override
    protected Response echo(Request request) {
        Response response = new Response();
        System.out.println("Handler3 handling request");
        return response;
    }
}
