package day08_Array;

import javax.net.ssl.SSLContext;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        /* 1 Soru
           iki Array'ın
            a ) ortak eleman varsa ortak elemanları ekrana yazdıran
            b ) yoksa ortak iki "Arraylarin ortak elemanı yoktur" yazdıran kodu yazar mısınız?
        */
        String[] arr1 = new String[]{"A", "O", "B", "K", "J"};
        String[] arr2 = new String[]{"A", "J", "R", "O", "C", "D"};
        int flag = 0;
        for (String w : arr1) {
            for (String z : arr2) {
                if (w.equals(z)) {
                    System.out.print(w + " ");
                    flag++;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Array'larin ortak elemanı yoktur");
        }
        System.out.println();


        // 2. )
        // Array ' i tersten yazdiriniz
        int[] arr = {1800, 850, 450, 750, 240, 1550};
        int[] tersArray = new int[arr.length];
        int k = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            tersArray[k] = arr[i];
            k++;
        }
        System.out.println(Arrays.toString(tersArray));


        /* 3. )
        Verilen String’de en kısa kelimeyi bulunuz.
        Lütfen Loop ile cözelim
        2 yol ile çözünüz. (biri loop)
         */

        // 1. yol loop ile
        String[] isimListesi = new String[]{"Mehmet", "Tunc", "Ilker", "Omer Faruk", "Demir"};
        String enKisa = isimListesi[0];
        for (String w : isimListesi) {
            if (w.length() <= enKisa.length()) {
                enKisa = w;
            }
        }
        System.out.println(enKisa);

        //2. ) yol
        String[] isimler = new String[]{"Mehmet", "Tunc", "Ilker", "Omer Faruk", "Demir"};

        Arrays.sort(isimler, Comparator.comparingInt(String::length));
        System.out.println(isimler[0]);

        /* 4. )
        Kullanıcıdan hasta yaşlarının kayıt altına almasını saglayın
        a)	Kullanıcıdan kayıt edilecek hasta sayisini alınız.
        b)	Kullanıcı eksi yas girer ise yas eksi girilemez kontrol edip tekrar girer misiniz yazdıran yas bilgisini tekrar aldıran
        c)	kullanıcı kayıt işleminden çıkması gerektiginde 0’a basarak kayıt işlemini sonlardırmasını sağlayın.

        //
        Kullanıcıdan kayıt edilecek hasta sayisini alınız.
        15
        // Lutfen kayıt edilecek 1inci  hasta yaşını giriniz
        45
        Lutfen kayıt edilecek 2 inci  hasta yaşını giriniz
        35
        Lutfen kayıt edilecek 3 inci  hasta yaşını giriniz
        -3
        yas eksi girilemez kontrol edip tekrar girer misiniz
        3
        Lutfen kayıt edilecek 4 inci  hasta yaşını giriniz
        0
        [45, 35, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kayıt işleminden çıkış yapabilmek için '0' a basınız:  ");
        System.out.println("Kaydedilecek hasta sayısını girin: ");

        int hastaSayisi = scanner.nextInt();
        int[] hastaYaslar = new int[hastaSayisi];

        for (int i = 0; i < hastaSayisi; i++) {
            System.out.print("Lütfen kaydedilecek " + (i + 1) + ". hasta yaşını giriniz: ");
            int yas = scanner.nextInt();

            while (yas < 0) {
                System.out.println("Yaş eksi girilemez! Lütfen kontrol edilerek kaydedilecek " +
                                    (i + 1) +". hasta yaşını tekrar giriniz");

                yas = scanner.nextInt();
            }

            if (yas == 0) {
                break;
            }

            hastaYaslar[i] = yas;
        }

        System.out.println("Kayıt altına alınan veriler");

        // Kaydedilen yaşları ekrana yazdır
        System.out.println(Arrays.toString(hastaYaslar));

        /* 5. )
        //loop kullanarak isimListesi1 in' sonuna isimListesi2 i ekleyerek bir array olusturabilir misiniz?
         */
        String[] isimListesi1 = new String[]{"Mehmet", "Tunc", "Ilker", "Omer Faruk", "Demir"};
        String[] isimListesi2 = new String[]{"Hans", "Tom", "John", "Charlie"};

        int toplamSayi = isimListesi2.length + isimListesi1.length;

        String[] isimListesiSon = new String[toplamSayi];
        int index=0;
            for (String w : isimListesi1) {
                isimListesiSon[index] = w;
                index++;
            }
            index = isimListesi1.length;
            for (String j : isimListesi2) {
                isimListesiSon[index] = j;
                index++;
            }

        System.out.println(Arrays.toString(isimListesiSon));

        //6. ) Array i kucukten buyuge dogru sıralayınız
        //     [A, C, J, K, b, f, o]
        char[] list = {'A', 'o', 'f', 'K', 'J', 'b', 'C'};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}


