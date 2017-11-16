/**
 * @Title:IUserService.java
 * @Package:com.yzw.service.impl
 * @Description:TODO
 * @author:yzw
 * @date:2017年9月28日下午3:46:17
 * @version:V1.0	
 */
package com.yzw.service.user;

import com.yzw.entity.userEntity;

/**
 * @ClassName:IUserService
 * @Description:TODO
 * @author: yzw
 * @date 2017年9月28日下午3:46:17
 */
public interface IUserService {
	 userEntity checkLogin(String name,String password) ;
}
