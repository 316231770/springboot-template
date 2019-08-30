package com.talkweb.tangjia.springboot_restful_singlemodule.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.talkweb.tangjia.springboot_restful_singlemodule.model.User;
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
    
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public ModelAndView layout(ModelAndView mv) {
    	LOG.info("/layout");
    	mv.addObject("users", userService.findAllUsers());
    	mv.setViewName("layout");
    	return mv;
    }
    
    
    @RequestMapping("/page")
    @ResponseBody
    public PageInfo<User> findWithBLOBsByPage(@RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                              @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize){
        Page<User> users = userService.findUsersByPage(pageNum, pageSize);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }
}
