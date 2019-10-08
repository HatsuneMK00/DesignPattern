package xyz.makise.proxy.standard;

//���������ʵ����Ҫ����Ķ���ʵ�ֵĽӿڲ��ܹ�����ʵ�ַ�װ�õĴ���
//�����ʹ����ʵ����һ��ʹ�ô������
//����������Ϊ��ʵ����ķ��������ǿ �����ӳ���ʵ�����ʵ����
class Proxy implements Subject, IAdvice {
    private Subject subject = null;
//    �Ҹо�������Ʋ����Ǻܺ� ��̫��ʵ���ӳ�ʵ�����Ĺ���
//    private String info;

//    ���ⲿ�������Ŀ�� ���Դ���ܶ��
    public Proxy(Subject subject) {
        this.subject = subject;
    }

//    @Override
//    public String getInfo() {
//        return this.info;
//    }
//
//    @Override
//    public void setInfo(String info) {
//        this.info = info;
//    }

    @Override
    public void heavyJob() {
//        ������ǿ
        before();
        subject.heavyJob();
        after();
    }

    @Override
    public void before() {
        System.out.println("before execute");
    }

    @Override
    public void after() {
        System.out.println("after execute");
    }
}
