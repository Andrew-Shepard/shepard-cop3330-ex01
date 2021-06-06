package build;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Andrew Shepard
 */
//https://i.imgur.com/SCUizVa.png
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, "+name+", nice to meet you!");

    }
}

