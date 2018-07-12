package oauth.entity;

public class AccessTokenRequest {

    /**
     * clientId 要求者的身分識別碼
     * code 之前取得的同意識別碼 (一個同意識別碼只可要求一次存取識別符)
     * state 要求者端用來識別要求的識別碼
     * nonce 亂數
     * hmacSig 為 client_id、 code、 grant_type、 nonce 字串接起來使用 Client Secret 進行 HMAC SHA 256 之結果
     */
    private String clientId;
    private String code;
    private String state;
    private String nonce;
    private String hmacSig;

    public AccessTokenRequest(String clientId, String code, String state , String nonce, String hmacSig) {
        this.clientId = clientId;
        this.code = code;
        this.state = state;
        this.nonce = nonce;
        this.hmacSig = hmacSig;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getHmacSig() {
        return hmacSig;
    }

    public void setHmacSig(String hmacSig) {
        this.hmacSig = hmacSig;
    }
}
