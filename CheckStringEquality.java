/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkstringequality;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class CheckStringEquality {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        if (str1.equals(str2)){
            System.out.println("The strings are equal.");
        }else {
            System.out.println("The strings are not equal.");
        }
        scanner.close();
    }
}
