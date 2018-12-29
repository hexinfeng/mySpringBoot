package cn.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.tedu.pojo.Myuser;

@Mapper
public interface UserMapper {
	List<Myuser> queryUser();
}
