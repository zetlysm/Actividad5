/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationact5;

/**
 *
 * @author hgarz
 */
public class JavaApplicationAct5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 2;
        double result;
        
        int value = (int)num1; 
        int value2 = (int)num2; 
        System.out.println("First number is = "+value);
        System.out.println("Second number is = "+value2);
        System.out.println("----------------------------------------");
        result = num1 + num2;
        System.out.println("Sum: "+num1+ " + " + num2 + " is = " + result);
        result = num1 - num2;
        System.out.println("Substraction: "+num1+ " - " + num2 + " is = " + result);
        result = num1 * num2;
        System.out.println("Multiplication: "+num1+ " * " + num2 + " is = " + result);
        result = num1 / num2;
        System.out.println("Division: "+num1+ " / " + num2 + " is = " + result);
        result = num1 % num2;
        System.out.println("Mod: "+num1+ " mod " + num2 + " is = " + result);
    }
    
}
