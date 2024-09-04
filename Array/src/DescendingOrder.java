public class DescendingOrder {public static void main(String[] args) {
    int []a = new int[]{56,45,89,67,100};
    int b =0;
    System.out.println("Elements of original arrey :");
    for (int i=0;i< a.length;i++)
    {System.out.println(a[i]+"");

    }
    for(int i=0;i < a.length;i++)
    {
        for(int j =i+1;j< a.length;j++) {
            if (a[i]<a[j])
            {
                b =a[i];
                a[i]=a[j];
                a[j]= b;
            }
        }

    }

    System.out.println("Elements of arreys sorted in descending order");
    for(int i = 0; i< a.length-1;i++)
    {
        System.out.println(a[i]+"");
    }
    {
        System.out.println(a[a.length-1]);
    }}
}
