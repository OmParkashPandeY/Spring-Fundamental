
package com.spring.core.fundamental.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleModelWithInterface implements InitializingBean, DisposableBean {

     public String name;
     public String age;
     public String phone;
     public String email;

     public LifeCycleModelWithInterface() {
          super();
     }

     public LifeCycleModelWithInterface(String name, String age, String phone, String email) {
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

     public void afterPropertiesSet() {
          System.out.println("Initialization method calling....");

     }

     public void destroy() {
          System.out.println("Destroy method calling....");
     }

}
