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


//    public static ArrayList<Integer> solution(int number) {
//        ArrayList<Integer> myArr = new ArrayList<>();
//        for (int i = 0; i < number; i++) {
//            if ((i % 3 == 0) || (i % 5 == 0))  {
//                myArr.add(i);
//            }
//        }
//        return myArr;
//    }

    public static int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if ((i % 3 == 0) || (i % 5 == 0))  {
                sum += i;
            }
        }
        return sum;
    }

    public static int repeatLetters(String text) {
        int counter = 0;
        text = text.toLowerCase();
        Set<String> set = new HashSet<String>();
        Set<String> secondSet = new HashSet<String>();
        for (int i=0; i< text.length(); i++) {
            if (set.contains(String.valueOf(text.charAt(i)))) {
                secondSet.add(String.valueOf(text.charAt(i)));
            } else {
                set.add(String.valueOf(text.charAt(i)));
            }
        }
        return secondSet.size();
    }

    public static int vowels(String text) {
        int counter = 0;
        String[] vowels = {"a","e","i","o","u"};
        for (int i = 0; i < text.length(); i++) {
            for (String j: vowels) {
                if (String.valueOf(text.charAt(i)).equals(j)) {
                    counter +=1;
                }
            }
        }
        return counter;
    }

    public static String accum(String s) {
        StringBuilder myString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            myString.append(String.valueOf(s.charAt(i)).toUpperCase());
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    myString.append(String.valueOf(s.charAt(i)).toLowerCase());
                }
            }
            if (i != s.length() - 1) {
                myString.append('-');
            }
        }
        return myString.toString();
    }

    public static void main(String[] args) {
//        System.out.println("a" * 3);
        System.out.println(accum("ayo"));
    }
}

//In `codeup-java-exercises`, in `JavaDrills`:
//        Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.
//        returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
//        returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3
//        returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2
