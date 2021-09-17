package contacts_app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ContactsApp{
    private static File file = new File("/Users/shirleyp1097/IdeaProjects/codeup-java-exercises/src/contacts_app/contacts.txt");
    private HashMap<String, Double> contacts = new HashMap<>();

    public static void populateHashMap() throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        if (sc.hasNextLine()) {
            System.out.println("yo");
        } else {
            System.out.println("nah, bruh");
        }
    }



    public static void viewContacts() throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

    public static void addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter contact name");
        String contactName = sc.nextLine();
        System.out.println("Enter contact phone number");
        double contactNumber = sc.nextDouble();
    }

    public static void main(String[] args) throws FileNotFoundException {
        populateHashMap();
    }
}
