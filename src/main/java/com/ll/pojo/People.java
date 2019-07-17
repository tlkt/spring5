package com.ll.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class People
{
	private String name;
	private Integer age;

	private String[] friends;

	private List<Integer> nums;

	private List<Dog> dogs;

	private Set<Girl> girls;

	private Map<String, User> users;

	@Override
	public String toString()
	{
		return "People{" + "name='" + name + '\'' + ", age=" + age + ", friends=" + Arrays.toString(friends) + ", nums=" + nums + ", dogs=" + dogs + ", girls=" + girls + ", users=" + users + '}';
	}

	public Map<String, User> getUsers()
	{
		return users;
	}

	public void setUsers(Map<String, User> users)
	{
		this.users = users;
	}

	public Set<Girl> getGirls()
	{
		return girls;
	}

	public void setGirls(Set<Girl> girls)
	{
		this.girls = girls;
	}

	public List<Dog> getDogs()
	{
		return dogs;
	}

	public void setDogs(List<Dog> dogs)
	{
		this.dogs = dogs;
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

	public String[] getFriends()
	{
		return friends;
	}

	public void setFriends(String[] friends)
	{
		this.friends = friends;
	}

	public List<Integer> getNums()
	{
		return nums;
	}

	public void setNums(List<Integer> nums)
	{
		this.nums = nums;
	}

}
