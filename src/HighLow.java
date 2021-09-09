import java.util.*;

public class HighLow {

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int getUserNumber() {
        Scanner sc = new Scanner(System.in);

        int number = 0;
        boolean isNumber;
        System.out.println("Enter a whole number please: ");

        do {
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                isNumber = true;
            } else {
                System.out.println("Please try again.");
                isNumber = false;
                sc.next();
            }
        } while (!(isNumber));
        return number;
    }

    public static void numberGame() {

        int myNumber = getRandomNumber(1,100);
        do {
            int userNumber = getUserNumber();
            if (userNumber == myNumber) {
                System.out.println("That's correct");
                break;
            } else if (userNumber < myNumber) {
                System.out.println("That's too low!");
                continue;
            } else if (userNumber > myNumber) {
                System.out.println("That's too high!");
                continue;
            }
        } while (true);
    }
    public static void main(String[] args) {
        numberGame();
    }
}

//FINITO