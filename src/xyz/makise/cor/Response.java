package xyz.makise.cor;

import java.util.HashMap;

class Response {
    private HashMap<String,Object> responseContent;

    public HashMap<String, Object> getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(HashMap<String, Object> responseContent) {
        this.responseContent = responseContent;
    }
}
