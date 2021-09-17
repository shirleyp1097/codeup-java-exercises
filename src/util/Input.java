package util;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static String getString() {
        String userString = sc.next();
        return userString;
    }

    public static boolean yesNo() {
        String userInput = sc.next();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public static int getInt(int min, int max) {
            int userInt;
            do {
                System.out.printf("Please input a number %d and %d\n", min, max);
                userInt = sc.nextInt();
                if (!(userInt < max && userInt > min)) {
                    System.out.println("That number is out of range");
                }
            } while (!(userInt < max && userInt > min));
            return userInt;
        }

//        public static int getInt() {
//            return sc.nextInt();
//        }

        public static int getInt() {
//            String userInput = getString();
//            int userInt = 0;
//            try {
//                int userInt = Integer.valueOf(userInput);
//            } catch (Exception e) {
//                System.out.println("You didn't enter an integer");
//                e.printStackTrace();
//            }
//            return userInt;
            String userInput = getString();
            try {
                Integer.valueOf(userInput);
            } catch (Exception e) {
                System.out.println("You didn't enter an integer");
            }
            return Integer.valueOf(userInput);
        }

    }

