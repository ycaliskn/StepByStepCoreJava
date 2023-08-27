package day18Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {


        Queue <String> depoList = new LinkedList<>();

        depoList.add("Süt");
        depoList.add("Un");
        depoList.add("Kırmızı Et");
        depoList.add("Bal");

        System.out.println(depoList);

        boolean sonuc1=depoList.offer("Balık");
        System.out.println(depoList);
        System.out.println(sonuc1);

        boolean sonuc2=depoList.offer("Balık");
        System.out.println(depoList);
        System.out.println(sonuc2);


                /*
                Inserts the specified element into this queue if it is possible to do so immediately without violating
                 capacity restrictions. When using a capacity-restricted queue, this method is generally preferable to add,
                  which can fail to insert an element only by throwing an exception.
                 */
    }
}
