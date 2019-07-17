package com.ll;

import com.ll.pojo.*;
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
		Girl yourGirl = ctx.getBean("hisGirl", Girl.class);
		Girl girl = ctx.getBean("girl", Girl.class);
		System.out.println(myGirl);
		System.out.println(yourGirl);
		System.out.println(girl);
//		ctx.close();
//		ctx.refresh();
//		ctx.destroy();

//		ctx.refresh();
	}


	@Test
	public void m4()
	{
		//读取多个spring 配置文件
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"beans1.xml"});
//		Girl hg1 = ctx.getBean("hg", Girl.class);
//		System.out.println(hg1);
//
//		Girl yourGirl2 = ctx.getBean("g2", Girl.class);
//		System.out.println(yourGirl2);

		Car car = ctx.getBean("car", Car.class);
		System.out.println(car);
	}

	@Test
	public void m5()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"beans1.xml"});
		People people = ctx.getBean("people", People.class);
		System.out.println(people);
		System.out.println(people.getFriends().length);
		System.out.println(people.getNums().size());
	}

	@Test
	public void m6()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"autowired.xml"});
		User user = ctx.getBean("user", User.class);
		System.out.println(user);
	}
}
