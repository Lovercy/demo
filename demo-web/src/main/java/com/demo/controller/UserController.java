package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.User;
import com.demo.service.UserService;

@Controller
@RequestMapping("/com/demo/user")
public class UserController {
	@Autowired 
	private UserService userService;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(String Id){
		User u=userService.getById(Id);
		return u;
	}

}
