package com.company;

import java.util.Scanner;
//Առաջադրանք 3: մուտքին տալ թիվ, տպել թվի ֆակտորիալը
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please, enter a number.");
        Scanner kboard = new Scanner(System.in);
        int factorial = 1;
        int num = kboard.nextInt();
        for (int i=2;i<=num;i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
