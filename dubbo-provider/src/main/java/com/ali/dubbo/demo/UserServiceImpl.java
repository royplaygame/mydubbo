package com.ali.dubbo.demo;

import com.ali.dubbo.demo.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public boolean login(String userName, String password) {
		if ("admin".equals(userName) && "123456".equals(password)) {
			return true;
		}
		return false;
	}

	@Override
	public String logout() {
		return "用户退出系统成功！";
	}

}
