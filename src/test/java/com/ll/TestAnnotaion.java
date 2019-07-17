package com.ll;

import com.ll.service.UserService;
import com.ll.service.hello.HelloWorld;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotaion
{
	@Test
	public void m1()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserService userService = ctx.getBean("userService", UserService.class);
		userService.eat();

		HelloWorld helloWorld = ctx.getBean("helloWorld", HelloWorld.class);
		helloWorld.walk();
	}
}

