package com.abhi.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.abhi.dao.Userdaoo;
import com.abhi.exception.Daoexception;
import com.abhi.model.Usermodel;

@Repository
public class UserdaoImpl  implements Userdaoo  {


	@Autowired
	JdbcTemplate co;

	@Override
	public java.util.List<Usermodel> data() throws Daoexception {

		return co.query("select * from Us", new BeanPropertyRowMapper<Usermodel>(Usermodel.class));
	}

	
	String sql = "select * from Us where name =? and mobile=?";
	@Override
	public List<Map<String, Object>> findbyname(String name, Integer mobile) throws Daoexception {
		return co.queryForList(sql, name, mobile);
	}
	

}
