public class StarPatternP6 {
    public static void main(String[] args) {
        // reverse of the pattern P5
        for (int i = 5; i >= 1; i--) {  // Outer loop for rows
            for (int j = 4; j >= i; j--) {  // Loop for spaces
                System.out.print("");
            }
            for (int h = 1; h <= i; h++) {  // Loop for printing 'P'
                System.out.print("P ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
