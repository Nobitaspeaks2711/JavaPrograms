
import java.util.Iterator;
import java.util.LinkedList;

    public class LinkedArray {
        public static void main(String[]args) {
            LinkedList<String> ll = new LinkedList<>();
            ll.add("vaibhav");
            ll.add("auti");
            ll.add(0,"rutu");

            Iterator<String> itr=ll.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }


}
