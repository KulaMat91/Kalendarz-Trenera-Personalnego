package com.example.kalendarz_trenera_personalnego.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

    @Configuration
    @EnableWebSecurity
    public class Auth extends WebSecurityConfigurerAdapter {

        @Bean
        protected PasswordEncoder passwordEncoder(){
            return new BCryptPasswordEncoder();
        }


        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()
                    .withUser("test").password(passwordEncoder().encode("test")).roles("USER")
                    .and()
                    .withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("eventList", "login", "register", "/") // mają dostęp wszyscy użytkownicy z ROLE_USER
                    .hasAnyAuthority("ROLE_USER")
//                    .antMatchers("/") // mają dostęp wszyscy użytkownicy z ROLE_ADMIN
//                    .hasAnyAuthority("ROLE_ADMIN","ROLE_USER")
                    .antMatchers("eventList", "login", "register", "/") // mają dostęp wszyscy użytkownicy z ROLE_ADMIN
                    .hasAnyAuthority("ROLE_ADMIN")
                    .and()
                    .csrf().disable() // wyłączenie zabezpieczenia w cleu użycia postmana
                    .headers().frameOptions().disable()
                    .and()
                    .formLogin() // wskazujemy, że teraz będziemy konfigurować formularz autoryzacji
                    .loginPage("/login") // na jakim adresie url będzie metoda odpowiedzialna za autoryzacje
                    .usernameParameter("username") // nadajemy nazwę jaka będzie jako name w inpucie loginu formularza
                    .passwordParameter("password")// nadajemy nazwę jaka będzie jako name w inpucie hasła formularza
                    .loginProcessingUrl("/login")
                    .failureForwardUrl("/login?error") // co się stanie w momencie błędnego wpisania danych
                    .defaultSuccessUrl("/eventList") // co sięstanie w momencie prawidłowego wpisania loginu i hasła
                    .and()
                    .logout() // mówie springowi, że przechodzę do obsłużenie logout
                    .logoutSuccessUrl("/");
        }
    }




