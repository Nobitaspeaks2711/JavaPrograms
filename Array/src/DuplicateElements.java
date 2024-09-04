

public class DuplicateElements {
    public static void main(String[] args) {
    int[]a = new int[] {1,2,4,6,6,8,9,8,2};
    System.out.println("Duplicate elements from given arrey :");
    for (int i=0;i<a.length;i++)
    {
        for(int j= i +1;j<a.length;j++)
        {
            if(a[i]==a[j])
                System.out.println(a[j]);
        }
    }
}
}
