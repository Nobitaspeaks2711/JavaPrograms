public class DiamondPatternReverse {
    public static void main(String[] args) {

        //ex- 15****************************************************


        for(int i=1;i<=5;i++)

        {
            for(int j=1;j<=i;j++)

            {
                System.out.print(" ");
            }

            for(int h=7; h>=(i*2)-1; h--)
            {
                System.out.print("*");
            }
            System.out.println();



        }
        for(int i=1;i<=5;i++)

        {
            for(int j=4;j>=i;j--)

            {
                System.out.print(" ");
            }

            for(int h=1; h<=(i*2)-1; h++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
