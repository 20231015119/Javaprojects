/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author Estudiantes
 */
public class Calculator{

  public int add(int a, int b){
    return a + b;
  }

  public int substract(int a, int b){
    return a - b;
  } 

  public int multiply(int a, int b){
    return a*b;
  }

  public double divide(int a, int b){
    return a/b;
  }

  public int modulo(int a, int b){
    return a%b;
  }

  public static void main(String[] args) {
   Calculator myCalculator= new Calculator(); 
   System.out.println(myCalculator.add(5,7));
   System.out.println(myCalculator.substract(45,11));
   System.out.println(myCalculator.multiply(3,2));
  
  }
}