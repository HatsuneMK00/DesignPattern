package xyz.makise.proxy.forced;

//ǿ�ƴ����� ��ʵ������Ҫ����Ƿ����ɴ�����ִ�еķ���
//����ʹ��ʱ Ҫ��֤�������������������ʵ�����getProxy()���� ����ǿ�ƿ��ܻ᲻��Ч
//��ʹ���� Ҳ�����п�ͷ��Լ�����ܹ�ֱ�ӵ��� �����ڵ�����getProxy֮�� ��ʵ����Ҳ����ֱ�ӵ��÷��� Υ����ǿ�ƴ���ĳ���
public class RealSubject implements Subject {
    //    ��¼�Լ��Ĵ�����˭
    private Subject proxy = null;

    //    ������Ҫ���Ƿ��Ǵ���ִ�еķ��������ж�
    @Override
    public void request() {
        if (isProxy()) {
            System.out.println("request execute");
        } else {
            System.out.println("use proxy!");
        }
    }

    //    ����һ������ʵ����Ĵ���
    @Override
    public Subject getProxy() {
        this.proxy = new Proxy(this);
        return proxy;
    }

    //    ����Ƿ��ɴ�����ִ�еķ���
//    ��Ҫ��ȫǿ�ƴ��� �ͱ����ȡ�����߶����뱣��Ĵ��������бȽ�
    private boolean isProxy() {
        return !(proxy == null);
    }
}
