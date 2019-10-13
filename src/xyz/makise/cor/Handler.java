package xyz.makise.cor;

//������ģʽ
//�о��Ƕ�if else���ĳ���
//ͨ��������ģʽʵ���˿���ԭ�� ��һְ�� �����ط������Ҫԭ�� ��һ����Ҫ���ǲ�̫�ѵ�ģʽ
//����������Ĵ�������ʹ����ģ�巽��ģʽ
abstract class Handler {
    private Handler nextHandler = null;
//    ������Բ�д��һ����Ա���� ����ͨ��һ����Ҫʵ����ʵ�ֵĳ��󷽷���ʵ�ֲ�ͬ���಻ͬ������
//    private int level;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public Response handleRequest(Request request) {
        Response response = null;
//        ע���������level�Ƕ���Ļ� ʹ��equal����
        if (request.getRequestLevel() == this.getHandlerLevel()) {
            response = this.echo(request);
        } else {
            if (nextHandler != null) {
                System.out.println(this.getClass().getName() + " dispatcher");
                response = nextHandler.handleRequest(request);
            } else {
//                û�д�����ʱ�Ĵ����߼�
            }
        }
        return response;
    }

    abstract protected int getHandlerLevel();

    abstract protected Response echo(Request request);
}
