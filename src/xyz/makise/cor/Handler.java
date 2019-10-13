package xyz.makise.cor;

//责任链模式
//感觉是对if else语句的抽象
//通过责任链模式实现了开闭原则 单一职责 迪米特法则等重要原则 是一个重要但是不太难的模式
//组成责任链的处理者链使用了模板方法模式
abstract class Handler {
    private Handler nextHandler = null;
//    这里可以不写死一个成员变量 而是通过一个需要实现类实现的抽象方法来实现不同子类不同处理级别
//    private int level;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public Response handleRequest(Request request) {
        Response response = null;
//        注意这里如果level是对象的话 使用equal方法
        if (request.getRequestLevel() == this.getHandlerLevel()) {
            response = this.echo(request);
        } else {
            if (nextHandler != null) {
                System.out.println(this.getClass().getName() + " dispatcher");
                response = nextHandler.handleRequest(request);
            } else {
//                没有处理者时的处理逻辑
            }
        }
        return response;
    }

    abstract protected int getHandlerLevel();

    abstract protected Response echo(Request request);
}
