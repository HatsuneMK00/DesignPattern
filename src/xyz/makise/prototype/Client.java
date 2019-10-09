package xyz.makise.prototype;

import java.util.Random;

class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        int mailLimit = 5;
        int mailCount;
        PrototypeMail mail = new PrototypeMail("�ʼ�����", "�ö�̶���Ϣ");
//        ��ʹ���forѭ���������߳���(���̷߳��ʼ�Ч�ʸ���)
//        ����ѭ����ÿ�ζ���¡(�½�)��һ������ ���̰߳�ȫ��
        for (mailCount = 0; mailCount < mailLimit; mailCount++) {
            PrototypeMail cloneMail = mail.clone();
            cloneMail.setReceiver(getRandString(8));
            cloneMail.setSender(getRandString(6));
            sendMail(cloneMail);
        }
    }

//    ����һ������Ϊlength������ַ���
    private static String getRandString(int length) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            stringBuffer.append(source.charAt(random.nextInt(source.length())));
        }
        return stringBuffer.toString();
    }

    private static void sendMail(PrototypeMail mail) {
        System.out.println(mail.getSender());
        System.out.println(mail.getContext());
        System.out.println(mail.getOtherFixedThing());
        System.out.println(mail.getReceiver());
        System.out.println();
    }
}
