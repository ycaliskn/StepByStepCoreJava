package day09_MultidimentionalArray01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_01 {
    public static void main(String[] args) {

        ArrayList<Integer> sayilar1 = new ArrayList<Integer>();

        ArrayList< Integer> sayilar2 = new ArrayList<>();

        List< Integer> sayilar3 = new ArrayList<>();

        System.out.println(sayilar3.isEmpty());
        //true

        sayilar3.add(15);
        sayilar3.add(-24);
        sayilar3.add(155);
        sayilar3.add(20);
        sayilar3.add(85);
        sayilar3.add(-45);
        sayilar3.add(14);

        System.out.println(sayilar3);
        //[15, -24, 155, 20, 85, -45, 14]

        sayilar3.remove(1);
        System.out.println(sayilar3);


        System.out.println(sayilar3.get(2));
        //155
        //false

        System.out.println(sayilar1);  //[]
        System.out.println(sayilar2); //[]

        //eleman ekleme;
        sayilar1.add(15);
        sayilar1.add(5);
        sayilar1.add(35);

        //ekleme sırasına göre eklenmesine insertion order denir.
        System.out.println(sayilar1);


        // istediğimiz yere sayı ekleme
        sayilar1.add(1,45);
        System.out.println(sayilar1);
        //[15, 45, 5, 35]

        sayilar2.add(-25);
        sayilar2.add(-185);
        System.out.println(sayilar2);
        //[-25, -185]

        // ArrayList 'e baska bir ArrayList ekleyebilirsiniz.
        sayilar1.addAll(sayilar2);
        System.out.println(sayilar1);
        //[15, 45, 5, 35, -25, -185]

        // ArrayList 'e istenilen yere baska bir ArrayList ekleyebilirsiniz.
        sayilar1.addAll(1,sayilar2);
        System.out.println(sayilar1);
        //[15, -25, -185, 45, 5, 35, -25, -185]


        sayilar1.set(2,12);
        System.out.println(sayilar1);
        //[15, -25, 12, 45, 5, 35, -25, -185]

        boolean eklemeSonuc=sayilar1.add(18);        // ArrayList add() method'u boolean return eder.
        System.out.println(eklemeSonuc);
        System.out.println(sayilar1);

        System.out.println(sayilar1.size());



        List<String> list = new ArrayList<String>();

        // Use add() method to add elements
        // into the List
        list.add("Welcome");
        list.add("To");
        list.add("TURKEY");
        list.add("You");
        list.add("will");
        list.add("be");

        // Displaying the List
        System.out.println("List: " + list);
        //List: [Welcome, To, TURKEY, You, will, be]

        // Creating another empty List
        List<String> listTemp = new ArrayList<String>();

        listTemp.add("TURKEY");
        listTemp.add("You");
        listTemp.add("be");

        System.out.println("Are all the contents equal? "
                + list.containsAll(listTemp));
        //Are all the contents equal? true


    }
}
