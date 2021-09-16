import java.util.Scanner;
import util.Input;

public class GroceryApplication {
    static String[] categories = {"dairy", "meat", "fruitVegetables", "bread", "other"};


    public static void main(String[] args) {
        boolean response = true;

        System.out.println("Would you like to create a grocery list? (Y/n)");
        if (Input.yesNo()) {
            do {
                System.out.println("Would you like to enter a new item?");
                if (Input.yesNo()) {
                    System.out.println("Select a category");
                    for (String category: categories) {
                        System.out.printf("%s ", category);
                    }
                    String category = Input.getString();
                    System.out.println("Enter the name of the item");
                    String name = Input.getString();
                    System.out.println("Enter the quantity of the item");
                    int quantity = Input.getInt();
            } else {
                    response = false;
                }
            } while (response == true);

        }
    }
}
