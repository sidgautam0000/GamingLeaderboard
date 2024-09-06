//package com.gaming.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//	@Autowired
//    private UserDetailsService userDetailsService;
//
//	@Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder(12);
//    }
//	
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setUserDetailsService(userDetailsService);
//        provider.setPasswordEncoder(passwordEncoder());
//        return provider;
//    }
//
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf(AbstractHttpConfigurer::disable)
//        .cors(Customizer.withDefaults())
//                .authorizeHttpRequests(auth ->
//                        auth
//                                .requestMatchers("/register")
//                                .permitAll().anyRequest()
//                                .authenticated())
//                .sessionManagement(session ->
//                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .httpBasic(Customizer.withDefaults());
//
//
//        return httpSecurity.build();
//    }
//}
//
