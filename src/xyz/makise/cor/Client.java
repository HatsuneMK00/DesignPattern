package xyz.makise.cor;

import java.util.HashMap;

//�����web����Ļ� ���Clientһ���Ӧ����Controller�˰�
class Client {
    public static void main(String[] args) {
        Request request = new Request();
        HashMap<String, Object> map = new HashMap<>();
//        ��ʵ����ȼ�Ҳ���Է�װ��map��
        request.setRequestContent(map);
        request.setLevel(2);
//        һ�㲻��Client����߲�ģ������������ ���ǽ���������װ���� ֱ�ӷ��ص�һ�������߸�Client
//        Handler handler1 = new ConcreteHandler1();
//        Handler handler2 = new ConcreteHandler2();
//        Handler handler3 = new ConcreteHandler3();
//        handler1.setNextHandler(handler3);
//        handler3.setNextHandler(handler2);
//        Response response = handler1.handleRequest(request);
        COR cor = new COR();
        Handler handler = cor.construct(null);
//        ������ֻ��һ��handler�� ʵ������һ������������
//        ʵ���˶�Client������ ͬʱ�кܸߵĿ���չ��
        Response response = handler.handleRequest(request);
    }
}
