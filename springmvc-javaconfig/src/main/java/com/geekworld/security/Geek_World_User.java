package com.geekworld.security;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;


@Entity
public class Geek_World_User extends User{

	public Geek_World_User(String username, String password,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		// TODO Auto-generated constructor stub
	}

   @Column
	private String username;
   
   @Column
	private String password;
	
   @Column
	private boolean enabled;
	
   @Column
	private boolean accountNonExpired;
	
   @Column
	private boolean credentialsNonExpired;
	
   @Column
	private boolean accountNonLocked;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	
	@Override
	public String toString() {
		return "Geek_World_User [username=" + username + ", password="
				+ password + ", enabled=" + enabled + ", accountNonExpired="
				+ accountNonExpired + ", credentialsNonExpired="
				+ credentialsNonExpired + ", accountNonLocked="
				+ accountNonLocked + "]";
	}
	
		
	
	
}
