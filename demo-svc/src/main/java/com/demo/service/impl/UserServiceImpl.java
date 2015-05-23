package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	public User getById(String id) {
		User u=userMapper.getById(id);
		return u;
	}

}
