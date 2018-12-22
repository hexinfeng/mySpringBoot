package cn.tedu.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration//指定该类为配置类
@ConfigurationProperties(prefix="cn.tedu.springboot")//前缀
@PropertySource(value="classpath:resource.properties")//资源文件的地址
public class Resource {
	private String username;
	private int age;
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
