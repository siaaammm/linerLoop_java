/*
  Write a Java code that would print the following sequences using while loop:
*/

public class cw1a_4 {
    public static void main (String [] args) {
      int i = 24;
      
      while (i >= -6) {
        if (i != -6) {
        System.out.print (i + ",");
        } else {
        System.out.print (i);
        }
        i = i - 6;
      }
    }
  }
  