package com.hongcheng.sbdemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.hongcheng.sbdemo.bean.Student;

@Mapper
public interface IStudentDao {

	@Select("select * from student")
	List<Student> selectStudents();
}
