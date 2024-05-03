/*
Write a Java program that will keep taking integer numbers as inputs from the user and print the square of those numbers until it gets a negative number and then stop. 
*/

import  java.util.Scanner;
public class cw3_4 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println ("enter number: ");
    int num = sc.nextInt ();
   
    while (num > 0) {
    System.out.println (num + " ^ 2 = " + (num*num) );
    System.out.println ("Enter number: ");
    num = sc.nextInt ();
    } 
    
    sc.close ();
  }
}
