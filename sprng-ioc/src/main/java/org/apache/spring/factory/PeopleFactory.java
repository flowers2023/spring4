package org.apache.spring.factory;

import org.apache.spring.entity.People;

public class PeopleFactory {

	public PeopleFactory() {
		// TODO Auto-generated constructor stub
	}
    //动态创建bean	
	public People  createPeople(){
		People p=new People();
		p.setId(7);
		p.setName("小七");
		p.setAge(77);
		return p;
	}
	
	//静态创建bean
	public static People createPeopleStatic(){
		People p=new People();
		p.setId(8);
		p.setName("小八");
		p.setAge(88);
		return p;
	}

}
