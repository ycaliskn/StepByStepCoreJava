package day08_Array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaydedilecek hasta sayısını girin: ");
        int hastaSayisi = scanner.nextInt();

        int[] yaslar = new int[hastaSayisi];

        for (int i = 0; i < hastaSayisi; i++) {
            System.out.print("Lütfen kaydedilecek " + (i + 1) + ". hasta yaşını giriniz: ");
            int yas = scanner.nextInt();

            while (yas < 0) {
                System.out.println("Yaş eksi girilemez! Tekrar giriniz.");
                System.out.print("Lütfen kaydedilecek " + (i + 1) + ". hasta yaşını giriniz: ");
                yas = scanner.nextInt();
            }

            if (yas == 0) {
                break;
            }

            yaslar[i] = yas;
        }

        System.out.println("Kayıt işlemi tamamlandı.");

        // Kaydedilen yaşları ekrana yazdır
        System.out.println(Arrays.toString(yaslar));


        int sayilar[] = {13, 75, 5, 63, 45};

        Arrays.sort(sayilar);        //[5, 13, 45, 63, 75]

        int aranan = 63;

        int sonuc = Arrays.binarySearch(sayilar, aranan);

        System.out.println(sonuc);    //3

        char harfler[] = {'E', 'Z', 'K', 'D'};

        char arananHarf = 'D';

        Arrays.sort(harfler);   // [D, E, K, Z]

        System.out.println(Arrays.binarySearch(harfler, arananHarf));

        System.out.println(Arrays.binarySearch(harfler, 'V'));

        System.out.println(Arrays.binarySearch(harfler, 'A'));

        System.out.println(Arrays.binarySearch(harfler, 'F'));


        int sayiList[]={45, -56, 78, 45, 12, 0};

        Arrays.sort(sayiList);

        System.out.println(Arrays.toString(sayiList)); // [-56, 0, 12, 45, 45, 78]

        System.out.println(Arrays.binarySearch(sayiList, 45));

        String cumle= "Calisirsan Java kolaydir, calismazsan hicbirsey kolay degildir. ";
        cumle=cumle.toLowerCase();
        String harf[]=cumle.split("");
        System.out.println(Arrays.toString(harf)) ;
        int sayac=0;

        for(String w: harf){
            switch (w) {
                case  "a":
                case  "e":
                case  "i":
                case  "u":
                sayac++;
                }
            }

        System.out.println(sayac);
        }


    }

