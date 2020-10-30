package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please, enter a number.");
        Scanner kboard = new Scanner(System.in);
        int num = kboard.nextInt();
        double num1 = num/2;
        int num2 = (int) Math.floor(num1);
        System.out.println(num2);
        int i = 2;
        while(i<=num2){
            //System.out.println(num1 +""+ i);
            if(num%i==0){
                System.out.println(num+" is not prime.");
                break;
            }else if(i==num2){
                System.out.println(num+" is prime.");
            }
            i++;
        }
        }
    }
