//Write a program to print the sum of first n even numbers using while loop.

package com.company;
public class SK_25_PS5 {
    public static void main(String[] args) {
    
    int i=1,sum=0;
        int n=5;
        while(i<=n)
        {
            sum=sum+(2*i);
            i++;
        }
        System.out.println("First 5 even natural numbers sum are " + sum);
  }
}
