package com.talkweb.tangjia.springboot_restful_singlemodule.dao;

import java.util.List;

import com.github.pagehelper.Page;
import com.talkweb.tangjia.springboot_restful_singlemodule.model.User;

public interface UserMapper {
	public int insertUser(User user);
	
	public List<User> selectAllUsers();
	
	public Page<User> selectUsersByPage();
}
