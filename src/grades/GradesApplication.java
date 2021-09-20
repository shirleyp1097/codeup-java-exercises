package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void runGradesApp() {
        HashMap<String, Student> students = new HashMap<>();
        Student sara = new Student("Sara");
        sara.addGrade(5);
        sara.addGrade(5);
        sara.addGrade(5);

        Student mark = new Student("Mark");
        mark.addGrade(5);
        mark.addGrade(3);
        mark.addGrade(6);

        students.put("sara_is_cool", sara);
        students.put("markTheshark", mark);

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        for (Map.Entry<String, Student> entry: students.entrySet()) {
            System.out.printf("|%s| ", entry.getKey());
        }
        System.out.println();
        System.out.println("What student would you like to see more information on?");


        boolean goOn;
        do {
            Scanner sc = new Scanner(System.in);
            String response = sc.next();
            if (students.containsKey(response)) {
                System.out.println("Name: " + students.get(response).getName());
                System.out.println("GitHub Username: " + response);
                System.out.println("Current Average: " + students.get(response).getGradeAverage());
            } else {
//            SOMETHING WRONG WITH THE TEXT FORMATTING
//            System.out.println("Sorry, no student found with the GitHub username of %s", response);
                System.out.println("Sorry, no student found with the GitHub username of " + response);
            }
            System.out.println("Would you like to see another student? (Type y/n)");
            if (sc.next().equalsIgnoreCase("y")) {
                System.out.println("What student would you like to see more information on?");
                goOn = true;
            } else {
                goOn = false;
                System.out.println("Goodbye, and have a wonderful day!");
            }
        } while (goOn == true);
    }
    public static void main(String[] args) {
        runGradesApp();
    }
}
