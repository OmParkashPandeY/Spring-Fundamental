
package com.spring.core.fundamental.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleModelWithAnnotation {

     public String name;
     public String age;
     public String phone;
     public String email;

     public LifeCycleModelWithAnnotation() {
          super();
     }

     public LifeCycleModelWithAnnotation(String name, String age, String phone, String email) {
          this.name = name;
          this.age = age;
          this.phone = phone;
          this.email = email;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getAge() {
          return age;
     }

     public void setAge(String age) {
          this.age = age;
     }

     public String getPhone() {
          return phone;
     }

     public void setPhone(String phone) {
          this.phone = phone;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     @Override
     public String toString() {
          return "LifeCycleModel [name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email + "]";
     }

     @PostConstruct
     public void init() {
          System.out.println("Initialization method calling....");

     }

     @PreDestroy
     public void destroy() {
          System.out.println("Destroy method calling....");
     }

}
