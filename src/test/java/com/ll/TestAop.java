package com.ll;

import com.ll.service.ProviderService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop
{
	@Test
	public void m1()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-aop.xml");
		ProviderService providerService = ctx.getBean("providerService", ProviderService.class);
		providerService.add();
	}
}
