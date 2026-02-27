package Task_7;

public class MathDemo {

    // a. Minimum of two numbers
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    // b. Maximum of two numbers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    //I use Math library for part (a), and write simply for part (b).


    // c. Sum of array elements
    public static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    // d. Mean (average) of array elements
    public static float mean(int[] args) {
        if (args.length == 0) return 0;
        return (float) sum(args) / args.length;
    }

    // e. Factorial of a number
    public static int factorial(int n) {
        if (n < 0) return -1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}