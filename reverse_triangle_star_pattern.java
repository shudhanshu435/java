 /* Write a program to print the following pattern...
        *****
        ****
        ***
        ** 
        *                                        
                                                    */
  
package com.company;
public class SK_25_PS5 {
    public static void main(String[] args) {
    
     for (int i=0;i<5;i++)
        {
            for (int j=i;j<5;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

