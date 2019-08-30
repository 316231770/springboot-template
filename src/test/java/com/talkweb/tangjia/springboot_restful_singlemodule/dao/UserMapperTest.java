package com.talkweb.tangjia.springboot_restful_singlemodule.dao;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.github.pagehelper.Page;
import com.talkweb.tangjia.springboot_restful_singlemodule.model.User;
import com.talkweb.tangjia.springboot_restful_singlemodule.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = com.talkweb.tangjia.springboot_restful_singlemodule.App.class)
@WebAppConfiguration
public class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Test
	@Ignore
	public void insertUserTest(){
		User user=new User();
		user.setUsername("汤嘉");
		user.setPassword("19900413");
		user.setAge(29);
		user.setBirth(new Date());
		user.setEmail("316231770@qq.com");
		int n=userMapper.insertUser(user);
		System.out.println(n);
	}
	
	@Test
	@Ignore
	public void selectAllUsersTest() {
		List<User> users=userMapper.selectAllUsers();
		System.out.println(users);
	}
	
	@Test
	public void selectUsersBypageTest() {
		Page<User> users=userService.findUsersByPage(1, 2);
		System.out.println(users);
	}
	
}
