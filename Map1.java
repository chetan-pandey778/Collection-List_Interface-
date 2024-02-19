// hashtable and treemap in map
import java.util.*;
public class Map1 {
    public static void main(String args[]){
        Hashtable ht = new Hashtable();
        ht.put(1, "chetan");
        ht.put(2, "vaibhav");
        ht.put(3, "rohit");
        System.out.println(ht);

        // TreeMap in map
        TreeMap tm = new TreeMap();
        tm.put(2, "vaibhav");
        tm.put(3, "rohit");
        tm.put(1, "chetan");
        System.out.println(tm);
    }
}
