package com.spring.core.fundamental.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.fundamental.helpers.HeyJava;

public class LifeCycle {
     public String configPath = "com/spring/core/fundamental/lifeCycle/life-cycle.config.xml";
     AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] { configPath });

     public void getEmployeeInformation() {
          HeyJava heyJava = new HeyJava();

          // LifeCycleModelWithConfig bean1 = (LifeCycleModelWithConfig)
          // context.getBean("bean1");
          // LifeCycleModelWithInterface bean2 = (LifeCycleModelWithInterface)
          // context.getBean("bean2");
          LifeCycleModelWithAnnotation bean3 = (LifeCycleModelWithAnnotation) context.getBean("bean3");
          context.registerShutdownHook();
          // ------------------------------------------------------------

          String name3 = bean3.getName();
          String age3 = bean3.getAge();
          String phone3 = bean3.getPhone();
          String email3 = bean3.getEmail();

          heyJava.printLine();
          heyJava.print("Name => " + name3);
          heyJava.print("Age => " + age3);
          heyJava.print("Phone => " + phone3);
          heyJava.print("Email => " + email3);
          heyJava.printLine();

          // ------------------------------------------------------------

          // String name2 = bean2.getName();
          // String age2 = bean2.getAge();
          // String phone2 = bean2.getPhone();
          // String email2 = bean2.getEmail();

          // heyJava.printLine();
          // heyJava.print("Name => " + name2);
          // heyJava.print("Age => " + age2);
          // heyJava.print("Phone => " + phone2);
          // heyJava.print("Email => " + email2);

          // ------------------------------------------------------------

          // String name1 = bean1.getName();
          // String age1 = bean1.getAge();
          // String phone1 = bean1.getPhone();
          // String email1 = bean1.getEmail();

          // heyJava.printLine();
          // heyJava.print("Name => " + name1);
          // heyJava.print("Age => " + age1);
          // heyJava.print("Phone => " + phone1);
          // heyJava.print("Email => " + email1);

          // ------------------------------------------------------------
     }
}
