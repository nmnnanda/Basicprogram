package Operators;

import java.util.Scanner;

public class DaimondPattran {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of rows: ");
      int rows = sc.nextInt();

      for (int i = 0; i <= rows / 2; i++) {
         for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
         }
         for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
         }
         System.out.println();
      }

      for (int i = rows / 2 + 1; i < rows; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(" ");
         }
         for (int k = 1; k <= 2 * (rows - i) - 1; k++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}


