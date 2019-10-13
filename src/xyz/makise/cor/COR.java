package xyz.makise.cor;

import java.util.ArrayList;

//这其实就是个中介者
//如果想要把责任链的装配暴露给外面 可以用一个（伪）建造者模式！

class COR {
//    只有一个construct函数了 这个也可以省略掉
//    private Handler handler1;
//    这两个依赖其实可以不要 保留一个头指针指向第一个处理者对象即可

//    使用这个函数进行Request处理的话 就是中介者模式
//    但是用这个函数的话 就不能自定顺序了
//    Response handleRequest(Request request) {
//        return handler1.handleRequest(request);
//    }

    //    使用这个来像建造者模式一样组装顺序
//    直接返回一个Handler 感觉这个应该更加常用一点
//    这样能够最大效率的防止内存泄漏 使用最少的内存
    public Handler construct(ArrayList<String> sequence) {
//        最后需要返回的处理类
        Handler handler1 = null;
//        设置一个默认的顺序
        if (sequence == null) {
            handler1 = new ConcreteHandler1();
            Handler handler2 = new ConcreteHandler2();
            handler1.setNextHandler(handler2);
            handler2.setNextHandler(new ConcreteHandler3());
            return handler1;
        } else {
            Handler tempHandler = null;
            for (String step : sequence
            ) {
                switch (step) {
                    case "handler1": {
                        if (tempHandler == null) {
                            tempHandler = new ConcreteHandler1();
                            handler1 = tempHandler;
                        } else {
                            tempHandler.setNextHandler(new ConcreteHandler1());
                        }
                    }
                    case "handler2": {
                        if (tempHandler == null) {
                            tempHandler = new ConcreteHandler2();
                            handler1 = tempHandler;
                        } else {
                            tempHandler.setNextHandler(new ConcreteHandler2());
                        }
                    }
                    case "handler3": {
                        if (tempHandler == null) {
                            tempHandler = new ConcreteHandler3();
                            handler1 = tempHandler;
                        } else {
                            tempHandler.setNextHandler(new ConcreteHandler3());
                        }
                    }
                }
            }
        }
        return handler1;
    }

}
