package com.clone.deep;

public class Student implements Cloneable {

	private String name;
	private int age;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Object Clone() throws CloneNotSupportedException {

		Student s = new Student();
		s.setName(this.getName());
		s.setAge(this.getAge());
		Address a = new Address();
		a.setCity(this.address.getCity());
		a.setState(this.address.getState());
		s.setAddress(a);
		return s;

	}

}
