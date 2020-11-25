package com.abhi.dao;

import java.util.List;
import java.util.Map;

import com.abhi.exception.Daoexception;
import com.abhi.model.Usermodel;

public interface Userdaoo {

	List<Usermodel> data() throws Daoexception;

	

	List<Map<String, Object>> findbyname(String name, Integer mobile) throws Daoexception;

}
