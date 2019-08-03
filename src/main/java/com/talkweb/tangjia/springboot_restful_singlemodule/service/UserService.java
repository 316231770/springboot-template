package com.talkweb.tangjia.springboot_restful_singlemodule.service;

import java.util.List;

import com.talkweb.tangjia.springboot_restful_singlemodule.model.User;

public interface UserService {
	public List<User> findAllUsers();
	
	public void addUser(User user);
}
