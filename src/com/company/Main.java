package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String string = "tuukhng";
        String[] string2 = {"a", "i" , "u", "e", "o"};
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string2.length; j++) {
                if (string2[j].equals(String.valueOf(string.charAt(i))))
                System.out.println(string2[j]);
            }
        }
    }
}
