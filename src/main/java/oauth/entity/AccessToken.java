package oauth.entity;

public class AccessToken {

    /**
     * v 版本號碼，為一字串，目前數值為 1.0
     * status 為回應類型之字串，為 utf-8 編碼，如果成功應為 200
     * accessToken 存取識別符
     * expiresIn 失效時間
     * tokenType 目前為 Bearer
     * scope 可存取資源
     * refreshToken 用來更新 access token 用的 token
     */
    private String v;
    private String status;
    private String accessToken;
    private String expiresIn;
    private String tokenType;
    private String scope;
    private String refreshToken;

    public AccessToken(String v, String status, String accessToken, String expiresIn, String tokenType, String scope, String refreshToken) {
        this.v = v;
        this.status = status;
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.tokenType = tokenType;
        this.scope = scope;
        this.refreshToken = refreshToken;
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

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
