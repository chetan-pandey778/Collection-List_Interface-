
// ArrayDeque in Queue interface  & Dequq intrface 
import java.util.*;

public class AD {
    public static void main(String args[]) {
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(1);
        ad1.add(2);
        ad1.add(3);
        System.out.println(ad1);
        // we can add both homogenious and hatrogenius data in arraydeque
        ad1.add("chetan");
        System.out.println(ad1);

        // AS we know it is double ende queue so we can add in first and last so for
        // there also exsist some method
        ad1.addFirst(0);
        ad1.addLast(4);
        System.out.println(ad1);

        // we have also a Offer method to insertvalue but it is not mandotarty that
        // offer method add a value in array

        ad1.offerFirst(200);
        ad1.offerLast(500);
        ad1.offer(600);
        System.out.println(ad1);
    }
}
