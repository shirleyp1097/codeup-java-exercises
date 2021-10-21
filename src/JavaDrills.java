import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JavaDrills {


    public static String flipOuterCase(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++)
            if ((i == 0) || (i == input.length() - 1)) {
                if (Character.isUpperCase(input.charAt(i))) {
                    output += Character.toLowerCase(input.charAt(i));
                } else {
                    output += Character.toUpperCase(input.charAt(i));
                }
            } else {
                output += input.charAt(i);
            }
        return output;

    }

//    public static int returnTotalDifference(ArrayList<Integer> arr, ArrayList<Integer> arr2) {
//        int total = 0;
//        for (int i = 0; i < arr.size();  i++) {
//            total += arr.get(i);
//        }
//        for (int i = 0; i < arr2.size();  i++) {
//            total += arr2.get(i);
//        }
//        return total;
//    }

    public static String flipInnerCase(String word) {
        String output = "";
        for (int i = 0; i < word.length(); i++) {
            if ((i == 0) || (i == word.length() - 1)) {
                output += word.charAt(i);
            } else {
                if (Character.isUpperCase(word.charAt(i))) {
                    output += Character.toLowerCase(word.charAt(i));
                } else {
                    output += Character.toUpperCase(word.charAt(i));
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(flipInnerCase("cat")); // cAt
        System.out.println(flipInnerCase("CaT")); // CAT
        System.out.println(flipInnerCase("caT")); // cAT
        System.out.println(flipInnerCase("codeup")); // cODEUp
        System.out.println(flipInnerCase("CoDeup")); // COdEUp
    }
}

//In `codeup-java-exercises`, in `JavaDrills`:
//        Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.
//        returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
//        returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3
//        returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2
