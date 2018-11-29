package com.hongcheng.sbdemo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hongcheng.sbdemo.bean.Student;
import com.hongcheng.sbdemo.dao.IStudentDao;


@Service
public class StudentServiceImpl implements IStudentService {
	
	@Resource //@Autowired
	private IStudentDao dao;
	@Override
	public List<Student> selectStudents() {
		
		return dao.selectStudents();
	}

}
