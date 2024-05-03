/*
 Write a program in Java that asks the user for an integer input, and print the individual digits forward (From left to right)
 */

 import java.util.Scanner;

 public class hw5_4 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Enter an integer: ");
         int number = scanner.nextInt();
         int tempNumber = number;
         int numDigits = 0;
         
         while (tempNumber != 0) {
             tempNumber /= 10;
             numDigits++;
         }
         
         int power = (int) Math.pow(10, numDigits - 1);
         
         System.out.print("Individual digits forward: ");
         for (int i = 0; i < numDigits; i++) {
             int digit = number / power;
             System.out.print(digit);
             if (power / 10 != 0) {
                 System.out.print(", ");
             }
             number %= power;
             power /= 10;
         }
         System.out.println();
         
         scanner.close();
     }
 }
 
 
 
 
 
 
 
 
 
 