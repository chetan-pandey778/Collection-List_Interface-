// Hashmap in java map in java 
import java.util.*;
public class Map {
    public static void main(String args[]){
        HashMap hs = new HashMap();
        hs.put(1,"chetan");
        hs.put(2,"pandey");
        hs.put(3,"rohit");
        System.out.println(hs);
      // using hashmap but it has no order of insertion so for that we have to use linkedhashmap
      LinkedHashMap lhm = new LinkedHashMap();
      lhm.put("Chetan","pandey");
      lhm.put("Vaibhav","Dubey");
      lhm.put("Rohit","kumar");
        System.out.println(lhm);
    }
}
