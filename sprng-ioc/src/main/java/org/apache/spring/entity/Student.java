package org.apache.spring.entity;

public class Student {
	private int id;
	private String name;
	private String className;
	private int age;

	public int getId() {
		return id;
	}

	public Student() {
		System.out.println("学生信息");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", className="
				+ className + ", age=" + age + "]";
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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
