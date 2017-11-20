package com.yzw.beans;

/**
 * @ClassName:userDao
 * @Description:TODO
 * @author: acer
 * @date 2017年9月28日上午11:42:13
 */
public class UserBean {
	private int id;
	private String name;
	private String passWord;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
