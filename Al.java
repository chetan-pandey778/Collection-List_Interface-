// ARRAYLIST in java
import java.util.*;
public class Al{
    public static void main(String args[]){
        ArrayList al1 = new ArrayList();
        al1.add(1);
        al1.add(2);
        al1.add(3);
         al1.add(4);
         System.out.println(al1);
  
           System.out.println("*************************");

            ArrayList al2 = new ArrayList();
            al2.add(5);
            al2.add("chetan pandey");
            al2.add(1.1);
            al2.add("c");
            System.out.println(al2);

            System.out.println("*****************************");
            ArrayList al3 = new ArrayList();
            al3.add(7);
            al3.add(7);
            al3.add(5);
            System.out.println(al3);

            System.out.println("***************************");

            System.out.println("after adding collection al2 in al3");
            al3.addAll(al2);
            System.out.println(al3);

            System.out.println("*****************************");
            // Insert at specific end in any collection
            al3.add(2,"chetan");
            System.out.println(al3);
             
    }
}