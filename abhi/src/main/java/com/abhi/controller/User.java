package com.abhi.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abhi.model.Usermodel;
import com.abhi.service.UserService;

@RestController
public class User {

	@Autowired
	UserService dao;

	@GetMapping("/")
	public String abhi() {

		return "Welcome to my page ";
	}

	@GetMapping("/dao")
	public List<Usermodel> model() {
		return dao.data();

	}

	@PostMapping("/data")
	public List<Map<String, Object>> data(String name, Integer mobile) {
		return dao.findbyname(name, mobile);
	}

}
