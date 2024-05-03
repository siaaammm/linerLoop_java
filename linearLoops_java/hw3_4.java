/*
write a Java program that will take a positive integer n as input and print all the numbers between 0 to n which are divisible by 5 but not divisible by 3.
*/

import java.util.Scanner;

public class hw3_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a positive integer n: ");
    int n = sc.nextInt();
    
    int i = 0;
    while (i <= n) {
      if (i % 5 == 0 && i % 3 != 0) {
        System.out.println(i);
      }
      i++;
    }
    
    sc.close();
  }
}
