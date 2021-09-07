import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f", pi);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width and length: ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int perimeter = (2 * width) + (2 * height);
        int area = width * height;
        System.out.println("The perimeter is: " + perimeter);
        System.out.print("The area is: " + area);
    }
}
