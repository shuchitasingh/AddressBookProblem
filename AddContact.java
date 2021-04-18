package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddContact {
    Scanner scanner = new Scanner(System.in);
    List list = new ArrayList();

    public void add() {

        System.out.println("Add to new contact book");
        for (int i = 0; i < 2; i++) {
            Contact person = new Contact();
            System.out.println("First Name: ");
            String firstName = scanner.next();
            person.setFirstName(firstName);

            System.out.println("Last Name: ");
            String lastName = scanner.next();
            person.setLastName(lastName);

            System.out.println("City: ");
            String city = scanner.next();
            person.setCity(city);

            System.out.println("State: ");
            String state = scanner.next();
            person.setState(state);

            System.out.println("EmailID: ");
            String email = scanner.next();
            person.setEmail(email);

            System.out.println("Zip: ");
            int zip = scanner.nextInt();
            person.setZip(zip);

            System.out.println("PhoneNumber: ");
            int phoneNo = scanner.nextInt();
            person.setPhoneNo(phoneNo);

            list.add(person);
        }
        System.out.println(list);
    }

    public void edit() {
        System.out.println("Enter your First name:");
        String fname = scanner.next();
        List list = this.list;

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Contact person = (Contact) iterator.next();

            if (fname.equals(person.getFirstName())) {

                System.out.println("Choose  your field for add:");
                System.out.println("LastName-Phone Number-City-Zip-State");

                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Re Enter your lastname");
                        person.lastName = scanner.next();
                        System.out.println("new lastname: " + person.lastName);
                        break;
                    case 2:
                        System.out.println("Re Enter your Phone Number");
                        person.phoneNo = scanner.nextInt();
                        System.out.println("new PhoneNo: " + person.phoneNo);
                        break;
                    case 3:
                        System.out.println("Re Enter your City");
                        person.city = scanner.next();
                        System.out.println("new city: " + person.city);
                        break;
                    case 4:
                        System.out.println("Re Enter your Zip");
                        person.zip = scanner.nextInt();
                        System.out.println("new zip: " + person.zip);
                        break;
                    case 5:
                        System.out.println("Re Enter your State");
                        person.state = scanner.next();
                        System.out.println("new state: " + person.state);
                        break;
                }

            }
        }
    }

    public void NewContact() {
    }
}

