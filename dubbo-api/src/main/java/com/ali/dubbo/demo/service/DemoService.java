package com.ali.dubbo.demo.service;

import java.util.List;

public interface DemoService {
	List<String> getPermissions(Long id);

	String getUserName(String name);
}
