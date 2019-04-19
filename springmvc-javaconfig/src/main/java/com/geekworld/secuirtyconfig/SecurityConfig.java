package com.geekworld.secuirtyconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.geekworld.utils.GeekWorldAuthenticationException;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AuthenticationProvider authenticationProvider;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		System.out.println("shashi");

		http.authorizeRequests().antMatchers("/register/**").permitAll().antMatchers("/login/**").permitAll()

		.antMatchers("/forgotPassword").permitAll()
				.antMatchers("/forgotUserId").permitAll().anyRequest()
				.authenticated().and().formLogin().loginPage("/login").defaultSuccessUrl("/welcome",true)
				.permitAll().and().logout().logoutSuccessUrl("/login");
		// TODO Auto-generated method stub
		
/*		if you want to go to a specific url after loogin out just add 
		.logoutSuccessUrl("/afterlogout.html").
		Keep in note that logout url: /logout which used to be /j_spring_security_logout.
		simiary for login it used to be /J_spring_secuirty_login*/

	}

	/*@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.authenticationProvider(this.authenticationProvider);
		super.configure(auth);
	}*/
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws GeekWorldAuthenticationException{
		try {
			//auth.inMemoryAuthentication().withUser("Shashi").password("password");
			auth.inMemoryAuthentication().withUser("Shashi").password("password").roles("Admin");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new GeekWorldAuthenticationException("Authentication failed");
		}
		
	}

}
