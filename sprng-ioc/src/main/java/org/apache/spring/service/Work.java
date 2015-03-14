package org.apache.spring.service;


public class Work {
	private Tester tester;
	public void setTester(Tester tester) {
		this.tester = tester;
	}
	public Work() {
		// TODO Auto-generated constructor stub
		
	}
	public void dotest() {
		tester.test();
	}

}
