package day08_Array;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array01 {

    public static void main(String[] args) {
        int hastaYas[] = new int[5];
        System.out.println(Arrays.toString(hastaYas)); //[0, 0, 0, 0, 0]

        //25, 38, 45, 30, 18
        hastaYas[0] = 25;
        hastaYas[1] = 38;
        System.out.println(Arrays.toString(hastaYas)); //[25, 38, 0, 0, 0]
        hastaYas[2] = 45;
        hastaYas[3] = 30;
        hastaYas[4] = 18;

        int hastaYaslari[] = {25, 38, 45, 30, 18};


        System.out.println(Arrays.toString(hastaYaslari));// [25, 38, 45, 30, 18]


        System.out.println(hastaYaslari[2]);  //[25, 38, 45, 30, 18]  ==> 45
        Arrays.sort(hastaYaslari);
        System.out.println(Arrays.toString(hastaYaslari)); //[18, 25, 30, 38, 45]

        int toplam = 0;
        for (int i = 0; i < hastaYaslari.length; i++) {
            toplam = toplam + hastaYaslari[i];
        }
        System.out.println(toplam);  //156

        int toplam1 = 0;
        for (int w : hastaYaslari) {
            System.out.print(w + " ");
            toplam1 = toplam1 + w;
        }
        System.out.println(toplam1);

        //Ornek : Array i olusturup chracter sayilarinin toplamini bulup ekrana yazdırınız
        // ahmet hasan deniz hans

        String isimler[] = {"Ahmet", "Hasan", "Deniz", "Hans"};


        int sub = 0;
        for (String w : isimler) {
            sub = sub + w.length();
            System.out.println(sub);
        }
        System.out.println(sub);

        //'a’, ‘B’, ‘C’, ‘d’, ‘x’, ‘Y’, ‘Z’ harfleri için array olusturarak ekrana sadece buyuk harfleri yazdırınız
        char karakterler[] = {'a', 'B', 'C', 'd', 'x', 'Y', 'Z' };

        for (char w : karakterler) {
            if (w >= 'A' && w <= 'Z') {
                System.out.print(w + " ");
            }
        }

        System.out.println();
        //Ornek : Jack, Mehmet, Deniz, Mark, Hans, Ali, Jale den bir array olusturup Hans ve Hans’tan öncekileri yazdırınız:

        String isim[] = {"Jack", "Mehmet", "Deniz", "Mark", "Hans", "Ali", "Jale"};

        for (String w : isim) {
            System.out.print(w + " ");
            if (w.equals("Hans")) {
                break;
            }
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        //Array’deki de Deniz ve Mark hariç tum elemanları yazdırınız
        for (String w : isim) {
            if (w.equals("Deniz") || w.equals("Mark")) {
                continue;
            }
            System.out.print(w + " ");
        }
        System.out.println();

        /*
        Ornek : Bir kayıt görevlisinin hasta isimlerini application’a yuklemesini saglayan bir kod yazınız.
	//  (Kullanıcı ile beraber bir Array olusturunuz ve içine data ekleyiniz)

         */


        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen kaç hasta kayıdı yapacagınız yazınız:... ");
//        int hastaSayisi=input.nextInt();                // 5
//
//        String hastaName[]=new String[hastaSayisi];  //   [null, null, null, null, null]
//
//        System.out.println(Arrays.toString(hastaName));
//        /*
//        hastaName[0]= input.next();
//        hastaName[1]= input.next();
//        hastaName[2]= input.next();
//        hastaName[3]= input.next();
//         */
//        System.out.println("Lutfen cıkmak istiyorsanız q harfine basınız");
//        for(int i=0; i<hastaSayisi; i++){
//            System.out.println("Lutfen " + (i+1)+ ". hasta ismini giriniz");
//            String hastaIsim=input.next();
//
//            char exit=hastaIsim.toLowerCase().charAt(0);
//            if(exit=='q'){
//                break;
//            }
//            hastaName[i]=hastaIsim;
//        }
//        System.out.println(Arrays.toString(hastaName));
        /*
        [0, 5, 15, 0, 9, 18 ] array’i sıfırlarınız en sona koyunuz.
        [5, 15, 9, 18, 0, 0] seklinde oluşturunuz.

         */

        int orjinArray[] = {0, 5, 15, 0, 9, 18};
        System.out.println(Arrays.toString(orjinArray));
        int cakmaArray[] = new int[orjinArray.length];
        System.out.println(Arrays.toString(cakmaArray));


        int indexCakmaArray = 0;
        for (int w : orjinArray) {
            if (w != 0) {
                cakmaArray[indexCakmaArray] = w;
                indexCakmaArray++;
            }
        }
        System.out.println(Arrays.toString(cakmaArray));

        int sayilar[] = {8, -3, 11, 8, 5, 8};
        int aranan = 8;
        int sayac = 0;

        for (int w : sayilar) {
            if (w == aranan) {
                sayac++;
            }
        }
        if (sayac > 0) {
            System.out.println("Aradıgınız sayi Array'de " + sayac + " kere tekrar ediyor");

        } else {
            System.out.println("Aradıgınız sayi Arrayde mevcut değildir");
        }

        //"Java zor değildir çalışana, çalışmazsan ne kolay ki." cumledeki en uzun kelime

        String cumle="Java zor değildir calışana, calışmazsan ne kolay ki.";
        System.out.println(cumle);
        String cumle1=cumle.replaceAll("\\p{Punct}","");
        System.out.println(cumle1);
        String kelimeler1[]=cumle1.split(" ");
        System.out.println(Arrays.toString(kelimeler1));
        Arrays.sort(kelimeler1);
        System.out.println(Arrays.toString(kelimeler1));



        Arrays.sort(kelimeler1, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(kelimeler1));
        System.out.println(kelimeler1[kelimeler1.length-1]);
    }
}