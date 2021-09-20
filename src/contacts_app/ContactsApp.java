package contacts_app;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

import static java.nio.file.Files.exists;

public class ContactsApp{
    private static Path filepath = Path.of(System.getProperty("user.dir"));
    private static File file;
    private static ArrayList<Contact> contacts = new ArrayList<>();

    public static void initializeFile() throws IOException {
        if (Files.exists(Path.of(filepath + "/contacts.txt"))) {

        } else {
            Files.createFile(Path.of(filepath + "/contacts.txt"));
        }
        file = new File(filepath + "/contacts.txt");
    }

    public void initializeContacts() throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            contacts.add(new Contact(sc.next() + " " + sc.next(), sc.nextLong()));
        }
    }

    public static void printContacts() throws FileNotFoundException {
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()) {
//            System.out.println(sc.nextLine());
//        }

        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            contacts.add(new Contact(sc.next() + " " + sc.next(), sc.nextLong()));
        }
    }

    public static void addContact() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first and last name of new contact: ");
        String contactName = sc.nextLine();
        System.out.println("Enter phone number of new contact: ");
        long contactNumber = sc.nextLong();
        Contact newContact = new Contact(contactName, contactNumber);
        contacts.add(newContact);

        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println();
        pw.print(newContact.getName() + " " + newContact.getNumber());
        pw.close();
    }

    public static void searchContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your contact: ");
        String search = sc.nextLine();
        System.out.println("Matched contacts: ");
        for (Contact contact: contacts) {
            if (contact.getName().toUpperCase().contains(search.toUpperCase())) {
                System.out.println(contact.getName() + " | " + contact.getNumber());
            }
        }
    }

//    public static void deleteContact() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name of the contact you want to delete: ");
//        String search = sc.nextLine();
//
//    }





    public static void main(String[] args) throws IOException {
        initializeFile();
        printContacts();
        addContact();
//        for (Contact contact: contacts) {
//            System.out.println(contact.getName());
//            System.out.println(contact.getNumber());
//        }
    }
}
