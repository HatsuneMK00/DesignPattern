package xyz.makise.cor;

import java.util.HashMap;

class Request {
    //  ����ȼ� �����������������е��ĸ������ߴ���
    private int level;
    private HashMap<String,Object> requestContent;

    public int getRequestLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public HashMap<String, Object> getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(HashMap<String, Object> requestContent) {
        this.requestContent = requestContent;
    }
}
