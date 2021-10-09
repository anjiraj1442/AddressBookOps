package com.bridgelabz;

import java.util.Scanner;

public class NewAddressBook {
    Scanner sc = new Scanner(System.in);
 ContactDetails newPerson = new ContactDetails();

    public void addContact(){
       ;
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

 public void editContact() {
  System.out.println("Enter the FirstName of person");
  System.out.println("Enter the firstName of person");
  String editName = sc.nextLine();
  if (editName.equalsIgnoreCase(newPerson.getFirstName()))
   addContact();
  else
   System.out.println("The Entered First Name Is Not Match");
  editContact();
 }
}
