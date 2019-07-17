package com.ll.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component("userService")
//@Component()
@Service
//@Repository
public class UserService
{
	public void eat()
	{
		System.out.println("吃了西瓜");
	}
}
