package com.bridgelabz;

import java.util.Scanner;

/**
 * Address book problem
 *
 * @author : Anji Raj Ardula
 * @version : 16.0
 * @since : 09/10/2021
 */

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Problem \n");
        Scanner sc = new Scanner(System.in);
        NewAddressBook person = new NewAddressBook();
        person.addContact();
        System.out.println("Enter Y To Edit The Contact");
        String op = sc.nextLine();

        if (op.equals("y") || op.equals("Y")) {
            person.editContact();
            System.out.println("You have Entered following data");
            System.out.println("The Contact Details After Editing : " + person);
        }
    }
}









