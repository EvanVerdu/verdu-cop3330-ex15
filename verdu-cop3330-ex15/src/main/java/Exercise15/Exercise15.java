package Exercise15;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise15 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String Password = "abc$123";

        System.out.print("What is the username? ");
        String username = scanner.nextLine();

        System.out.print("What is the password? ");
        String password = scanner.nextLine();

        if (Password.equals(password)) {
           System.out.print("Welcome!");
        }

        else {
            System.out.print("I don't know you.");
        }




    }

}
