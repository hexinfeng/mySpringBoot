package cn.tedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
