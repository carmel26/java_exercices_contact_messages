package com.exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class Message extends Contact{
    private Contact contact;
    private String message;
    private ArrayList<Message> listMessage = new ArrayList<>();

    public Message(Contact contact, String message) {
        this.contact = contact;
        this.message = message;
    }

    public Message() {}

    public Contact getContact() {
        return contact;
    }

    public String getMessage() {
        return message;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "From: " +contact.toString()+
                " message: "+getMessage();
    }

    public void sendMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the contact number: ");
        try {
            String contactNumber = scanner.next();
            int indexContact = 0;
            while (contactNumber.equals(null) || contactNumber.equalsIgnoreCase("")){
                System.out.println("Give the contact number: ");
                contactNumber = scanner.next();
            }
            if (searchContact(contactNumber) > -1) {
                indexContact = searchContact(contactNumber);
            }

            String newMessage = scanner.nextLine();
            while (newMessage.equals(null) || newMessage.equalsIgnoreCase("")){
                System.out.println("Give the message : ");
                try {
                    newMessage = scanner.nextLine();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            listMessage.add(new Message(getListContact().get(indexContact), newMessage));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void listOfAllMessage(){
        System.out.println("You have a list of ("+listMessage.size()+")");;
        System.out.println("------------------------");
        for (int i = 0; i < listMessage.size(); i++) {
            System.out.println(listMessage.get(i)+" (index:"+i+")");
        }
    }
}
