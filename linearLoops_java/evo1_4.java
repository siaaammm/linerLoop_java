/*
Write a Java program that will take an integer as input and print all the divisors of that number. 
*/


import java.util.Scanner;
public class evo1_4 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println ("enter number: ");
    int n = sc.nextInt ();
    
    int i = 1;
    while (n > 0) {
      if (n % i == 0) {
    System.out.println (i);
      }
       i = i + 1;
    }
    sc.close();
  }
}
