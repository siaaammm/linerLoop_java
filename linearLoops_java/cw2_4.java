/*
Write a Java program that will take N numbers from the user and find their sum and average using a for loop.
*/

import java.util.Scanner;
public class cw2_4 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter the value of numbers: ");
    int n = sc.nextInt ();
    
    int i = 1;
    int sum = 0;
    while (i <= n) {
    System.out.println ("enter " + i + " number");
    int num = sc.nextInt ();
    i = i + 1;
    sum = sum + num;
    }
    
    double avg = (double)sum/n ;
    System.out.println ("The Sum of " + n + " is " + sum);
    System.out.println ("The Average of " + n + " is " + avg);
    
    sc.close ();
  }
}
