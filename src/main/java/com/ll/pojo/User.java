package com.ll.pojo;

public class User
{
	private String name;
	private String address;

	private Dog dog;

	public User()
	{
	}

	public User(String name, Dog dog)
	{
		this.name = name;
		this.dog = dog;
	}

	@Override
	public String toString()
	{
		return "User{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", dog=" + dog + '}';
	}

	public Dog getDog()
	{
		return dog;
	}

	public void setDog(Dog dog)
	{
		this.dog = dog;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

}
