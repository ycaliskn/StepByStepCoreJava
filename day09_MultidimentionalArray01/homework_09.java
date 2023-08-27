package day09_MultidimentionalArray01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class homework_09 {

    public static void main(String[] args) {
        /*
        1.
            Asagidaki multi dimensional array’in
            // ic array’lerindeki son elemanlarin carpimini ekrana yazdiran bir program yaziniz
            { {8, 5, 4}, {3, 2}, {8, 9, 7, 6} }
		    // 4*2*6 =48

         */

        int sayilar[][] = {{8, 5, 4}, {3, 2}, {8, 9, 7, 6}};
        int carpim = 1;

        for (int w[] : sayilar) {
            carpim = carpim * w[w.length - 1];
        }
        System.out.println(carpim);

        /*
        Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni olusturacagimiz tek katli bir
        array’e bu toplamlari atayin.
        int[][] numbers = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        output: [10, 3, 12, 10, 9]

         */
        int[][] numbers = {{5, 12, 1, 8}, {4, 7}, {5, 3, 2}, {14}, {6, 9}};
        //                          [26, 11, 10, 14, 15]

        int uzunluk = numbers.length;
        System.out.println(uzunluk);
        int yeni[] = new int[uzunluk];
        int index = 0;
        int sub = 0;

        for (int w[] : numbers) {
            for (int k : w) {
                sub = sub + k;
            }
            yeni[index] = sub;
            index++;
            sub = 0;
        }
        System.out.println(Arrays.toString(yeni));




        /*3
        //multidimentional Array'in en uzun ve en kısa kelimelerin character sayisini bulunuz.
         en uzun ve en kısa kelimeyi bulunuz
        */
        String cumle[][] = {{"Ali", "süt", "ic"}, {"Muhammed Ali", "aferin"}, {"Hasan", "tatile", "ödevlerini", "bitir"}};
        String kisaKelime = "";
        String uzunKelime = "";
        int min = cumle[0][0].length();
        int max = cumle[0][0].length();
        for (String w[] : cumle) {
            for (String k : w) {
                if (min == k.length()) {
                    kisaKelime = k;
                }
                if (max == k.length()) {
                    uzunKelime = k;
                }
            }
        }
        System.out.println("en kısa kelime:\"" + kisaKelime +"\" kelimesi " + kisaKelime.length() + " characterden olusuyor.");
        System.out.println("en uzun kelime:\"" + uzunKelime +"\" kelimesi " + uzunKelime.length() + " characterden olusuyor.");



        /*  4
        Kullanıcıdan hasta isimlerini kayıt altına almasını saglayın ArrayList olusturun
        a)	Kullanıcı sadece bosluk ve hiçlik girerse ise isim bosluk veya hiçlik girilemez kontrol edip
        tekrar girer misiniz yazdıran isim bilgisini tekrar aldıran
        b)	kullanıcı kayıt işleminden çıkması gerektiginde q’a basarak kayıt işlemini sonlardırmasını sağlayın.


         */
        ArrayList<String> hastaListesi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int counter = 1;

        while (true) {
            System.out.print("Lutfen " + counter + ". hasta ismini girin  ");
            System.out.println("Kayıt işleminden çıkış için \"q\" a basabilirsiniz");
            String isim = scanner.nextLine();

            if (isim.equalsIgnoreCase("q")) {
                break;
            }

            if (isim.isBlank()) {
                System.out.println("İsim sadece boşluk veya hiçlikte olusamaz. Lütfen kontrol edip tekrar girin.");
                continue;
            }

            hastaListesi.add(isim.trim());
            counter++;
        }

        System.out.println("Kaydedilen hasta isimleri:");

            System.out.println(hastaListesi);

            //5
            //int[][] numbers = {{5, -12, 1, -8}, {4, -7}, {5, 3, -2}, {14}, {6, 9}};

            //en kucuk pozitif ve en buyuk negatif sayiyi bulunuz

            int[][] sayilar1 = {{5, -12, 1, -2}, {4, -7}, {5, 3, -15}, {14}, {6, 9}};
            int minSayi=sayilar1[0][0];   //pozitif
            int maxSayi=sayilar1[0][0];   //negatif

            for(int w[]: sayilar1) {
                for (int k : w) {
                    if (k < 0) {
                        if(maxSayi>0){
                            maxSayi=k;
                        }
                       maxSayi = Math.max(k, maxSayi);
                    }
                    if(k>0){
                        if(minSayi<0){
                            minSayi=k;
                        }
                        minSayi =Math.min(k,minSayi);
                    }
                }
            }
        System.out.println("Arraydeki Maximum Negatif Sayi : "+maxSayi+"\nArraydeki Minumum Pozitif Sayi : "+minSayi);
            //MultidimentionalArray'i her elmanı 2 katını alıp yeni bir array'e aktarın
        int elemanSayisi=0;
        for(int w[] : sayilar1){
            elemanSayisi=elemanSayisi+w.length;

        }
        int tekArray[]=new int[elemanSayisi];

        int ind=0;
        for (int w[] : sayilar1){
            for(int k : w){
                tekArray[ind]=k*2;
                ind++;
            }
        }
        System.out.println(Arrays.deepToString(sayilar1));
        System.out.println(Arrays.toString(tekArray));

        }
    }

