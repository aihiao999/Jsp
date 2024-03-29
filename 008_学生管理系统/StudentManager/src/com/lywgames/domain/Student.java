package com.lywgames.domain;

import java.sql.Timestamp;

/**
 * 这是学封装的对象 bean
 */
public class Student {
	private int sid;
	private String sname;
	private String gender;
	private String phone;
	private String hobby;
	private String info;
	private Timestamp birthday;
	
	public Student() {}
	
	public Student(String sname, String gender, String phone, String hobby, String info, Timestamp birthday) {
		this.sname = sname;
		this.gender = gender;
		this.phone = phone;
		this.hobby = hobby;
		this.info = info;
		this.birthday = birthday;
	}
	
	public Student(int sid, String sname, String gender, String phone, String hobby, String info, Timestamp birthday) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.gender = gender;
		this.phone = phone;
		this.hobby = hobby;
		this.info = info;
		this.birthday = birthday;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Timestamp getBirthday() {
		return birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", phone=" + phone + ", hobby="
				+ hobby + ", info=" + info + ", birthday=" + birthday + "]";
	}
	
}
