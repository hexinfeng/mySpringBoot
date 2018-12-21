package cn.tedu.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.entity.User;

@RestController
public class UserController {
	
	@RequestMapping(value= {"getUser.do"},method=RequestMethod.GET)
	public User getUser() {
		User u=new User();
		u.setName("张三");
		u.setPassword("1234");
		u.setAge(20);
		u.setBrithday(new Date());
		return u;
	}
	
	
	
}
