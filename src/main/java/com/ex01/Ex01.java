/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex01;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner getName = new Scanner(System.in); //Creates variable to store users input
        System.out.print("What is your name? ");

        String userInput = getName.nextLine(); //Reads the users input
        System.out.println("Its nice to meet you, " + userInput);

    }

}
