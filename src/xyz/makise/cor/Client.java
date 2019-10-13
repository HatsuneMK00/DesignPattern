package xyz.makise.cor;

import java.util.HashMap;

//如果在web里面的话 这个Client一般就应该是Controller了吧
class Client {
    public static void main(String[] args) {
        Request request = new Request();
        HashMap<String, Object> map = new HashMap<>();
//        其实请求等级也可以封装在map里
        request.setRequestContent(map);
        request.setLevel(2);
//        一般不由Client这个高层模块设置责任链 而是将责任链封装起来 直接返回第一个处理者给Client
//        Handler handler1 = new ConcreteHandler1();
//        Handler handler2 = new ConcreteHandler2();
//        Handler handler3 = new ConcreteHandler3();
//        handler1.setNextHandler(handler3);
//        handler3.setNextHandler(handler2);
//        Response response = handler1.handleRequest(request);
        COR cor = new COR();
        Handler handler = cor.construct(null);
//        看起来只有一个handler类 实际上是一个处理类链哒
//        实现了对Client的隐藏 同时有很高的可扩展性
        Response response = handler.handleRequest(request);
    }
}
