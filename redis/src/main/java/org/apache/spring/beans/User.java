package org.apache.spring.beans;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -1147075696725831802L;
	//	private static final long serialVersionUID= 
	private String name;
	private Date createDate;
	private int age;
	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", createDate=" + createDate + ", age="
				+ age + "]";
	}
	public User(String name, Date createDate, int age) {
		super();
		this.name = name;
		this.createDate = createDate;
		this.age = age;
	}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.createDate= new Date();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}



}
