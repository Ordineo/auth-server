package be.ordina.ordineo.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.exceptions.InvalidClientException;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
public class AuthController {

    @Autowired
    private DefaultTokenServices defaultTokenServices;

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

    @RequestMapping(value = "/oauth/token/revoke", method = RequestMethod.POST)
    public @ResponseBody
    void revoke(@RequestParam("token") String value) throws InvalidClientException {
        defaultTokenServices.revokeToken(value);
        //TODO remove from redis
    }
}
