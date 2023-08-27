package day06_ForLoop;

import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
        /*kullanıcıdan baslangıc ve bitis isminde iki pozitif sayi alınız
        A ) Baslangıç degeri  bitis degerinden buyuk ve esit ise baslangıc degerinin faktoriyelini alır,
        (faktoriyel pozitif tam sayının kendisinden önceki bütün tam sayılarla 1'e inilinceye kadar çarpılması sonucunda elde edilen çarpımı gösterir.

        4! = 4 * 3* 2 * 1=24 gibi

        B) Baslangıç degeri bitis degerinden kucuk ise, program bitis degerinden baslangıc degerine
        kadar tüm tamsayıları toplar.

 */
//        Scanner input=new Scanner(System.in);
//        System.out.println("Baslangıç degerini giriniz");
//        int bas = input.nextInt();
//        System.out.println("Bitis degerini giriniz");
//        int bit = input.nextInt();
//        int sonucCarp = 1;
//        int toplam = 0;
//        if(bas>=bit) {
//            for(int k=bas; k>2; k--) {
//                sonucCarp = sonucCarp*k;
//                System.out.println(sonucCarp);
//            }
//        } else {
//            for(int k=bit; k>=bas; k--) {
//                toplam = toplam + k;;
//                System.out.println(toplam);
//            }
//            System.out.println(sonucCarp);
//
//        }
//        input.close();
//        System.out.println( "yazdır");
//        System.out.print(sonucCarp);
//        System.out.println(toplam);



                Scanner input = new Scanner(System.in);
                System.out.println("Başlangıç değerini giriniz:");
                int baslangic = input.nextInt();
                System.out.println("Bitiş değerini giriniz:");
                int bitis = input.nextInt();

                if (baslangic >= bitis) {
                    // Başlangıç değeri bitiş değerinden büyük veya eşitse faktöriyel hesaplanacak
                    int faktoriyel = 1;
                    for (int i = baslangic; i >= 1; i--) {
                        faktoriyel *= i;
                    }
                    System.out.println("Faktöriyel: " + faktoriyel);
                } else {
                    // Başlangıç değeri bitiş değerinden küçükse toplama yapılacak
                    int toplam = 0;
                    for (int i = bitis; i >= baslangic; i--) {
                        toplam += i;
                    }
                    System.out.println("Toplam: " + toplam);
                }

                input.close();

        }
    }

