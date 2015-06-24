package com.skyfly33.entity;

public class User {
	Integer id;
	String firstName;
	String lastName;
	Integer age;

	User() {
	}

	User(int id, String first, String last, int age) {
		this.id = id;
		this.firstName = first;
		this.lastName = last;
		this.age = age;
	}

	public String toString() {
		return "" + id + ", " + firstName + ", " + lastName + ", " + age;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
