

public class LargestNumber {
    public static void main(String[] args) {
    int a []= {13,45,67,89,100};
    //         0   1  2  3  4
    int max =a[4];
    for(int i= 0;i<a.length;i++)
    {
        if(a[i]>max)
        {
            max =a[i];
        }
    }
    System.out.println("maxium number is->  "+ max);
}
}
