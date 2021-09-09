import java.sql.SQLOutput;
import java.util.Locale;
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
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        int input;
//        do {
//            System.out.println("Enter a number between " + min + " and " + max + ".");
//            input = sc.nextInt();
//            if (input < min || input > max) {
//                System.out.println("Input invalid");
//            }
//        } while (input < min || input > max);
//        System.out.println("Input acceptable");
//        return input;
//    }
//
//    public static void main(String[] args) {
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.print(userInput);
//    }
    public static long getFactorial(long num) {
        int accumulator = 1;
        for (long i = 1; i <= num; i++) {
            accumulator *= i;
        }
        return accumulator;
    }

    public static boolean userConfirm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue? (Y/n)");
        String response = sc.next();
        if (response.toUpperCase().equals("Y")) {
//            System.out.println("true");
            return true;
        } else {
//            System.out.println("false");
            return false;
        }
    }

    public static boolean inRange(long userInput) {
        return (userInput <= 10 && userInput >=  1);
    }

    public static void main(String[] args) {

//        PROBLEM 3 COMPLETE
//        boolean confirm;
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a number from 1 to 10: ");
//            long userLong = sc.nextLong();
//            if (inRange(userLong)) {
//                System.out.println("The factorial of your number is: " + getFactorial(userLong));
//                confirm = userConfirm();
//            } else {
//                System.out.println("Your number is out of range. Please try again.");
//                confirm = true;
//            }
//
//        } while (confirm);
//PROBLEM 4 COMPLETED
//        boolean confirm;
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("How many sides do your two dice have?");
//            int diceSides = sc.nextInt();
//            rolldice(diceSides);
//            confirm = userConfirm();
//        } while (confirm);
    }

    public static void rolldice(int sides) {
        int diceA = (getRandomNumber(1, sides));
        int diceB = (getRandomNumber(1, sides));
        System.out.println("Your roll result is: " + diceA + ' ' + diceB);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }





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
}

