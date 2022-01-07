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

    public static String validParentheses(String parens) {
        for (char c : parens.toCharArray()) {
            if (String.valueOf(c).equals("(")) {
                for (int i = parens.indexOf(c) + 1; i < parens.length(); i++) {
                    System.out.println(parens.charAt(i));
                    if (String.valueOf(parens.charAt(i)).equals(")")) {
                        parens = parens.replaceFirst("[)]", "");
                        parens = parens.replaceFirst("[(]", "");
                        break;
                    }
                }
            }
        }
        return parens;
//        if ((parens.contains("(")) || (parens.contains(")"))) {
//            return false;
//        } else {
//            return true;
//        }
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return null;
        }
        String[] arr = phrase.split(" ");
        StringBuilder newPhrase = new StringBuilder();
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length(); i++) {
                StringBuilder newWord = new StringBuilder();
                if (i == 0) {
                    newWord.append(String.valueOf(arr[j].charAt(i)).toUpperCase(Locale.ROOT));
                } else {
                    newWord.append(String.valueOf(arr[j].charAt(i)));
                }
                if (i == arr[j].length() - 1 && j != arr.length - 1) {
                    newWord.append(" ");
                }
                newPhrase.append(newWord);
            }
        }
        return newPhrase.toString();
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("ayo what up"));
    }
}


