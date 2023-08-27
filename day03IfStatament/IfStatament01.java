package day03IfStatament;

import java.util.Scanner;

public class IfStatament01 {
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);
//        System.out.println("Bir sayi girer msiniz?");
//        int sayi1=input.nextInt();
//
//        if(sayi1%2==0){
//            System.out.println("girdiginiz sayi çift sayıdır");
//        }

        // kullanıcıdan aldıgımız sayinin üc basamaklı ise "girdiginiz sayi 3 basamaklıdir" yazdıran bir kod yazalım
//
//        System.out.println("bize bir sayi söyler msiniz");
//        int sayi2=input.nextInt();
//        int sayi3=Math.abs(sayi2);
//        if(sayi3>=100&&sayi3<1000){
//            System.out.println("girdiginiz : "+ sayi2+ " sayisi 3 basamaklıdir");
//        }


        // sayinin degeri cift ise cift sayi tesk ise tek sayi yazdıran kodu yazar mısnz

//        System.out.println("Bir sayi girer msiniz?");
//        int sayi5=input.nextInt();
//
//        if(sayi5%2==0){
//            System.out.println("girdiginiz sayi çift sayıdır");
//        }
//        else {
//            System.out.println("girdiginiz sayı tektir");
//        }

        // sayi negatif ise negatif sıfır ise sayı sıfırdır veya sıfırdan buyuk ise sayi pozitif yazan kodu yazar mısnız

        System.out.println("Bir sayi girer msiniz?");
        int sayi=input.nextInt();

//        if(sayi<0){
//            System.out.println("sayi negatif sayidir");
//        } else if (sayi>0) {
//            System.out.println("sayi pozitifdir");
//
//        }else {
//            System.out.println("sayi sıfırdır");
//        }

        if(sayi<0){
            System.out.println("sayi negatif sayidir");
        } else if (sayi==0) {
            System.out.println("sayi sıfırdır");

        }else {
            System.out.println("sayi pozitiftir");
        }

    }



}
