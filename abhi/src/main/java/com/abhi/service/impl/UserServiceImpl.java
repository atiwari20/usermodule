package com.abhi.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.dao.Userdao;
import com.abhi.model.Usermodel;
import com.abhi.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	Userdao dao;

	@Override
	public List<Usermodel> data() {
		// TODO Auto-generated method stub
		return dao.data();
	}

	@Override
	public List<Usermodel> findbyname() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Map<String, Object>> findbyname(String name, Integer mobile) {
		
		return dao.findbyname(name, mobile);
	}

}
