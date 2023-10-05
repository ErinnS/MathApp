package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num_1 = myScanner.nextInt();

        System.out.print("Enter number 2: ");
        int num_2 = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("Possible calculations: ");
        System.out.println("\n(A)dd \n(S)ubtract \n(M)ultiply \n(D)ivide ");
        String action = myScanner.nextLine();
        System.out.println(" Please select an option");
        int option = myScanner.nextInt();

    }





}
