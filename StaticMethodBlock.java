/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.staticmethodblock;

/**
 *
 * @author nayan
 */
public class StaticMethodBlock {
    //Static variable
    static int staticVariable = 10;
    
    // Static block
    static{
        System.out.println("Inside static block");
        staticVariable = 2; 
    }
    
    // Static method
    static void staticMethod(){
        System.out.println("Inside static method");
        System.out.println("Value of staticVariable: " + staticVariable);
    }

    // Main method 
    public static void main(String[] args) {
        System.out.println("Inside main method");
        staticMethod();
    }
    
}
