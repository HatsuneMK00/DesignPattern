package xyz.makise.prototype;

import java.util.Random;

class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        int mailLimit = 5;
        int mailCount;
        PrototypeMail mail = new PrototypeMail("邮件正文", "好多固定信息");
//        即使这个for循环交给多线程跑(多线程发邮件效率更高)
//        由于循环中每次都克隆(新建)了一个对象 是线程安全的
        for (mailCount = 0; mailCount < mailLimit; mailCount++) {
            PrototypeMail cloneMail = mail.clone();
            cloneMail.setReceiver(getRandString(8));
            cloneMail.setSender(getRandString(6));
            sendMail(cloneMail);
        }
    }

//    生成一个长度为length的随机字符串
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
