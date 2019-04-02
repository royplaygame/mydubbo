package com.ali.dubbo.demo;

import java.util.ArrayList;
import java.util.List;

import com.ali.dubbo.demo.service.DemoService;

public class DemoServiceImpl implements DemoService {

	public List<String> getPermissions(Long id) {
		List<String> demo = new ArrayList<String>();
		demo.add(String.format("Permission_%d", id - 100));
		demo.add(String.format("Permission_%d", id));
		demo.add(String.format("Permission_%d", id + 100));
		return demo;
	}

	@Override
	public String getUserName(String name) {
		long l = System.currentTimeMillis();
		return name + l;
	}

}
