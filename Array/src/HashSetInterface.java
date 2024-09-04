import java.util.HashSet;
import java.util.Iterator;

    public class HashSetInterface  {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            HashSet <String> set = new HashSet<>();
            set.add("suru");
            set.add("shiv");
            set.add("vaibhav");

            Iterator<String> itr= set.iterator();
            while(itr.hasNext()) {
                System.out.println(itr.next());

            }
        }

    }
