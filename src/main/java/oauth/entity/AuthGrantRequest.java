package oauth.entity;

public class AuthGrantRequest {

    /**
     * clientId 要求者的身分識別碼
     * subjectId 要求資料主體的身分識別碼
     * requestPermission 所要求存取的資料物件
     * criteriaURL 向使用者表示存取提案或隱私政策的網址
     * state 要求者端用來識別要求的識別
     */
    private String clientId;
    private String subjectId;
    private String[] requestPermission;
    private String criteriaURL;
    private String state;

    public AuthGrantRequest(String clientId, String subjectId, String[] requestPermission, String criteriaURL, String state) {
        this.clientId = clientId;
        this.subjectId = subjectId;
        this.requestPermission = requestPermission;
        this.criteriaURL = criteriaURL;
        this.state = state;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String[] getRequestPermission() {
        return requestPermission;
    }

    public void setRequestPermission(String[] requestPermission) {
        this.requestPermission = requestPermission;
    }

    public String getCriteriaURL() {
        return criteriaURL;
    }

    public void setCriteriaURL(String criteriaURL) {
        this.criteriaURL = criteriaURL;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
