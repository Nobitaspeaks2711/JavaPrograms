public class MaxNumber {
    public static void main (String[]args){
        int a []={10,20,30,50,90};
        int max =a[0];
        for (int j : a) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("maximum number is->"+max);
    }
}
