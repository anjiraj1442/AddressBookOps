package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewAddressBook {

    Scanner sc = new Scanner(System.in);
    ContactDetails newPerson = new ContactDetails();

    List contactList = new ArrayList();


    public void addContact() {

        System.out.println("Enter First Name:  ");
        String firstName = sc.next();
        System.out.println("Enter Last Name:  ");
        String lastName = sc.next();
        System.out.println("Enter Address: ");
        String address = sc.next();
        System.out.println("Enter City: ");
        String city = sc.next();
        System.out.println("Enter State: ");
        String state = sc.next();
        System.out.println("Enter zip code: ");
        int zipcode = sc.nextInt();
        System.out.println("Enter Phone Number: ");
        Long phoneNumber = sc.nextLong();
        System.out.println("Enter Emil Id: ");
        String email = sc.next();
        newPerson.setFirstName(firstName);
        newPerson.setLastName(lastName);
        newPerson.setAddress(address);
        newPerson.setCity(city);
        newPerson.setState(state);
        newPerson.setZipCode(zipcode);
        newPerson.setPhoneNumber(phoneNumber);
        newPerson.setEmail(email);

        contactList.add(newPerson);

        System.out.println("details of " + firstName + "\n" + newPerson);


    }

    public void editContact() {

        System.out.println("Enter the FirstName of person");

        String editName = sc.nextLine();
        for (int i = 0; i < contactList.size(); i++) {


            if (editName.equalsIgnoreCase(newPerson.getFirstName()))
                addContact();
            else
                System.out.println("The Entered First Name Is Not Match");
            editContact();
        }
    }

    public void deleteContact() {
        System.out.println("Enter firstName of the person");
        String deleteContact = sc.nextLine();

        for (int i = 0; i < contactList.size(); i++) {
            if (deleteContact.equals(newPerson.getFirstName())) {
                System.out.println("Deleted " + newPerson.getFirstName() + " details");
                newPerson = null;
            }
        }
    }
}