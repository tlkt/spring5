package com.ll;

import com.ll.dao.ProviderDao;
import com.ll.pojo.Dog;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResource
{
	@Test
	public void m1()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resources.xml");
		ProviderDao providerDao = ctx.getBean("providerDao", ProviderDao.class);
		System.out.println(providerDao);
		providerDao.update();
	}

	@Test
	public void m2()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		Dog dog = ctx.getBean("dog", Dog.class);
		System.out.println(dog);


		Dog dog2 = ctx.getBean("dog2", Dog.class);
		System.out.println(dog2);
	}
}
