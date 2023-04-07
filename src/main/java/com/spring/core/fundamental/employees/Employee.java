package com.spring.core.fundamental.employees;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {

     public String configPath = "com/spring/core/fundamental/employees/employee-config.xml";
     ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { configPath });

     public void getEmployeeInformation(String beanName) {

          EmployeeModel employee = (EmployeeModel) context.getBean(beanName);

          String employeeName = employee.getName();
          List<String> phones = employee.getPhones();
          Set<String> addresses = employee.getAddresses();
          Map<String, String> courses = employee.getCourses();

          for (int index = 0; index < phones.size();) {
               // System.out.println(phones.get(index));
               index++;
          }

          System.out.println(employeeName);
          // System.out.println(phones);

          Iterator<String> newAddress = addresses.iterator();

          while (newAddress.hasNext()) {
               System.out.println(newAddress.next());
          }

          System.out.println(courses);
     }

}
