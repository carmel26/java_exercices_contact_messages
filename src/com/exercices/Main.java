package com.exercices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact();
        Message message = new Message();
        int option = 0;
        System.out.println("Choose a menu options");
        System.out.println("---------------------");
        System.out.println("1. Manage Contacts");
        System.out.println("2. Manage Message");
        System.out.println("3. Quit");

        Scanner scanner = new Scanner(System.in);
        try {
            option = scanner.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }

        while (option>3 || option<1) {
            System.out.println("Choose a valid menu options");
            try {
                option = scanner.nextInt();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        int subOption = 0;
        int subOption2 = 0;

        while (option < 3) {
                switch (option) {
                    case 1:
                        System.out.println("Choose an options");
                        System.out.println("------------------");
                        System.out.println("1. Show all contact");
                        System.out.println("2. Add new Contact");
                        System.out.println("3. Search for a contact");
                        System.out.println("4. Delete a contact");
                        System.out.println("5. Go back");
                        subOption = scanner.nextInt();
                        while (subOption < 5 && subOption > 0) {
                            switch (subOption) {
                                case 1:
                                    contact.showAllContactInfo();
                                    break;
                                case 2:
                                    contact.addNewContact();
                                    break;
                                case 3:
                                    System.out.println("Give the contact number");
                                    try {
                                        String contactNumber = scanner.next();
                                        int index = contact.searchContact(contactNumber);
                                        if (index >= 0) {
                                            System.out.println("The information for your contact are: ");
                                            System.out.println(contact.getListContact().get(index));
                                        }else {
                                            System.out.println("Pas trouvee");
                                        }
                                    }catch (Exception e){
                                        e.printStackTrace();
                                    }
                                    break;
                                case 4:
                                    System.out.println("Give the contact indexToDelete");
                                    int contactNumberIndex = scanner.nextInt();
                                    Contact deleted = contact.deleteContact(contactNumberIndex);
                                    System.out.println("We deleted: " + deleted);
                                    break;
                            }
                            System.out.println("Choose an options");
                            System.out.println("------------------");
                            System.out.println("1. Show all contact");
                            System.out.println("2. Add new Contact");
                            System.out.println("3. Search for a contact");
                            System.out.println("4. Delete a contact");
                            System.out.println("5. Go back to main menu");
                            subOption = scanner.nextInt();
                        }
                        break;
                    case 2:
                        System.out.println("Choose an options");
                        System.out.println("------------------");
                        System.out.println("1. Show all Message");
                        System.out.println("2. Send Message");
                        System.out.println("3. Go back main menu");

                        subOption2 = scanner.nextInt();
                        while (subOption2 < 3 && subOption2 > 0) {
                            switch (subOption2) {
                                case 1:
                                    message.listOfAllMessage();
                                    break;
                                case 2:
                                    message.sendMessage();
                                    break;
                                case 3:
                                    System.out.println("Give the contact number");
                                    String contactNumber = scanner.nextLine();
                                    contact.searchContact(contactNumber);
                                    break;
                                case 4:
                                    System.out.println("Give the contact indexToDelete");
                                    int contactNumberIndex = scanner.nextInt();
                                    Contact deleted = contact.deleteContact(contactNumberIndex);
                                    System.out.println("We deleted: " + deleted);
                                    break;
                            }
                            System.out.println("Choose an options");
                            System.out.println("1. Show all Message");
                            System.out.println("2. Send Message");
                            System.out.println("3. Go back main menu");
                            try {
                                subOption2 = scanner.nextInt();
                            }catch (Exception e){
                               e.printStackTrace();
                            }
                        }
                        break;
                }
                System.out.println("Choose a menu options");
                System.out.println("---------------------");
                System.out.println("1. Manage Contacts");
                System.out.println("2. Manage Message");
                System.out.println("3. Quit");
                option = scanner.nextInt();
        }

        System.out.println("*** Merci-Thank you-Aksante-Ndakengurutse (See you later) ***");
    }
}
