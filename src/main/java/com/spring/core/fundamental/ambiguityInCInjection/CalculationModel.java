package com.spring.core.fundamental.ambiguityInCInjection;

public class CalculationModel {
     public int firstNumber;
     public int secondNumber;

     // Double type constructor
     public CalculationModel(double firstNumber, double secondNumber) {
          this.firstNumber = (int) firstNumber;
          this.secondNumber = (int) secondNumber;
          System.out.println("Second constructor calling... (double, double)");
     }

     // Integer type constructor
     public CalculationModel(int firstNumber, int secondNumber) {
          this.firstNumber = firstNumber;
          this.secondNumber = secondNumber;
          System.out.println("First constructor calling... (int, int)");
     }

     // String type constructor
     public CalculationModel(String firstNumber, String secondNumber) {
          this.firstNumber = Integer.parseInt(firstNumber);
          this.secondNumber = Integer.parseInt(secondNumber);
          System.out.println("Third constructor calling... (String, String)");
     }

}
