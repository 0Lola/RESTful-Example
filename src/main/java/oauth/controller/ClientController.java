package oauth.controller;

import oauth.entity.*;
import oauth.service.FormatTransform;
import oauth.service.HttpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Client/v1")
public class ClientController {

    private static final String v = "v1";
    private HttpService httpService = new HttpService();
    private FormatTransform formatTransform = new FormatTransform();

    // 資料授權回應
    @RequestMapping(value = "/authorize", method = {RequestMethod.POST, RequestMethod.GET})
    public Response authGrantRequest(HttpServletRequest request) {
        AuthGrant authGrant = new AuthGrant(
                request.getParameter("code"),
                request.getParameter("contentURL"),
                request.getParameter("state")
        );
        return new Response(v, "200", "資料要求者已收到資料授權");
    }

    // AccessToken
    @RequestMapping(value = "/accessToken", method = {RequestMethod.POST, RequestMethod.GET})
    public Response accessTokenRequest(HttpServletRequest request) throws Exception {
        AccessToken accessToken = new AccessToken(
                request.getParameter("v"),
                request.getParameter("status"),
                request.getParameter("accessToken"),
                request.getParameter("expiresIn"),
                request.getParameter("tokenType"),
                request.getParameter("scope"),
                request.getParameter("refreshToken")
        );
        return new Response(v, "200", "資料要求者已收到AccessToken");

    }
}
