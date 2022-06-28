package com.exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    private String name;
    private String number;

    private static ArrayList<Contact> listContact = new ArrayList<>();

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Contact() {}

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return " ** Name : "+getName()+
                " Number : "+getNumber()+" ** ";
    }

    public ArrayList<Contact> getListContact() {
        return listContact;
    }

    public void setListContact(ArrayList<Contact> listContact) {
        this.listContact = listContact;
    }
    public void addNewContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the name: ");
        String newName = scanner.next();
        while (newName.equals(null) || newName.equalsIgnoreCase("")){
            System.out.println("Give the name: ");
            try {
                newName = scanner.next();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Give the number: ");
        String newNumber = scanner.next();
        while (newNumber.equals(null) || newNumber.equalsIgnoreCase("")){
            System.out.println("Give the number: ");

            try {
                newNumber = scanner.next();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        listContact.add(new Contact(newName,newNumber));
    }

    public int searchContact(String number){
        int counter = 0;
        int index = -1;
        System.out.println(listContact);
        for(Contact contact: listContact){
            if (contact.getNumber() != null && contact.getNumber().contains(number)){
                index =  counter;
            }
            counter ++;
        }
        return index;
    }

    public void showAllContactInfo() {
        System.out.println("You have a list of ("+ getListContact().size()+")");
        System.out.println("----------------------");
        for (int i = 0; i < getListContact().size(); i++) {
            System.out.println(getListContact().get(i)+" (index:"+i+")");
        }
    }

    public Contact deleteContact(int indexOfTheNumberToRemove){
        return listContact.remove(indexOfTheNumberToRemove);
    }

}
