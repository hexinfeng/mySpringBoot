package cn.tedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.tedu.mapper.MyuserMapper;
import cn.tedu.pojo.Myuser;
import cn.tedu.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private MyuserMapper userMapper;

	public void saveUser(Myuser user) {
		
		userMapper.insert(user);
	}

	
	public void updateUser(Myuser user) {
		userMapper.updateByPrimaryKeySelective(user);
		
	}


	public void deleteUser(Integer id) {
	
		userMapper.deleteByPrimaryKey(id);
	}

	
	public Myuser queryUserById(Integer id) {
		Myuser user=userMapper.selectByPrimaryKey(id);
		return user;
	}

	
	public List<Myuser> queryUserList() {
		List<Myuser> user=userMapper.selectAll();
		return user;
	}


	//测试事务回滚的案例:
	//@Transactional 注解可以作用于接口、接口方法、类以及类方法上，但是 Spring 建议不要在接口或者接口方法上使用该注解
	//只被应用到 public 方法上, protected、private 或者默认可见性的方法上使用 @Transactional 注解，这将被忽略，也不会抛出任何异常
	//isolation:设置事务的隔离级别:4个
	//propagation:设置事务的传播特性:
	//REQUIRED:当前存在事务，则加入该事务；如果当前没有事务，则创建一个新的事务。这是默认值(一般增删改用)
	//SUPPORTS:当前存在事务，则加入该事务；如果当前没有事务，则以非事务的方式继续运行(一般查询用)
	//还有其他几个不常用,自行百度
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public void saveTransaction(Myuser user) {
		userMapper.insert(user);
		int i=1/0;
		System.out.println("执行完毕");
		
	}

}
