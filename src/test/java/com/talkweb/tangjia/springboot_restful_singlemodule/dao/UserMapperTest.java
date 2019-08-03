package com.talkweb.tangjia.springboot_restful_singlemodule.dao;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.talkweb.tangjia.springboot_restful_singlemodule.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = com.talkweb.tangjia.springboot_restful_singlemodule.App.class)
@WebAppConfiguration
public class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;
	
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
	public void selectAllUsersTest() {
		List<User> users=userMapper.selectAllUsers();
		System.out.println(users);
	}
	
}
