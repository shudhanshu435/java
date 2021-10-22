package com.company;
import java.util.Scanner;
public class reverse_the_number {

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int op=0;
        while(n!=0)
        {
            int t=n%10;
            n/=10;
            op=op*10+t;
        }
        System.out.println(op);
    }
}
