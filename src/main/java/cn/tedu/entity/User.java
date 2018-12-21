package cn.tedu.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;



public class User {
	
	private String name;
	@JsonIgnore//忽略该属性
	private String password;
	private int age;
	@JsonInclude(Include.NON_NULL)//不序列化为null的属性,可以加载类上也可以在属性上,在类上代表该类中所有的null属性均不序列化
	private String gander;
	@JsonFormat(pattern="yyyy-MM-dd a",locale="zh",timezone="GMT+8")
	private Date brithday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGander() {
		return gander;
	}
	public void setGander(String gander) {
		this.gander = gander;
	}
	public Date getBrithday() {
		return brithday;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	
	
}
