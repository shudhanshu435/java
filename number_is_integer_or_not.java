//Write a java program to detect whether a number entered by the user is integer or not.

package com.company;
import java.util.Scanner;
public class SK_07_PS1 {
    public static void main(String[] args) {
    
        System.out.println("Enter your number");
        Scanner num = new Scanner(System.in);
        System.out.println(num.hasNextInt());

    }
}
