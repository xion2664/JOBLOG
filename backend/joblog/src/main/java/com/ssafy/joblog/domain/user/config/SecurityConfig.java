package com.ssafy.joblog.domain.user.config;

import com.ssafy.joblog.domain.user.oauth.PrincipalOauth2UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(securedEnabled = true)
public class SecurityConfig {

    @Autowired
    private PrincipalOauth2UserService principalOauth2UserService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(CsrfConfigurer::disable)
                .authorizeHttpRequests(authorize ->
                        authorize.requestMatchers("/applicant/**").authenticated()
                                .requestMatchers("/worker/**").hasAnyRole("WORKER")
                                .requestMatchers("/chatter/**").hasAnyRole("CHATTER")
                                .anyRequest().permitAll())
                .formLogin(AbstractHttpConfigurer::disable)
                .oauth2Login(oauth -> oauth.loginPage("/")
                        .userInfoEndpoint(userInfo -> userInfo.userService(principalOauth2UserService)));
        return http.build();
    }

}
