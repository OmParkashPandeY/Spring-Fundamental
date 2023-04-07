package com.spring.core.fundamental.students;

public class StudentModel {
	public String firstName;
	public String lastName;
	public String email;
	public String password;
	public int age;
	public long phone;

	// --------------------------------------------

	public StudentModel(String firstName, String lastName, String email, String password, int age, long phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.age = age;
		this.phone = phone;
	}

	// --------------------------------------------
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	// --------------------------------------------
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	// --------------------------------------------

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", age=" + age + ", phone=" + phone + "]";
	}

	// --------------------------------------------

}
