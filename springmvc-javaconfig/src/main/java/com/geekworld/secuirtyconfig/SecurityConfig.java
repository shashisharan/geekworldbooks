package com.geekworld.secuirtyconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AuthenticationProvider authenticationProvider;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		System.out.println("shashi");

		http.authorizeRequests().antMatchers("/register/**").permitAll()

		.antMatchers("/forgotPassword").permitAll()
				.antMatchers("/forgotUserId").permitAll().anyRequest()
				.authenticated().and().formLogin().loginPage("/login")
				.permitAll();
		// TODO Auto-generated method stub

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.authenticationProvider(this.authenticationProvider);
		super.configure(auth);
	}

}
