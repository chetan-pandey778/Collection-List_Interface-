// HASHSET IN SET interface
import java.util.*;
public class HS {
public static void main(String args[]){
    HashSet hs = new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(100);
        System.out.println(hs);
        // it uses hashing to insertion so there is no order of insertion in hashset if you want so for that we have to use linkedhashset
        LinkedHashSet hs1 = new LinkedHashSet();
        hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        hs1.add(100);
        System.out.println(hs1);
}
    
}
