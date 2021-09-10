package shapes;

import util.Input;


public class CircleApp {

    private static int numberOfCircles = 0;

    public static void getCircleCount() {
        numberOfCircles++;
    }

    public static void main(String[] args) {
        do {
            System.out.println("What is the radius of your circle?");
            int radius = Input.getInt();
            Circle myCircle = new Circle(radius);
            System.out.println(myCircle.getArea());
            System.out.println(myCircle.getCircumference());
            getCircleCount();
        } while (Input.yesNo() == true);
        System.out.printf("You created %d circles!", numberOfCircles);




    }
}
