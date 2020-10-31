package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please, enter a number.");
        Scanner kboard = new Scanner(System.in);
        int num = kboard.nextInt();
        String s = "*";
        int n1;
        int n2;
        int sum;
        double num1;

        while(true){
            n1 = num%10;
            num1 = num/10;
            n2 = (int) Math.floor(num1);
            sum = n1+n2;
            if(sum<10){
                System.out.println(n1+n2);
                break;
            }else {
                num = n1 + n2;
            }
        }
    }
}
