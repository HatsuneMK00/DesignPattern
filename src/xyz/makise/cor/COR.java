package xyz.makise.cor;

import java.util.ArrayList;

//����ʵ���Ǹ��н���
//�����Ҫ����������װ�䱩¶������ ������һ����α��������ģʽ��

class COR {
//    ֻ��һ��construct������ ���Ҳ����ʡ�Ե�
//    private Handler handler1;
//    ������������ʵ���Բ�Ҫ ����һ��ͷָ��ָ���һ�������߶��󼴿�

//    ʹ�������������Request����Ļ� �����н���ģʽ
//    ��������������Ļ� �Ͳ����Զ�˳����
//    Response handleRequest(Request request) {
//        return handler1.handleRequest(request);
//    }

    //    ʹ�������������ģʽһ����װ˳��
//    ֱ�ӷ���һ��Handler �о����Ӧ�ø��ӳ���һ��
//    �����ܹ����Ч�ʵķ�ֹ�ڴ�й© ʹ�����ٵ��ڴ�
    public Handler construct(ArrayList<String> sequence) {
//        �����Ҫ���صĴ�����
        Handler handler1 = null;
//        ����һ��Ĭ�ϵ�˳��
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
