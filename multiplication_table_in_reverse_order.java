\\Write a program to print multiplication table of 10 in reverse number.

package com.company;
public class SK_25_PS5 {
    public static void main(String[] args) {
    
    int n=10;
        for (int i=10;i>0;i--)
        {
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
     }
}
