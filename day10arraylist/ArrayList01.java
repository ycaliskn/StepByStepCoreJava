package day10arraylist;


import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {




        ArrayList<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(15);
        sayilar.add(8);
        sayilar.add(3);
        System.out.println(sayilar); //[10, 15, 8, 3]

        sayilar.set(2,21);
        System.out.println(sayilar); //[10, 15, 21, 3]

        System.out.println(sayilar.get(0));  //10
        int sayi1=sayilar.get(1);
        System.out.println(sayi1);            //15
        System.out.println("------------------------------------------------");
        /*
        Arraydeki sayilar çift ise elemanı  13 artırarak ekrana yazdırın.
        [15, -24, 155, 20, 85, -45, 14]

         */
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(15);
        numbers.add(-24);
        numbers.add(155);
        numbers.add(20);
        numbers.add(85);
        numbers.add(-45);
        numbers.add(14);
        System.out.println(numbers);


        System.out.println(numbers.indexOf(-45));

        for (Integer w: numbers){       //[15, -24, 155, 20, 85, -45, 14]
            if(w%2==0){
                numbers.set(numbers.indexOf(w), w+13);
            }


        }

        System.out.println(numbers);

        numbers.remove(2);
        System.out.println(numbers);


        Integer silinecek=33;
        numbers.remove(silinecek);



        System.out.println(numbers);


        ArrayList<String> names=new ArrayList<>();

        names.add("Hasan");
        names.add("Ali");
        names.add("Mehmet");
        names.add("Huseyin");
        names.add("Tom");
        names.add("John");
        names.add("Angelina");
        names.add("Huseyin");

        System.out.println(names);      //[Hasan, Ali, Mehmet, Huseyin, Tom, John, Angelina, Huseyin]

        names.remove("Huseyin");    //[Hasan, Ali, Mehmet, Tom, John, Angelina, Huseyin]

        System.out.println(names);

        ArrayList<String> yabancilar=new ArrayList<>();
        yabancilar.add("Tom");
        yabancilar.add("John");
        yabancilar.add("Hans");
        System.out.println(names.removeAll(yabancilar)); //[Hasan, Ali, Mehmet, Angelina, Huseyin]
        System.out.println(names);                          // [Hasan, Ali, Mehmet, Angelina, Huseyin]

        ArrayList<String> iseGelenler=new ArrayList<>();
        iseGelenler.add("Hasan");
        iseGelenler.add("Angelina");
        iseGelenler.add("Mehmet");

        System.out.println(names.contains("Hasan"));
        boolean sonuc=names.containsAll(iseGelenler);
        System.out.println(sonuc);
    }
}
