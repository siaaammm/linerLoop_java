/*
write a Java program that displays the sum of n odd natural numbers. 
*/

import java.util.Scanner;
public class hw1_4 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of terms: ");
    int n = sc.nextInt();
    System.out.println ("The odd numbers are: ");
    
    int i = 0;
    int num = 1;
    int sum = 0;
    
    while (i < n) {
      System.out.println (num);
      sum = sum + num;
      i++;
      num = num + 2;
    }
    
    System.out.println ("The Sum of odd Natural Numbers up to " + n + " terms is: " + sum);
    
    sc.close();
  }
}
