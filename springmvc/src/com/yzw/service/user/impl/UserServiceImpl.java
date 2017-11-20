/**
 * @Title:UserService.java
 * @Package:com.yzw.service.impl
 * @Description:TODO
 * @author:yzw
 * @date:2017年9月28日下午3:46:51
 * @version:V1.0	
 */
package com.yzw.service.user.impl;

import org.springframework.stereotype.Service;

import com.yzw.beans.UserBean;
import com.yzw.dao.UserDao;
import com.yzw.service.user.IUserService;

/**
 * @ClassName:UserService
 * @Description:TODO
 * @author: yzw
 * @date 2017年9月28日下午3:46:51
 */
@Service
public class UserServiceImpl implements IUserService{
	private UserDao userDao;
	/* (non-Javadoc)
	 * @see com.yzw.service.user.IUserService#findUser(java.lang.String, java.lang.String)
	 */
	@Override
	public UserBean checkLogin(String username, String password) {
		UserBean user = null;
		user = userDao.findUser(username, password);
		
		return user;
	}
	
}
