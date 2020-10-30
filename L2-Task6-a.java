package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please, enter a number.");
        Scanner kboard = new Scanner(System.in);
        int num = kboard.nextInt();
        String s = "*";
        for (int i=1; i<=num; i++){
            String s1 = s.repeat(i);
            System.out.println(s1);
        }
    }
}
