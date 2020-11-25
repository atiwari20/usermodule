package com.abhi.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.abhi.model.Usermodel;

@Repository
public class Userdao {

	@Autowired
	JdbcTemplate co;

	public java.util.List<Usermodel> data() {

		return co.query("select * from Us", new BeanPropertyRowMapper<Usermodel>(Usermodel.class));
	}

	
	String sql = "select * from Us where name =? and email=?";

	public List<Map<String, Object>> findbyname(String name, Integer mobile) {
		return co.queryForList(sql, name, mobile);
	}

}
