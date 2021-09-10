import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String userInput = myScanner.nextLine();
//        System.out.println(userInput);
        if (userInput.endsWith("?")) {
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.isEmpty()) {
            System.out.println("Fine, be that way");
        } else {
            System.out.println("Whatever");
        }

    }

}
