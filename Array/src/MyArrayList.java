import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("vaibhav");
        list.add("rutu");
        list.add("sai");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
