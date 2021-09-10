import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    static String[] nouns = {"apple", "cake", "hippo", "rhino", "ninja", "gun", "killer", "pumpkin", "glass", "argonaut", "Olympian"};

    static String[] adjs = {"red","velvet","scaly","rough","silent","loud","demented","orange","shiny","heroic","proud"};

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    static String getRandomElement(String[] arr) {
        return arr[getRandomNumber(0, arr.length)];
    }

    public static void main(String[] args) {
//        System.out.println(getRandomElement(nouns));
        System.out.println("Here is your server name: ");
        System.out.print(getRandomElement(adjs) + '-' + getRandomElement(nouns));
    }
}
