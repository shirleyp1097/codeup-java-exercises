public class MethodWarmup {

    public static int getDifference(int num1, int num2) {
        if (num1 > num2) {
            return num1 - num2;
        } else {
            return num2 - num1;
        }
    }

    public static int getDifference(int num1) {
        return getDifference(num1, 0);
    }

    public static double getDifference(double num1, double num2) {
        if (num1 > num2) {
            return num1 - num2;
        } else {
            return num2 - num1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getDifference(10,5));
        System.out.println(getDifference(10));
        System.out.println(getDifference(10.5, 5.2));
    }
}
