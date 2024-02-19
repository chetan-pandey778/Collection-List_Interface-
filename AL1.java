//LIST ITERATOR IN ITERTOR class only for arraylist
import java.util.*;
public class AL1 {
    public static void main(String args[]){
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(100);
        System.out.println(al);
        // tarversal in arraylist using listiterator
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            // we can traverse also using stroring value if we want to cast datatype in objectto acces them in value
            // Integer i = (Integer)itr.next();
            // System.out.println(i);
            System.out.println(itr.next());
        }
          ListIterator litr = al.listIterator(al.size());
          while(litr.hasPrevious()){
            System.out.println(litr.previous());
          }
    }
    
}
