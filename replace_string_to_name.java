/* Write a java program to fill in a letter template which looks like below:
letter = "Dear <|name|> , Thanks a lot"
Replace <|name|> with a string (some name) */

package com.company;

import java.util.Locale;

public class SK_15_PS3_on_java_string {
    public static void main(String[] args) {
    
        String letter = "Dear <|name|> ,Thanks a lot";
        letter = letter.replace("<|name|>","Shudhanshu");
        System.out.println(letter);
   }
}
