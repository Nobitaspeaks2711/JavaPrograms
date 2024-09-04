import java.util.Scanner;

public class ReverseWord {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the string:");
            String given = scanner.nextLine();
            String reversed = "";

            String[] words = given.split("\\s+");

            for (String w : words) {
                char[] letters = w.toCharArray();
                for (int i = letters.length - 1; i >= 0; i--) {
                    reversed = reversed + letters[i];
                }
                reversed = reversed + " ";
            }

            System.out.println("Reversed string: " + reversed.trim());
        }
    }


