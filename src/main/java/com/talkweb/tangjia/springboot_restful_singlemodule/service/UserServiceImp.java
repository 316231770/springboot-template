package com.talkweb.tangjia.springboot_restful_singlemodule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.talkweb.tangjia.springboot_restful_singlemodule.dao.UserMapper;
import com.talkweb.tangjia.springboot_restful_singlemodule.model.User;

@Service
@Qualifier("userService")
public class UserServiceImp implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAllUsers() {
		return userMapper.selectAllUsers();
	}
	@Override
	public void addUser(User user) {
		
	}
	
}
