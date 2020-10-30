package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please, enter a number.");
        Scanner kboard = new Scanner(System.in);
        int num = kboard.nextInt();
        String s = "*";
        String space = " ";
        for (int i=1; i<=num; i++){
            String s1 = s.repeat(i);
            String space1 = space.repeat(num-i);
            System.out.println(space1+""+s1);
        }
    }
}
