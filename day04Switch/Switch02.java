package day04Switch;

import java.util.Scanner;

public class Switch02 {

    //Ornek 2: Ay numarasını kullanıcıdan alıp bulundugu ayları ve kalan ayları yazdıran kodu yazınız.
    //10 Ekim
    //      Kasım
    //      Aralık

    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
        System.out.println("lutfen ay numarasını giriniz");
    int ayNo=input.nextInt();

    switch (ayNo){
        case 1:
            System.out.println("Ocak");
       case 2:
        System.out.println("Şubat");
        case 3:
            System.out.println("Mart");
        case 4:
            System.out.println("Nisan");
        case 5:
            System.out.println("Mayıs");
        case 6:
            System.out.println("Haziran");
        case 7:
            System.out.println("Temmuz");
        case 8:
            System.out.println("Agustos");
        case 9:
            System.out.println("Eylül");
        case 10:
            System.out.println("Ekim");
        case 11:
            System.out.println("Kasım");
        case 12:
            System.out.println("Aralık");
            break;
        default:
            System.out.println("LUtfen gecerli bir ay numarası giriniz");

            }


    }

}
