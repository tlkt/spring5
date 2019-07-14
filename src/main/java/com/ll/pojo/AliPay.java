package com.ll.pojo;

public class AliPay implements Pay
{

	@Override
	public void pay()
	{
		System.out.println("支付宝支付");
	}
}
