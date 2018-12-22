package cn.tedu.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import cn.tedu.pojo.Myuser;
import cn.tedu.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value= {"getUser.do"},method=RequestMethod.GET)
	public Myuser getUser() {
		Myuser user=service.queryUserById(1);
		return user;
	}
	
	@RequestMapping(value= {"updateUser.do"},method=RequestMethod.GET)
	public String uodateUser() {
		Myuser user=new Myuser();
		user.setId(1);
		user.setUsername("赵云");
		service.updateUser(user);
		return "修改成功";
	}
	@RequestMapping(value= {"queryUsers.do"},method=RequestMethod.GET)
	public List<Myuser> queryUsers() {
		List<Myuser> users=service.queryUserList();
		return users;
	}
	
	@RequestMapping(value= {"insert.do"},method=RequestMethod.GET)
	public String insert() {
		Myuser user=new Myuser();
		user.setUsername("关羽");
		user.setAge(35);
		user.setBrithday(new Date());
		user.setGander("男");
		user.setPassword("23456");
		service.saveUser(user);;
		return "添加成功";
	}
	
}
