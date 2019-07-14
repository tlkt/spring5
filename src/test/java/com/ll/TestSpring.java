package com.ll;

import com.ll.pojo.Girl;
import com.ll.pojo.Pay;
import com.ll.pojo.PrettyGirl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring
{
	@Test
	public void m1()
	{
		//获取上下文对象 spring中的对象都需要通过上下文获取
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过对象获取girl
		Girl girl = (Girl) ctx.getBean("girl");
		System.out.println(girl);

		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("beans1.xml");
		Girl girl1 = (Girl) ctx1.getBean("yourGirl");

		System.out.println(girl1);
	}


	@Test
	public void m2()
	{
		//获取上下文对象 spring中的对象都需要通过上下文获取
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过对象获取girl
		Pay pay = (Pay) ctx.getBean("pay");
		pay.pay();
	}

	@Test
	public void m3()
	{
		//读取多个spring 配置文件
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml", "beans1.xml", "beans2.xml"});
		Girl myGirl = ctx.getBean("myGirl", Girl.class);
		Girl yourGirl = ctx.getBean("yourGirl", Girl.class);
		Girl girl = ctx.getBean("girl", Girl.class);
		System.out.println(myGirl);
		System.out.println(yourGirl);
		System.out.println(girl.getName());
	}
}
