package com.ll.pojo;

public class Car
{
	private String name;
	private Double price;
	private Double speed;


	public Car(Double price, Double speed)
	{
		this.price = price;
		this.speed = speed;
	}

	public Car(String name, Double price)
	{
		this.name = name;
		this.price = price;
	}

	public Car(String name, Double price, Double speed)
	{
		this.name = name;
		this.price = price;
		this.speed = speed;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setPrice(Double price)
	{
		this.price = price;
	}

	public Double getSpeed()
	{
		return speed;
	}

	public void setSpeed(Double speed)
	{
		this.speed = speed;
	}

	@Override
	public String toString()
	{
		return "Car{" + "name='" + name + '\'' + ", price=" + price + ", speed=" + speed + '}';
	}
}
