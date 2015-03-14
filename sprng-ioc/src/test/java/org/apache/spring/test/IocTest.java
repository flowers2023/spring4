package org.apache.spring.test;


import org.apache.spring.entity.Dog;
import org.apache.spring.entity.People;
import org.apache.spring.entity.Student;
import org.apache.spring.service.Work;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
	ApplicationContext ac;
	@Before
	public void setUp() throws Exception {
		ac=new ClassPathXmlApplicationContext("beans.xml");
	}

	@Test
	public void baseTest() {
		/**
		 * 控制反转即是某一接口的具体实现类的选择控制权从调用类中移除，转交给第三方裁判
		 * 第三方控制类是XML配置的类
		 * 许多非凡的应用（比HelloWorld.java更加优美，更加复杂）都是由两个或是更多的类通过彼此的合作来实现业务逻辑，
		 * 这使得每个对象都需要，与其合作的对象（也就是它所依赖的对象）的引用。如果这个获取过程要靠自身实现，
		 * 那么如你所见，这将导致代码高度耦合并且难以测试。
		 */
		Work work =(Work)ac.getBean("work");
		work.dotest();
	}
	/**
	 * 属性注入
	 */
	@Test
	public void test3() {
		People people3 =(People)ac.getBean("people3");
		System.out.println(people3);
	}
	
	/**
	 * 构造函数注入	类型注入
	 */
	
	@Test
	public void test4() {
		People people4 =(People)ac.getBean("people4");
		System.out.println(people4);
	}
	
	/**
	 * 构造函数注入	索引注入
	 */
	
	@Test
	public void test5() {
		People people5 =(People)ac.getBean("people5");
		System.out.println(people5);
	}
	
	/**
	 * 构造函数注入	混合注入
	 */
	
	@Test
	public void test6() {
		People people6 =(People)ac.getBean("people6");
		System.out.println(people6);
	}
	
	/**
	 * 工厂注入	混合注入
	 */
	
	@Test
	public void test7() {
		People people7 =(People)ac.getBean("people7");
		System.out.println(people7);
	}
	
	/**
	 * 工厂注入	混合注入
	 */
	
	@Test
	public void test8() {
		People people8 =ac.getBean("people8",People.class);
		System.out.println(people8);
	}
	
	/**
	 * 继承
	 */
	@Test
	public void Testabstract(){
		Student tom = ac.getBean("tom",Student.class);
		Student jack = ac.getBean("jack",Student.class);
		System.out.println(tom.toString());
		System.out.println(jack.toString());
	}
	
	/**
	 * 依赖，authority类比Student类预先初始化
	 */
	@Test
	public void Testdepend(){
		Student depend = ac.getBean("depends",Student.class);
		System.out.println(depend.toString());
	}
	
	/**
	 * 引用，people引用了dog
	 */
	@Test
	public void TestRefrence(){
		People myPeople = ac.getBean("myPeople",People.class);
		System.out.println(myPeople.toString());
	}
	
	/**
	 * bean作用范围
	 */
	@Test
	public void TestBeanScope(){
		Dog dog1=ac.getBean("dog",Dog.class);
		Dog dog2=ac.getBean("dog",Dog.class);
		System.out.println(dog1==dog2);
	}
}
