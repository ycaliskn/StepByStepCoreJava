package day10arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<Double> salary=new ArrayList<>();



        /*
        Bir tane salary Listi olusturunız eger salary 2000 den az ise %20 ;
            2000’den cok ise %10 zam yapınız.

         */

        salary.add(1500.0);
        salary.add(2100.0);
        salary.add(1800.0);
        salary.add(2400.0);
        System.out.println(salary);    // [1500.0, 2100.0, 1800.0, 2400.0]

        for(int i=0; i<salary.size(); i++){
            if(salary.get(i)<2000){
                salary.set(i,salary.get(i)*1.2);
            }else{
                salary.set(i,salary.get(i)*1.1);
            }
        }

        System.out.println(salary); // [1800.0, 2310.0, 2160.0, 2640.0]

        /*
        Bir tane salary Listi olusturunız eger salary 2000 den az ise %20 ;
            2000’den cok ise %10 zam yapınız.

         */


 //       salary.set(salary.indexOf(1800), (1800*120/100));

//        for(double w: salary){
//            if(w<2000.0) {
//                salary.set(salary.indexOf(w), (w*1.2));
//                System.out.println(salary);
//            }
//
//            else {
//                salary.set(salary.indexOf(w), ((w*110/100)));
//            }
//        }
//        System.out.println(salary);




        ArrayList<Character> list1=new ArrayList<>();
        ArrayList<Character> list2=new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('D');
        //list2.add('F');

        list1.add('A');
        list1.add('B');
        list1.add('D');


        int counter=0;

        for(int i=0; i<list1.size(); i++ ){

            if(list1.size()!=list2.size()){
                    counter++;
                    System.out.println("Liste uzunlukları eşit değildir.");
                    break;
            }
           if(list1.get(i) !=list2.get(i)){
               counter++;
               System.out.println("Liste elimanları eşit değildir.");
               break;
           }

        }

            if (counter==0){
            System.out.println("Listler esittir.");

        }
            boolean sonucListe=list1.equals(list2);

            if(sonucListe){
                System.out.println("Listler esittir.");
            }else {
                System.out.println("Listler esit değildir.");}


            /*
            Verilen bir listteki elemanları tekrarsız olaraz yazınız.
	             [5, 8, 3, 5, 7, 8, 5]


 yeniliste       [5, 8, 3, 7]

             */

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(8);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(8);
        sayilar.add(5);

        System.out.println(sayilar);

        ArrayList<Integer> yeniList=new ArrayList<>();

        for (Integer w : sayilar){
            if (!yeniList.contains(w)) {
                yeniList.add(w);
            }
            }
        System.out.println(yeniList);

        System.out.println(!false);

        /*
        [B, D, L, T]

        Kullanıcıdan bir harf alınız, harf sizin List’in içinde varsa o harfi BULUNDU ya çeviriniz
            yoksa o harfi listeye ekleyiniz.

         */

        ArrayList<String> listem=new ArrayList<>();

        listem.add("B");
        listem.add("D");
        listem.add("L");
        listem.add("T");

        System.out.println("-------------------------------------------------");
        System.out.println(listem);

        String harf="";
        do {
           Scanner input = new Scanner(System.in);
           System.out.println("Lutfen tahmininiz olan bir harf giriniz : ....");
           harf = input.next().substring(0, 1);

           if (listem.contains(harf)) {
               listem.set(listem.indexOf(harf), "Bulundu");
           } else if(!harf.equalsIgnoreCase("q")){
               listem.add(harf);
           }
       }while (!harf.equalsIgnoreCase("q"));
        System.out.println(listem);

    }
}

