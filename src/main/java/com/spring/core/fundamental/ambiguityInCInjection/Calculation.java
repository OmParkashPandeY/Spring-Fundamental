package com.spring.core.fundamental.ambiguityInCInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Calculation {
     public String configPath = "com/spring/core/fundamental/ambiguityInCInjection/ambiguity-injection-config.xml";
     ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { configPath });

     public void doSum() {

          CalculationModel calculationModel = (CalculationModel) context.getBean("firstBean");
          int numberFirst = calculationModel.firstNumber;
          int numberSecond = calculationModel.secondNumber;
          System.out.println("The first number is => " + numberFirst);
          System.out.println("The second number is => " + numberSecond);
          System.out.println("The sum of first and second number is => " + (numberFirst + numberSecond));
     }

}
