package day03IfStatament;

import java.sql.SQLOutput;

public class StringManupilation01 {

    public static void main(String[] args) {
        System.out.println("Hasan"+5); //Hasan5
        char a='A';
        System.out.println(a+5);   //70

        System.out.println(""+a);  //A

        System.out.println(a+5+""); //70

        System.out.println(""+a+5); // ----> "A" ---> A+5   ----> A5

        String deneme="hasan"+5;
        System.out.println(deneme);

        int sayi=2+3;  //-->
        String sonuc = "Hüseyin" + 5;  //    Hüseyin5

        int sayi1=a+5;  //--> 65+5 --> 70

        System.out.println(sonuc+0);   // --> Hüseyin50

        char fav1='a';
        char fav2='A';
        System.out.println(fav1+fav2);     // 162
        System.out.println(""+fav1+fav2);  //""+a --->a ---> a+A ---aA

        char karakter1='B';
        char karakter2='b';
        String isim="Yunus";
        int sayi10=50;
        System.out.println(karakter1+karakter2); //----> 164
        System.out.println(karakter1+karakter2+sayi10); // -->214
        System.out.println(karakter1+karakter2+sayi10+isim);  //214+isim --->214Yunus
        System.out.println(isim+karakter1+karakter2+sayi10); //YunusBb50






    }
}
