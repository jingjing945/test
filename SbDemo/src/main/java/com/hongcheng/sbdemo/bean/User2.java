package com.hongcheng.sbdemo.bean;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User2 {
	private String name;
	private int age;
	private String sex;
	@JsonIgnore//当前不显示
	private String password;
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")//转换格式
	private Date birthday;
	@JsonInclude(Include.NON_NULL)//从数据库中提取时允许为空
	private String desc;
	public User2() {
		super();
	}
	public User2(String name, int age, String sex, String password, Date birthday, String desc) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.password = password;
		this.birthday = birthday;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "User2 [name=" + name + ", age=" + age + ", sex=" + sex + ", password=" + password + ", birthday="
				+ birthday + ", desc=" + desc + "]";
	}
	
	

}
