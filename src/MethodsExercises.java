import java.util.Scanner;

public class MethodsExercises {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

//    public static int multiply(int num1, int num2) {
//        int sum = 0;
//        for (int i = 0; i < num1; i++) {
//            sum += num2;
//        }
//        return sum;
//    }

//    public static int getInteger(int min, int max) {
//        Scanner myScanner = new Scanner(System.in);
//        int userInput = myScanner.nextInt();
//        if ((userInput > max) || (userInput < min)) {
//            System.out.print("That number is outside the given range. Please try again.");
//            getInteger(min, max);
//        }
//        return userInput;
//    }
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            input = sc.nextInt();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.print(userInput);
    }

}
