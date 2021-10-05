package com.bridgelabz;

/**
 * Address book problem
 *
 * @author : Anji Raj Ardula
 * @version : 16.0
 * @since : 05/10/2021
 */

/*
Declaring Main method Here
Defining newContactDetails
Print the contact details
*/

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Problem");

        ContactDetails newContactDetails = new ContactDetails();

        newContactDetails.setFirstName("Anji Raj\n");
        newContactDetails.setLastName("Ardula\n");
        newContactDetails.setAddress("Nalgonda\n");
        newContactDetails.setCity("Miryalaguda\n");
        newContactDetails.setState("Telangana\n");
        newContactDetails.setZipCode(508207);
        newContactDetails.setPhoneNumber(8333877108L);
        newContactDetails.setEmail("anjirajardula@gmail.com\n");
        System.out.println(" the contact details are : \n" + newContactDetails);
    }

}
