public class SwapNumber {
    public static void main (String []args){
        int a =100;
        System.out.println("value of a before swap:"+a);
        int b =200;
        System.out.println("value of b before swap:"+b);

        int c;
        c = a;
        a = b;
        System.out.println("value of a after swap:"+a);
        b=c;
        System.out.println("value of b after swap:"+b);

    }
}
