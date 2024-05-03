/*
Write a Java program that will read 10 numbers from the user, and then print the first number,
the sum of the first 2 numbers, the first 3 numbers, and so on up to the sum of 10 numbers. 
*/


import java.util.Scanner;
public class hw2_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of terms: ");
    int n = sc.nextInt();
    
    int i = 0;
    int sum = 0;
    
    while (i < n) {
      System.out.print("Enter number: ");
      int num = sc.nextInt ();
      sum = sum + num;
      System.out.println("Sum = " + sum);
      i++;
    }
    
    sc.close();
  }
}
