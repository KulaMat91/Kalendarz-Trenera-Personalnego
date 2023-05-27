//package com.example.kalendarz_trenera_personalnego.config;
//
//import com.example.kalendarz_trenera_personalnego.repository.UserRepository;
//import com.example.kalendarz_trenera_personalnego.service.UserService;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AuthProvider implements AuthenticationProvider {
//
//    private UserService userService;
//
//    private PasswordEncoder passwordEncoder;
//
//    private UserRepository userRepository;
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String login = authentication.getName();
//
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return true;
//    }
//}
