package cn.tedu.controller;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.entity.User;
import cn.tedu.pojo.Myuser;
import cn.tedu.utils.Resource;

@Controller
@RequestMapping("hello")
public class HelloController {
	
	@Autowired
	Resource resource;
	
	@Autowired
	StringRedisTemplate strRedis;
	
	@Autowired
	RedisTemplate<String, Object> redis;
	
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
	
	@GetMapping("getExc")
	@ResponseBody
	public String getExc(){
		System.out.println(Integer.parseInt("wewe"));
		return "";
	}
	@GetMapping("getRedis")
	@ResponseBody
	public String getRedis() {
		
		 ValueOperations<String, String> val=strRedis.opsForValue();
		 val.set("tedu", "科技");
		 System.out.println(val.get("tedu"));
		 
		 Myuser u=new Myuser();
		 u.setUsername("赵云");
		 u.setAge(20);
		 u.setGander("男");
		 u.setPassword("1234");
		 
		 ValueOperations<String,Object> val1= redis.opsForValue();
		 val1.set("user", u);
		 
		return val.get("tedu")+","+val1.get("user");
		
	}
}
