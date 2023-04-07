package com.spring.core.fundamental.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.fundamental.helpers.HeyJava;

public class ConstructorInjection {

     public String configPath = "com/spring/core/fundamental/constructorInjection/constructor-injection-config.xml";
     ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { configPath });

     public void getEmployeeInformation(String beanName) {

          HeyJava heyJava = new HeyJava();
          heyJava.printLine();

          ConstructorInjectionModel user1 = (ConstructorInjectionModel) context.getBean(beanName);
          System.out.println(user1.name);
          System.out.println(user1.age);

          for (SkillsModel skill : user1.skills) {

               heyJava.printLine();

               System.out.println("Name => " + skill.name);
               System.out.println("Duration => " + skill.duration);
               System.out.println("Used for => " + skill.usedFor);

          }

     }
}
