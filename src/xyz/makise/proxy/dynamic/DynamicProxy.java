package xyz.makise.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//1 ���һ��������̬�������Ĺ���
//��û��������ҵ���๤�����ʱ�� �������̬����Ĺ����෵��һ��֯������ǿ�Ĵ�����
class DynamicProxy {
//    �����ڲ�����̬�������ʱ��Ҳ������ǿ ����������ǿ��InvocationHandler��ʵ������
    MyAspect aspect = new MyAspect();
//    interfacesǰ���Class<?>(���ﲻ������<T>)ȷ���˷���T������
//    ̫������������
//    ʹ�÷��Ϳ��Ա���ǿ��ת�� ���ֱ�ӷ�������Ҫ�Ľӿ�����
    static <T> T getDynamicProxy(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
