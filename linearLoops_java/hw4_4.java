/*
Write a program in Java that asks the user for an integer input and counts the number of digits in the number. 
*/

import java.util.Scanner;

public class hw4_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Enter an integer: ");
    int num = sc.nextInt();
    
    int i = 0;
    while (num != 0) {
      i++;
      num = num / 10;
    }
    System.out.println("Number of digits: " + i);
    
    sc.close ();
  }
}
