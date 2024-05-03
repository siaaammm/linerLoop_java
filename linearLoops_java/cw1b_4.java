/*
  Write a Java code that would print the following sequences using while loop:
*/

public class cw1b_4 {
    public static void main (String [] args) {
      int i = -10;
      
      while (i <= 20) {
        if (i != 20) {
        System.out.print (i + ",");
        } else {
        System.out.print (i);
        }
       i = i +5;
      }
    }
  }