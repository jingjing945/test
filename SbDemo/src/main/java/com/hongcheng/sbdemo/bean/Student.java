package com.hongcheng.sbdemo.bean;

import java.io.Serializable;

public class Student implements Serializable {

	private int id;
	private String num;
	private String password;
	private String name;
	private double score;
	private String sex;
	public Student() {
		super();
	}
	public Student(int id, String num, String password, String name, double score, String sex) {
		super();
		this.id = id;
		this.num = num;
		this.password = password;
		this.name = name;
		this.score = score;
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", num=" + num + ", password=" + password + ", name=" + name + ", score=" + score
				+ ", sex=" + sex + "]";
	}
}
