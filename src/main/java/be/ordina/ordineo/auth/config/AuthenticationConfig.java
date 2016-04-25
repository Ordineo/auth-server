package be.ordina.ordineo.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class AuthenticationConfig extends GlobalAuthenticationConfigurerAdapter {

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Nivek").password("password").roles("CLIENT","TRUSTED_CLIENT","USER")
                .and()
                .withUser("Gide").password("password").roles("USER")
                .and()
                .withUser("Ryandg").password("password").roles("USER");
     }
}
