package com.ezen.springboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.springboard.service.user.UserService;

@Controller
//@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
}
