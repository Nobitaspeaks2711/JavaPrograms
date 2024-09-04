import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();  // Close the scanner to avoid resource leak

        int reversedNumber = reverse(n);

        System.out.println("The reverse number is " + reversedNumber);
    }

    private static int reverse(int n) {
        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n = n / 10;
        }

        return reversed;
    }
}

