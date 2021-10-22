/* write a program to find out whether a student is pass or fail:
if it requires total 40% and at least 33% in each subject to pass.
Assume  3 subjects and take marks as an input from the user. */


package com.company;
import java.util.Scanner;
public class SK_19_PS4 {
    public static void main(String[] args) {
    
    byte m1,m2,m3;
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter your marks in physics:");
        m1 = marks.nextByte();
        System.out.println("Enter your marks in chemistry:");
        m2 = marks.nextByte();
        System.out.println("Enter your marks in maths:");
        m3 = marks.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage is :" + avg);
        if (avg>40 && m1>33 && m2>33 && m3>33)
            System.out.println("Congratulations, You have been promoted");
        else
            System.out.println("You have not been promoted! Please try again");

    }
}
