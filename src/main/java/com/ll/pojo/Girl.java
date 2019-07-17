package com.ll.pojo;

public class Girl
{
	private String name;
	private Integer age;
	private Dog dog;

	public Girl()
	{
		System.out.println("construct ");
	}

	public Girl(String name, Integer age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public void clearDress()
	{
		System.out.println("clear");
	}

	public void start()
	{
		System.out.println("start");
	}

	public Dog getDog()
	{
		return dog;
	}

	public void setDog(Dog dog)
	{
		this.dog = dog;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

	@Override
	public String toString()
	{
		return "Girl{" + "name='" + name + '\'' + ", age=" + age + "} Dog:" + dog.getName();
	}
}
