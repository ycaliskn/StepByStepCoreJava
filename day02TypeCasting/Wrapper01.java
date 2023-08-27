package day02TypeCasting;

import java.sql.SQLOutput;



public class Wrapper01 {



    public static void main(String[] args) {


        int a=4561;
        int c=456;

        Integer yeniA=a;
        System.out.println(yeniA.compareTo(c));

//        System.out.println(yeniA.);

        Integer yeni2=36548;

        int sayi10=5;
        int sayi11=3;
        boolean sonuc;
        System.out.println(sonuc=5==3);

        System.out.println(sonuc=6==6);


        double sonuc2=(196/99);

        System.out.println(sonuc2);

        System.out.println(85%6);

        System.out.println("ali"=="Ali");

        String str3="Fatih";

        String name="Hasan";
        String name2=name+"";
        System.out.println(name==name2); // --> false


    }
}

