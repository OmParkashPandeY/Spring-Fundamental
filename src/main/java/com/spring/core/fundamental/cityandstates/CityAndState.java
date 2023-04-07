package com.spring.core.fundamental.cityandstates;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.fundamental.helpers.HeyJava;

public class CityAndState {
     public String configPath = "com/spring/core/fundamental/cityandstates/cities-state-config.xml";
     ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { configPath });

     public void getStateInformation() {
          HeyJava heyJava = new HeyJava();

          StatesModel bean = (StatesModel) context.getBean("State1");

          String stateName = bean.getStateName();
          String cityName = bean.getCities().getCityName();

          heyJava.printLine();
          heyJava.print("State Name => " + stateName);
          heyJava.print("City Name => " + cityName);

     }
}
