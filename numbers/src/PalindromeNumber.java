import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (isPalindrome(n)) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It's not a palindrome number");
        }
    }

    private static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n = n / 10;
        }

        return original == reversed;
    }
}

