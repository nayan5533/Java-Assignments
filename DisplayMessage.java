/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displaymessage;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class DisplayMessage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message: " );
        String message = scanner.nextLine();
        System.out.println("Your message is: " + message);
        scanner.close();
    }
}
