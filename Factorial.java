public class Factorial {
    public static int calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Unable for negative numbers");
        }
        if (number == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
