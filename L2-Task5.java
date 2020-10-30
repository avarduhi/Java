package com.company;

import javax.annotation.processing.SupportedSourceVersion;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please, enter a number.");
        Scanner kboard = new Scanner(System.in);
        int num = kboard.nextInt();
        int ans = 1;
        while(true){
            if (ans == num) {
                System.out.println("true");
                break;
            } else if (ans>num){
                System.out.println("false");
                break;
            }
            ans *= 2;
        }
    }
}


