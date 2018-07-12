package oauth.controller;

import oauth.entity.*;
import oauth.service.FormatTransform;
import oauth.service.HttpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/DataController/v1")
public class DataController {

    private static final String v = "v1";
    private HttpService httpService = new HttpService();
    private FormatTransform formatTransform = new FormatTransform();
    private AuthGrantRequest authGrantRequest;
    private AuthGrant authGrant;
    private AccessToken accessToken;

    // AuthGrant 假資料
    private String code = "TSjqiZCdJwGyytGjz2GzziPfHTJ6z2";
    private String contentURL = "https%3A%2F%2Flocalhost%3A8080%2Fclient1%2Fpolicy.html";
    private String state = "8e896a59f0744a8e93bf2f1f13230be5";
    // AccessToken 假資料
    private String _accessToken = "oQlduHNr09GKCU506GOgp8OarrAy2q";
    private String _refreshToken = "wDimPGoA8vwXP51kie71vpsy9l17HN";
    private String _tokenType = "Bearer";
    private String _scope = "bloodpressure.create bloodpressure.read";
    private String _expires_in = "36000";


    // 資料授權要求
    @RequestMapping(value = "/authorize", method = {RequestMethod.POST, RequestMethod.GET})
    public Response authGrantRequest(HttpServletRequest request) throws Exception {
        authGrantRequest = new AuthGrantRequest(
                request.getParameter("client_id"),
                request.getParameter("subject_id"),
                request.getParameterValues("request_permission"),
                request.getParameter("criteria_URL"),
                request.getParameter("state")
        );
        // 許可要求，發送AuthGrant給Client
        authGrant = new AuthGrant(code, contentURL, state);
        int status = httpService.sendGet("http://localhost:8080/Client/v1/authorize?" + formatTransform.ObjectToQueryString(authGrant));
        return new Response(v, String.valueOf(status), "使用者已同意授權");
    }

    // AccessToken要求
    @RequestMapping(value = "/accessToken", method = {RequestMethod.POST, RequestMethod.GET})
    public Response sendAccessToken(HttpServletRequest request) throws Exception {
        AccessTokenRequest accessTokenRequest = new AccessTokenRequest(
                request.getParameter("client_id"),
                request.getParameter("code"),
                request.getParameter("state"),
                request.getParameter("nonce"),
                request.getParameter("hmac_sig")
        );
        // 假設已驗證，發送AccessToken給Client
        accessToken =  new AccessToken(v, "200", _accessToken, _expires_in, _tokenType, _scope, _refreshToken);
        httpService.sendPost("http://localhost:8080/Client/v1/accessToken/" , formatTransform.objectToMap(accessToken));
        return new Response(v, String.valueOf(200), "認證成功，AccessToken已發送");
    }
}
