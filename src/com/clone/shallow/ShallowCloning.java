package com.clone.shallow;

public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student studentObj = new Student();
		studentObj.setName("Sandeep");
		studentObj.setAge(28);

		Address addrObj = new Address();
		addrObj.setCity("Lucknow");
		addrObj.setState("UttarPradesh");
		studentObj.setAddress(addrObj);

		System.out.println("Initial ----" + studentObj.toString());

		Student obj = (Student) studentObj.Clone();

		System.out.println("Cloned-------" + obj);
		addrObj.setCity("Kanpur");
		addrObj.setState("Delhi");
		
		System.out.println("After Changes in real Object Real Object---"+studentObj.toString());
		System.out.println("After Changes in real Object Cloned Object---"+obj.toString());
		

	}

}
