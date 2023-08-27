package day17Interface;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    public static void main(String[] args) {
        LinkedList<String> names= new LinkedList<>();

        names.add("Ahmet");

        names.add("Hasan");

        names.add("Ali");

        names.add("Mehmet");

        names.add("Hans");

        names.add("Kazım");

        System.out.println(names);      //[Ahmet, Hasan, Ali, Mehmet, Hans, Kazım]

        names.add(1,"Angelina");

        System.out.println(names);      //[Ahmet, Angelina, Hasan, Ali, Mehmet, Hans, Kazım]

        names.addLast("Ugur");
        names.addFirst("Ajda");

        System.out.println(names);      //[Ajda, Ahmet, Angelina, Hasan, Ali, Mehmet, Hans, Kazım, Ugur]

        names.removeLast();

        System.out.println(names);      //[Ajda, Ahmet, Angelina, Hasan, Ali, Mehmet, Hans, Kazım]

        LinkedList<String> visiters= new LinkedList<>();

       // visiters.removeLast();


        names.removeFirst();
        System.out.println(names);

        names.addLast("Angelina");
        names.addLast("Hans");

        System.out.println(names);      //[Ahmet, Angelina, Hasan, Ali, Mehmet, Hans, Kazım, Angelina, Hans]

        names.removeFirstOccurrence("Hans");
        System.out.println(names);      //[Ahmet, Angelina, Hasan, Ali, Mehmet, Kazım, Angelina, Hans]

        names.removeLastOccurrence("Angelina");
        System.out.println(names);      //[Ahmet, Angelina, Hasan, Ali, Mehmet, Kazım, Hans]


        System.out.println("--------------------------------------------------------");
        String silinen=names.pop();  //cut + paste
        System.out.println(names);
        System.out.println(silinen);

        /*
        Removes the first occurrence of the specified element in this list .
        return removeFirst();
        o – element to be removed from this list, if present
        Returns:
        true if the list contained the specified element
        Since:
        1.6
         */
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        String ilkEleman=names.peek();   // first copy+paste
        System.out.println(ilkEleman);
        System.out.println(names);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:        the head of this list
        List is empty ==> null

        1.5
         */

        System.out.println(visiters.peek());

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        System.out.println(names.element());
        System.out.println(names);

       // visiters.element();

     //   System.out.println(names.get(6));

        //Ornek :  a ile baslayan tüm isimleri ***** ceviren kodu yazınız.

//        for(String w: names){
//            if(w.startsWith("a") || w.startsWith("A")){
//                names.set(names.indexOf(w), "*****");
//            }
//
//        }
//        System.out.println(names);

        //  Listede 4 harften fazla char iceren isimleri silelim ve ekrana yazdıralım.

        /*[1, -> 2, -> 3, -> 4, -> 5, -> 6] cifleri siliyoruz
           1  -> 3 -> 4


         */

        for(int ind=0; ind<names.size(); ind++){
            if(names.get(ind).length()>4){
                names.remove(ind);
                ind--;
            }
        }

        System.out.println(names);
    }
}
