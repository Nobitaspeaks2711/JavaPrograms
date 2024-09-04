import java.util.Iterator;
import java.util.Vector;

public class VectorArray {
    public static void main(String[] args) {

            Vector<String> vc = new Vector<String>();
            vc.add("vaibhav");
            vc.add("sai");
            vc.add("auti");

            Iterator itr = vc.iterator();
            while(itr.hasNext()) {
                System.out.println(itr.next());
            }


        }
}
