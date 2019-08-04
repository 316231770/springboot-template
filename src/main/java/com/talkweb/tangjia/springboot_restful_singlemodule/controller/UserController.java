package com.talkweb.tangjia.springboot_restful_singlemodule.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.talkweb.tangjia.springboot_restful_singlemodule.service.UserService;

@Controller
public class UserController {
	
	//springboot默认日志记录
	private final static Logger LOG=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;

    @RequestMapping("/allUsers")
    public ModelAndView getTestView(ModelAndView mv){
    	LOG.info("/allUsers");
    	mv.addObject("users", userService.findAllUsers());
    	mv.setViewName("userList");
    	return mv;
    }
    
    @RequestMapping(value = "/home", method=RequestMethod.GET)
    public ModelAndView home(ModelAndView mv) {
    	mv.setViewName("homepage");
    	return mv;
    }
}
