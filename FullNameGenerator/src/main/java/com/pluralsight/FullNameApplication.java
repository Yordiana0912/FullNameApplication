package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = "";

        System.out.println("Please enter your first name!");
        String firstname = scanner.nextLine();
        fullName += firstname;

        System.out.println("Please enter your middle name");
        String middlename = scanner.nextLine();

        if(!middlename.isBlank()){
           fullName += " " + middlename;
        }

        System.out.println("Please enter your last name ");
        String lastname = scanner.nextLine();
        fullName +=" "+  lastname;

        System.out.println("Please enter your suffix ");
        String suffix = scanner.nextLine();

        if(!suffix.isBlank()){
            fullName +=" "+ suffix;
        }

        System.out.println("Your name if " + fullName);



    }



}
