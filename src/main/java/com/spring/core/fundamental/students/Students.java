package com.spring.core.fundamental.students;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Students {

	StudentModel student = new StudentModel();
	public String xmlPath = "com/spring/core/fundamental/students/student-config.xml";
	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { xmlPath });

	public void setStudnentInformation() {
		student.setFirstName("Om");
		student.setLastName("PandeY");
		student.setEmail("omkumar887786@gmail.com");
		student.setAge(23);
		student.setPhone(7464067216L);
	}

	public void getStudnentInformation() {
		String firstName = student.getFirstName();
		String lastName = student.getLastName();
		String email = student.getEmail();
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
	}

	public void printStudentDetails() {

		StudentModel student1 = (StudentModel) context.getBean("Student1");
		StudentModel student2 = (StudentModel) context.getBean("Student2");
		String firstName1 = student1.getFirstName();
		String firstName2 = student2.getFirstName();
		String lastName = student1.getLastName();
		String email = student1.getEmail();
		System.out.println(firstName2);
		System.out.println(firstName1);
		System.out.println(lastName);
		System.out.println(email);
	}
}
