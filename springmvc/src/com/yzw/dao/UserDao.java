/**
 * @Title:UserDao.java
 * @Package:com.yzw.dao
 * @Description:TODO
 * @author:acer
 * @date:2017年11月16日上午10:25:56
 * @version:V1.0	
 */
package com.yzw.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.yzw.entity.userEntity;

/**
 * @ClassName:UserDao
 * @Description:TODO
 * @author: acer
 * @date 2017年11月16日上午10:25:56
 */
@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public userEntity findUser(String name, String password){
		String sql = "select id,name,password from user where name =? and password =?";
		userEntity user = null;
		try {
			RowMapper<userEntity> rm = ParameterizedBeanPropertyRowMapper.newInstance(userEntity.class);
			user = (userEntity) jdbcTemplate.queryForObject(sql, new Object[]{name, password}, rm);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
