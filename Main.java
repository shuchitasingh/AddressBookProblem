package com.bridgelabz;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program.");

        Contact storeValue = new Contact("abc", "efg", "klm", "mno", "abc01@gmail.in", 909878, 10230);
        storeValue.Display();

        AddContact displayContact = new AddContact();
        displayContact.NewContact();

        displayContact.edit();
        List values = displayContact.list;
        System.out.println(values);
    }
    }


