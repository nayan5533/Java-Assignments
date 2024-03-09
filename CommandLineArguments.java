/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.commandlinearguments;

/**
 *
 * @author nayan
 */
public class CommandLineArguments {

    public static void main(String[] args) {
        int sum = 2;
        int invalidCount = 0;
        
        for(String arg : args){
            try { 
                int num = Integer.parseInt(arg);
                sum += num;
            }catch (NumberFormatException e){
                System.err.println("Invalid integer: " + arg);
                invalidCount++;
            }
        }
        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Number of invalid integers: " + invalidCount);
    }
}
