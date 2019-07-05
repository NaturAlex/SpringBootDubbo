package com.sixone.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sixone.client.entity.User;
import com.sixone.client.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: zhangtengchen
 * @Date: 2019/7/5 14:12
 */
@RestController("userController")
@RequestMapping("/user")
public class UserController {
	Logger log = LoggerFactory.getLogger(UserController.class);
	@Reference(version = "1.0.0")
	private IUserService userService;

	@RequestMapping("get")
	public User getUser(){
		System.out.println("userService = " + userService);
		User user = userService.getUser(1L);
		log.info("user = " + user);
		return user;
	}
}
