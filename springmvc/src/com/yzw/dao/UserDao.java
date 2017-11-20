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

import com.yzw.beans.UserBean;

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
	
	public UserBean findUser(String name, String password){
		String sql = "select id,name,password from user where name =? and password =?";
		UserBean user = null;
		try {
			RowMapper<UserBean> rm = ParameterizedBeanPropertyRowMapper.newInstance(UserBean.class);
			user = (UserBean) jdbcTemplate.queryForObject(sql, new Object[]{name, password}, rm);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
