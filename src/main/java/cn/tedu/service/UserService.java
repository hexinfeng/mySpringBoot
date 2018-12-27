package cn.tedu.service;

import java.util.List;

import cn.tedu.pojo.Myuser;

public interface UserService {
	
	public void saveUser(Myuser user);
	
	public void updateUser(Myuser user);
	
	public void deleteUser(Integer id);
	
	public Myuser queryUserById(Integer id);
	
	public List<Myuser> queryUserList();
	
	public void saveTransaction(Myuser user);
	
}
