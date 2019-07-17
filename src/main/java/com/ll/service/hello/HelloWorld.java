package com.ll.service.hello;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Repository
@Service
public class HelloWorld
{
	public void walk()
	{
		System.out.println("walk");
	}
}
