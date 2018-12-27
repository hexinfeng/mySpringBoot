package cn.tedu;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.pojo.Myuser;
import cn.tedu.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo1ApplicationTests {
	
	
	
	@Autowired
	private UserService service;
	
	@Test
	public void contextLoads() {
		List<Myuser> user=service.queryUserList();
		System.out.println(user);
	}
	@Test
	public void saveTransaction() {
		Myuser user=new Myuser();
		user.setUsername("孙八");
		user.setPassword("1234");
		user.setGander("男");
		user.setBrithday(new Date());
		service.saveTransaction(user);
	}

}

