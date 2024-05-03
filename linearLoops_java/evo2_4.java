/*
Write a Java code that asks an integer as input from the user and takes that many integer inputs. Your task is to count how many numbers are non-negative and negative. 
*/

import java.util.Scanner;
public class evo2_4 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print ("Enter an integer: ");
    int num = sc.nextInt ();
    
    int i = 1;
    int po = 0;
    int ne = 0;
    
    while (i <= num) {
      System.out.print ("Enter number " + i + ":");
      int n = sc.nextInt ();
      i++;
      
      if (n >= 0) {
        po++;
      } else {
        ne++;
      }
    }
    
    System.out.println (po + " Non-negative numbers");
    System.out.println (ne + " Negative numbers");
    
    sc.close ();
  }
}
