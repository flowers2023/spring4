package org.apache.spring.test;

import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test {
	public static void main(String[] args) {
		System.out.println("OK");
	}

}