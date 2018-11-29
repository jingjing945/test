package com.hongcheng.sbdemo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hongcheng.sbdemo.bean.Student;
import com.hongcheng.sbdemo.bean.User;
import com.hongcheng.sbdemo.service.StudentServiceImpl;

@Controller
public class HelloController2 {

	@RequestMapping("getUser01")
	@ResponseBody
	//返回json数据格式的数据
	public User getUser() {
		User user = new User();
		user.setAge(12);
		user.setName("小绵羊");
		user.setSex("男");
		return user;
	}
	
	@Resource
	private StudentServiceImpl service;
	@RequestMapping("tostudent")
	public String user(Model model){
	List<Student> list = service.selectStudents();
	model.addAttribute("student", list);
	return "test";
	}
}
