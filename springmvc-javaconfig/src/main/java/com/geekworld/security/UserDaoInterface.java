package com.geekworld.security;

public interface UserDaoInterface {
	
	public Geek_World_User registerUser();
	
	public Geek_World_User updateUser();
	
	public Geek_World_User getUser(int id);
	
	public Geek_World_User deleteUser(int id);

}
