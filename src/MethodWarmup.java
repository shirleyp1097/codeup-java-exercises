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
//    public static void main(String[] args) {
//        System.out.println(getDifference(10,5));
//        System.out.println(getDifference(10));
//        System.out.println(getDifference(10.5, 5.2));
//    }
    public static int numberAccumulate(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static int recursiveAccumulate(int num) {
        if (num == 1) return 1;
        return recursiveAccumulate(num - 1) + num;
    }

    public static void main(String[] args) {
        System.out.println(recursiveAccumulate(5));
    }
//    add all numbers from 1 to given number
}
