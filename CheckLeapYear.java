/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkleapyear;
import java.util.Scanner;
/**
 *
 * @author nayan
 */
public class CheckLeapYear {

    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a year: ");
        
        int year = scanner.nextInt();
        
        scanner.close();
        
        if (isLeapYear(year)){
            System.out.println(year + " is a Leap Year.");
        }else {
            System.out.println(year + " is not Leap Year.");
        }   
            

        
    }
    public static boolean isLeapYear(int year){
        
        return (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
    }
}
