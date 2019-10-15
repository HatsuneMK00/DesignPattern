package xyz.makise.strategy;

//�������һ����Strategy����ķ�װ��
//���ڽ��߲����ģ����㷨ģ�����
//��װ������Strategy�� ��װ��Strategy����ܵı仯
//�������������Ƿ�������ӿڵģ������Ͼ���������ӿ� ֻ�Ƕ���һ����װ�ࣩ
//�ʹ���ģʽ��Ĵ��������
class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void exec(){
        strategy.exec();
    }
}
