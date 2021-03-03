package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AndRequestMatcher;

import java.util.concurrent.TimeUnit;

import static com.example.demo.security.ApplicationUserRole.ADMIN;
import static com.example.demo.security.ApplicationUserRole.STUDENT;
import static com.example.demo.security.ApplicationUserRole.MANAGEMENTTRAINEE;
import static com.example.demo.security.ApplicationUserPermission.COURSE_WRITE;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
    private final PasswordEncoder passwordEncoder; // this is crypto password encoder

    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) { // this is my password encoder // constructor
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // TODO: will do next
                // for the CSRF token activation to the application
                //.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                //.and()
                .authorizeRequests()
                .antMatchers("/", "index", "/css/*", "/js/*")
                .permitAll()
                .antMatchers("/api/**").hasRole(STUDENT.name()) // role base authentication
                // permission based authentication
//                .antMatchers("/management/api/**").hasRole(MANAGEMENT.name())

               // ORDER DOES MATTER IN HERE
                // commented after the annotation authority added to the management API
//                .antMatchers(HttpMethod.DELETE, "management/api/**").hasAuthority(COURSE_WRITE.getPermission())
//                .antMatchers(HttpMethod.PUT, "management/api/**").hasAuthority(COURSE_WRITE.getPermission())
//                .antMatchers(HttpMethod.POST, "management/api/**").hasAuthority(COURSE_WRITE.getPermission())
//                .antMatchers(HttpMethod.GET, "management/api/**").hasAnyRole(ADMIN.name(), MANAGEMENTTRAINEE.name())
                // COMMON SETUP
                .anyRequest()
                .authenticated()
                .and()
                //.httpBasic() // for http basic authentication. we can not logout using the BASIC authentication
                .formLogin()
                    .loginPage("/login")
                    .permitAll()
                    .defaultSuccessUrl("/courses", true)
                    .passwordParameter("password")
                    .usernameParameter("username")
                .and()
                .rememberMe() //  this rememer savade data till 2 weeks
                .tokenValiditySeconds((int) TimeUnit.DAYS.toSeconds(21))
                .key("suthingkeybysamad")
                .rememberMeParameter("remember-me")
                .and()
                .logout()
                    .logoutUrl("/logout")
//                    .logoutRequestMatcher(new AndPathRequestMatcher("/logout", "GET"))
                   .clearAuthentication(true)
                    .invalidateHttpSession(true)
                    .deleteCookies("JSESSIONID", "remember-me")
                    .logoutSuccessUrl("/login");



    }

    //TODO: TILL THEY DONT KNOW YET ABOUT THE ROLE OR PERMISSIONS
    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        // role of student
        UserDetails userStudent = User.builder()
                .username("user_student")
                .password(passwordEncoder.encode("password"))
//                .roles(STUDENT.name()) // ROLE_STUDENT
                .authorities(STUDENT.getGrantedAuthority())
                .build();

        // role of admin
        UserDetails userAdmin = User.builder()
                // there is no role in UserDetails interface
                .username("user_admin")
                .password(passwordEncoder.encode("password"))
               // .roles(ADMIN.name()) // ROLE_admin
                .authorities(ADMIN.getGrantedAuthority())
                .build();

        UserDetails userManagementTrainee = User.builder()
                .username("user_managementtrainee")
                .password(passwordEncoder.encode("password"))
              //  .roles(MANAGEMENTTRAINEE.name()) // ROLE_MANAGEMENT
                .authorities(MANAGEMENTTRAINEE.getGrantedAuthority())
                .build();
        // We made all authorities in here and after debugger in here
        //  we can see all the roles
        return new InMemoryUserDetailsManager(
                userStudent, userAdmin, userManagementTrainee);
    }
}
