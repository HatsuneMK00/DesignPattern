package xyz.makise.Command;

//������װ��һ��Command��ĵ���
//���������û������� ��Command��ִ�� ������Command��execute����
//�����Ҫ����Command���� ������Receiver��ȫ����
class Invoker {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

//    �������ר��ִ��execute����
    public void action(){
        try{
            command.execute();
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }
}
