package com.bridgelabz;

import java.util.Scanner;

public class NewAddressBook {
    Scanner sc = new Scanner(System.in);
      /*
    Declaring The Add Contact Method
    And Entering The Contact Details By Using Scanner Class
    And Printing The Contact Details Of Person
     */

    public void addContact(){
       ContactDetails newPerson = new ContactDetails();
        System.out.println("Enter First Name:  ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name:  ");
        String lastName = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        System.out.println("Enter City: ");
        String city = sc.nextLine();
        System.out.println("Enter State: ");
        String state = sc.nextLine();
        System.out.println("Enter zip code: ");
        int zipcode = sc.nextInt();
        System.out.println("Enter Phone Number: ");
        Long phoneNumber = sc.nextLong();
        System.out.println("Enter Emil Id: ");
        String email = sc.nextLine();
        newPerson.setFirstName(firstName);
        newPerson.setLastName(lastName);
        newPerson.setAddress(address);
        newPerson.setCity(city);
        newPerson.setState(state);
        newPerson.setZipCode(zipcode);
        newPerson.setPhoneNumber(phoneNumber);
        newPerson.setEmail(email);
        System.out.println("details of "+firstName+ "\n"+ newPerson);



    }
}
