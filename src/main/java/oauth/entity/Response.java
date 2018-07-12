package oauth.entity;

public class Response {

    /**
     *  v 版本
     *  status 回傳狀態
     *  message 回傳訊息
     */
    private String v;
    private String status;
    private String message;

    public Response(String v, String status, String message) {
        this.v = v;
        this.status = status;
        this.message = message;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
