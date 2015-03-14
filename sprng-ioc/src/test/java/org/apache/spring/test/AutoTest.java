package org.apache.spring.test;

import javax.annotation.Resource;

import org.apache.spring.service.Work;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AutoTest {
	@Resource
	private Work work;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println(work==null);
		work.dotest();
	}

}
