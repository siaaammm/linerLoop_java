/*
Write a Java program that will take an integer as input and - 
a) Find out if the number is a prime number or not.
b) Find out if the number is a perfect number or not.
*/

import java.util.Scanner;
public class hw6_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = sc.nextInt();
    
    if (num % 2 != 0) {
      System.out.println(num + " is a prime number.");
    } else {
      System.out.println(num + " is not a prime number.");
    }
    
    if (num % 2 == 0) {
      System.out.println(num + " is a perfect number.");
    } else {
      System.out.println(num + " is not a perfect number.");
    }
    
    sc.close();
  }
}


