//Write a java program to ask the user to enter his/her name and greets them with "Hello <name> have a good day " text.

package com.company;
import java.util.Scanner;
public class SK_07_PS1 {
    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");

    }
}
