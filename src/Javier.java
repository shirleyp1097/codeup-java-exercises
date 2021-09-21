import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Javier {

    public static void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        try {
            String[] stringArray = sentence.split(" ");
            for (String word : stringArray){
                wordArrayList.add(word);
            }
            List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
            String newSentence = String.join(" ", shorterList);
            System.out.println(newSentence);
        }  catch(NullPointerException npe) {
            System.out.println("Cannot enter null as parameter.");
        } catch(IllegalArgumentException iae) {
            System.out.println("Must input non-negative integer.");
        } catch(IndexOutOfBoundsException ioobe) {
            System.out.println("Must input integer within range");
        }
    }

    public static void main(String[] args) {
        subListMaker("hello what a wonderful day");
    }
}


