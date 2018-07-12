package oauth.entity;

public class AuthGrant {

    /**
     *  code 同意識別碼
     *  contentURL 同意書 URL
     *  state 要求者端用來識別要求的識別碼
     */
    private String code;
    private String contentURL;
    private String state;

    public AuthGrant(String code, String contentURL, String state) {
        this.code = code;
        this.contentURL = contentURL;
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContentURL() {
        return contentURL;
    }

    public void setContentURL(String contentURL) {
        this.contentURL = contentURL;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
