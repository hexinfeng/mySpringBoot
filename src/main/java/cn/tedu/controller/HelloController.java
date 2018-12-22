package cn.tedu.controller;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.entity.User;
import cn.tedu.utils.Resource;

@Controller
public class HelloController {
	
	@Autowired
	Resource resource;
	
	@GetMapping(value="getResource")
	@ResponseBody
	public Resource getResource() {
		Resource bean=new Resource();
		BeanUtils.copyProperties(resource, bean);
		return bean;
	}
	
	@GetMapping(value="getRflt")
	public String getRflt(ModelMap map) {
		map.addAttribute("resource", resource);
	
		return "freemarker/fm";
	}
	@GetMapping("index")
	public String getIndex(ModelMap map) {
		map.addAttribute("name", "hefeng");
		
		User u=new User();
		u.setName("张三");
		u.setAge(20);
		u.setBrithday(new Date());
		map.addAttribute("user", u);
		
		String desc="<font color='green'>helo~tedu</font>";
		map.addAttribute("desc",desc);
		System.out.println(11);
		return "thymeleaf/index";
	}
}
