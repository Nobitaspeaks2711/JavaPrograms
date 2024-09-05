public class StarPatternP2 {
    public static void main(String[] args) {
        // Print a pattern where the first row has 1 star and each row increases by one star
        for (int i = 1; i <= 5; i++) {  // Outer loop controls rows, from 1 to 5
            for (int j = 1; j <= i; j++) {  // Inner loop controls stars, prints 'i' stars per row
                System.out.print("* ");
            }
            System.out.println();  // Move to the next line after printing stars
        }
    }
}
