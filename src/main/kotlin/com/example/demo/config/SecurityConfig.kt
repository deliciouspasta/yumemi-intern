package com.example.demo.config

import com.example.demo.repository.UsersRepository
import com.example.demo.service.UsersDetailsService
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@EnableWebSecurity
class SecurityConfig(private val usersRepository: UsersRepository) :
    WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity) {
        http.authorizeRequests()
            .mvcMatchers("/","/login","/users","/home").permitAll()
            .anyRequest().authenticated()
            .and()

        http.formLogin()
            .usernameParameter("loginId").passwordParameter("password")
            .and()
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth
            .userDetailsService(UsersDetailsService(usersRepository))
            .passwordEncoder(passwordEncoder())
    }

    fun passwordEncoder(): BCryptPasswordEncoder {
        return BCryptPasswordEncoder();
    }
}