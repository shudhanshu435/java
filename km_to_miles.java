//Write a java program to convert kilometres to miles

package com.company;
import java.util.Scanner;
public class SK_07_PS1 {
    public static void main(String[] args) {

        System.out.println("Enter distance in kilometres");
        Scanner distance = new Scanner(System.in);
        double a = distance.nextFloat();
        double b = a * 0.621;
        System.out.println(b);

    }
}
