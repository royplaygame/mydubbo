package com.ali.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ali.dubbo.demo.service.DemoService;
import com.ali.dubbo.demo.service.UserService;

public class Consumer {
	public static void main(String[] args) {
		// 测试常规服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer start");
		 // 获取远程调用代理对象
		DemoService demoService = context.getBean(DemoService.class);
		System.out.println("consumer");
		
		//执行远程调用
		System.out.println(demoService.getPermissions(1L));

		// 执行远程调用的另一个方法
		System.out.println(demoService.getUserName("平凡的人---->"));

		System.out.println("===========================>");
		UserService userService = context.getBean(UserService.class);
		System.out.println("用户admin登录: "+userService.login("admin", "123456"));
		System.out.println("用户zhangsan登录: "+userService.login("zhangsan", "123456"));
		
		System.out.println(userService.logout());
		context.close();
	}
}
