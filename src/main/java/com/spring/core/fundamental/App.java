package com.spring.core.fundamental;

import com.spring.core.fundamental.helpers.HeyJava;
import com.spring.core.fundamental.lifeCycle.LifeCycle;

/**
 * Hello world!
 *
 */
public class App extends HeyJava {

	static LifeCycle lifeCycle = new LifeCycle();

	public static void main(String[] args) {

		lifeCycle.getEmployeeInformation();

	}

}
