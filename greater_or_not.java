//Use comparison operator to find out whether the given number is greater than the user entered number or not.

package com.company;
import java.util.Scanner;

public class SK_12_PS2 {
    public static void main(String[] args) {
          System.out.println("Enter a number");
          Scanner sc = new Scanner(System.in);
          int num = 5;
          int a = sc.nextInt();
          System.out.println(a>num);
    }
 }
