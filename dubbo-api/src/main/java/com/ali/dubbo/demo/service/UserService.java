package com.ali.dubbo.demo.service;

public interface UserService {

	boolean login(String userName,String password);
	
	String logout();
}
