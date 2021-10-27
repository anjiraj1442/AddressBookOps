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
        while (true) {
            System.out.println("Enter the choice \n 1.add \n 2.edit \n 3.delete");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter no of contacts you want create in list");
                    int choose = sc.nextInt();
                    for (int i = 0; i < choose; i++) {
                        person.addContact();
                    }
                    break;

                case 2:
                    person.editContact();
                    System.out.println("You have Entered following data");
                    System.out.println(person.newPerson);
                    System.out.println("Thank you for Using the Address book");
                    break;

                case 3:
                    person.deleteContact();
                    System.out.println("Address Book details :" + person.newPerson);
                    break;
                default:

                    System.out.println("Enter correct the choice");
            }
        }
    }
}










