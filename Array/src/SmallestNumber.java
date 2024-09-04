public class SmallestNumber {
    public static void main(String[] args) {
        int a []= {13,45,67,89,100};
        //         0   1  2  3  4
        int min =a[0];
        for(int i= 0;i>a.length-1;i--)
        {
            if(a[i]>min)
            {
                min =a[i];
            }
        }
        System.out.println("minium number is->  "+ min);
    }}
