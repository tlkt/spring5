package com.ll.dao;

public class ProviderDao
{
	private String url;
	private String driver;
	private String user;
	private String password;


	@Override
	public String toString()
	{
		return "ProviderDao{" + "url='" + url + '\'' + ", driver='" + driver + '\'' + ", user='" + user + '\'' + ", password='" + password + '\'' + '}';
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getDriver()
	{
		return driver;
	}

	public void setDriver(String driver)
	{
		this.driver = driver;
	}

	public String getUser()
	{
		return user;
	}

	public void setUser(String user)
	{
		this.user = user;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public void update()
	{
		System.out.println("升级了");
	}
}
