package com.hongcheng.sbdemo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hongcheng.sbdemo.bean.Resource;
import com.hongcheng.sbdemo.bean.Student;
import com.hongcheng.sbdemo.bean.User;
import com.hongcheng.sbdemo.bean.User2;
import com.hongcheng.sbdemo.service.StudentServiceImpl;


@RestController
public class HelloController {
	@RequestMapping("hello")
	public String hello() {
		return "hello springboot!!!";
	}

	@RequestMapping("getUser02")
	//返回json数据格式的数据
	public User getUser() {
		User user = new User();
		user.setAge(12);
		user.setName("小绵羊");
		user.setSex("男");
		return user;
	}
	
	@RequestMapping("getUser03")
	//返回json数据格式的数据
	public User2 getUser03() {
		User2 user = new User2("张静", 25, "女", "45645", new Date(System.currentTimeMillis()), "我们去巴黎铁塔,我们去布拉格脚下");
		return user;
	}
	
	
	@Autowired
	private Resource resource;
	@RequestMapping("getResource01")
	public Resource getResource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return bean;
	}
	
	@Autowired
	private StudentServiceImpl service;
	@RequestMapping("getstudent")
	public List<Student> user(){
	return service.selectStudents();
	}
	
}
