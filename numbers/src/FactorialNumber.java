import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();  // Close the scanner to avoid resource leak

        long factorial = calculateFactorial(n);

        System.out.println("The factorial of " + n + " is " + factorial);
    }

    private static long calculateFactorial(int n) {
        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}


