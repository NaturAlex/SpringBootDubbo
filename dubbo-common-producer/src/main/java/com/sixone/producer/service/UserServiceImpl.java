package com.sixone.producer.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sixone.client.entity.User;
import com.sixone.client.service.IUserService;

/**
 * @Author: zhangtengchen
 * @Date: 2019/7/5 12:01
 */
@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl implements IUserService {

	@Override
	public User getUser(Long id) {
		User u = new User();
		u.setId(id);
		u.setAge(15);
		u.setName("Alex");
		return u;
	}
}
