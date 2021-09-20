package contacts_app;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

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

    public static void initializeContacts() throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            contacts.add(new Contact(sc.next() + " " + sc.next(), sc.nextLong()));
        }
    }

    public static void createContactsFile() throws IOException {
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        int counter = 0;
        for (Contact contact: contacts) {
            if (counter != contacts.size() - 1) {
                pw.println(contact.getName() + " " + contact.getNumber());
            } else {
                pw.print(contact.getName() + " " + contact.getNumber());
            }
            counter++;
        }
        pw.close();
    }

    public static void printContacts() throws FileNotFoundException {

        System.out.println("Name | Phone number");
        System.out.println("--------------");
        for (Contact contact: contacts) {
            System.out.printf("%s | %d\n", contact.getName(), contact.getNumber());
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

    public static void deleteContact() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> newContacts = new ArrayList<>();
        System.out.println("Enter the name of the contact you want to delete: ");
        String search = sc.nextLine();
        for (Contact contact : contacts) {
            if (!contact.getName().toUpperCase().contains(search.toUpperCase())) {
                newContacts.add(contact);
            }
        }
        contacts = newContacts;
        createContactsFile();
    }

    public static void runContactsApp() throws IOException {
        initializeFile();
        initializeContacts();
        boolean goOn = true;
        System.out.println("Welcome to the Contacts App");
        do {
            System.out.println("Would you like to: ");
            System.out.println("1. View contacts");
            System.out.println("2. Add a new contact");
            System.out.println("3. Search a contact by name");
            System.out.println("4. Delete an existing contact");
            System.out.println("5. Exit");
            System.out.println("Enter an option(1, 2, 3, 4, or 5): ");
            Scanner sc = new Scanner(System.in);
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1: printContacts();
                    break;
                case 2: addContact();
                    break;
                case 3: searchContact();
                    break;
                case 4: deleteContact();
                    break;
                case 5: goOn = false;
                    break;
            }
        } while (goOn);
    }





    public static void main(String[] args) throws IOException {
        runContactsApp();
    }
}
