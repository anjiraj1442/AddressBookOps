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
        System.out.println(person.newPerson);
        System.out.println("Enter the choice \n 1. Edit \n 2. Delete");
        int option = sc.nextInt();
        switch (option){
            case 1:
                person.editContact();
                System.out.println("You have Entered following data");
                System.out.println(person.newPerson);
                System.out.println("Thank you for Using the Address book");
                break;

            case 2:
                person.deleteContact();
                System.out.println("Address Book details :" + person.newPerson);
                break;
        }
        }
    }










