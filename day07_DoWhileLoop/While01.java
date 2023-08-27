package day07_DoWhileLoop;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        int i = 5;
        while (i < 5) {

            System.out.print(i + " ");
            i++;
        }
        //21 den 8 e kadar tum cift sayilari ekrana yazdiriniz

        int k = 21;
        while (k > 7) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }

            k--;
        }
        //25 den 40e kadar tam sayilarin toplamini bulan kodu yazınız.

        System.out.println();
        int sub = 0;
        int num1 = 25;

        while (num1 < 41) {
            sub = sub + num1;
            num1++;
        }
        System.out.println(sub);

        // verilen bir tam sayinin rakamlari toplamini bulan kodu yaziniz

        int result = 0;
        int num = 438;
        while (num > 0) {
            result = result + num % 10;
            num = num / 10;
        }
        System.out.println(result);


        //Kullanicidan toplanmak uzere sayilar isteyin toplam 1000 olur veya
        //gecerse kaç sayi girişi yaptıgıyla beraber toplami ekrana yazdirin.

        int toplam = 0;
        int sayac=0;
        Scanner input = new Scanner(System.in);
        while (toplam < 1000) {
            System.out.println("Lutfen toplamak istediğiniz sayiyi giriniz : ");
            int sayi1=input.nextInt();
            if(sayi1==0){
                break;
            }
            toplam=toplam+sayi1;
            sayac=sayac+1;
        }
        System.out.println("girdiginiz "+ sayac+"sayinin toplami : " +toplam);

        //4 için çarpı  tablosunu yazdırınız?
/*
        4 * 1 = 4
        4 * 2 = 8
        4 * 3 = 12
        */
        int n=1;
        while (n<11){
            System.out.println("4 * "+ n+ "= "+(n*4));
            n++;
        }



    }
}