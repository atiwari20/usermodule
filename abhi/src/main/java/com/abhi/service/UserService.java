package com.abhi.service;

import java.util.List;
import java.util.Map;

import com.abhi.model.Usermodel;

public interface UserService {
	
	List<Usermodel> data() ;
	 List<Usermodel> findbyname() ;

	List<Map<String, Object>> findbyname(String name, Integer mobile);

}
