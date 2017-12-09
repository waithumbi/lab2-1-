/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import operations.*;
 
import java.util.Scanner;
/**
 *
 * @author NjeriAbby
 */
public class Calculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
int f,s;
System.out.println("input first number:");
f = scanner.nextInt();
System.out.println("input second number:");
s = scanner.nextInt();
 

 
Calculator calculator = new Calculator();
int result = calculator.difference();
    }
    
}
