/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

/**
 *
 * @author Manahil Khalid
 */
public class CalculatorMainClass {
    public  int addition(int num1,int num2){
        return num1+num2;
    }
    
    public  int subtraction(int num1,int num2){
        return num1-num2;
    }
    
    public  int multiplication(int num1,int num2){
        return num1*num2;
    }
    
    public  double division(double num1,double num2){
        if(num2==0){
            throw new IllegalArgumentException("Denominator should not be zeo");
        }
        return num1/num2;
    }
}
