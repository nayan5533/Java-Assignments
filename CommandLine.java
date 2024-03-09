/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.commandline;

/**
 *
 * @author nayan
 */
public class CommandLine {

    public static void main(String[] args) {
        if (args.length > 0){
            String name = args[0];
            System.out.println("Hello " + name + "!");
        }else{
        System.out.println("Please provide a name as a command line argument.");
    }
}
}