/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;
import java.util.Scanner;

/**
 *
 * @author Akhtar
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enetr the number one:");
         int num1=sc.nextInt();
         System.out.println("enetr the number two:");
         int num2=sc.nextInt();
          int add=num1+num2;
         System.out.println("Addition="+add);
         int sub=num1-num2;
         System.out.println("substraction="+sub);
         int mul=num1*num2;
         System.out.println("multiplication="+mul);
         int div=num1/num2;
         System.out.println("division="+div);
         
         
          
    }
    
}
