package day03IfStatament;

import java.util.Scanner;
import java.util.Set;

public class IfStatament02 {
    public static void main(String[] args) {


        //kullanıcıdan gun numarasını alıp ekran gün isminiz yazdıran kodu yazar mısnız?

        /*
        1--> Pazar
        2--> Pazartesi
        3--> Sali
        4--> Çarşamba
        5--> Perşembe
        6 --> Cuma
        7 --> Cumartesi

         */

        Scanner input=new Scanner(System.in);
//        System.out.println("gün numarasını girer msiniz?");
//        byte gun=input.nextByte();
//        if(gun==1){
//            System.out.println("Pazar");
//        } else if (gun==2) {
//            System.out.println("Pazartesi");
//
//        }else if (gun==3) {
//            System.out.println("Salı");
//
//        }else if (gun==4) {
//            System.out.println("Çarşamba");
//
//        }else if (gun==5) {
//            System.out.println("Perşembe");
//
//        }else if (gun==6) {
//            System.out.println("Cuma");
//
//        }else if (gun==7) {
//            System.out.println("Cumartesi");
//
//        }else {
//            System.out.println("girmeniz gereken sayi aralıgının dısında bir deger girdiniz. degerler 1 2 3 4 5 6 7 dir");
//        }
//

        //Kulllanıcıdan gun isimlerini alalım Pazartesi cuma dahil hafta ici ise --> haftaiçi
        //                                  cumartesi pazar ise ekrana haftasonu yazdıran bir kod yazar msınız


        // 1 yol
        System.out.println("Gun ismini girer msiniz");
        String gunIsmi=input.next();

        if(gunIsmi.equalsIgnoreCase("Pazartesi")){
            System.out.println("Haftaiçi");
        } else if (gunIsmi.equalsIgnoreCase("Sali")){
            System.out.println("Haftaiçi");
        }   else if (gunIsmi.equalsIgnoreCase("Çarşamba")){
            System.out.println("Haftaiçi");
        }else if (gunIsmi.equalsIgnoreCase("Perşembe")){
            System.out.println("Haftaiçi");
        }else if (gunIsmi.equalsIgnoreCase("Cuma")){
            System.out.println("Haftaiçi");
        }else if (gunIsmi.equalsIgnoreCase("Cumartesi")){
            System.out.println("Haftasonu");
        }else if (gunIsmi.equalsIgnoreCase("Pazar")){
            System.out.println("Haftasonu");
        }else {
            System.out.println("Girdiginiz data gün ismi değil");
        }

        //2. yol
        boolean haftaici=gunIsmi.equalsIgnoreCase("Pazartesi")||
                gunIsmi.equalsIgnoreCase("Sali")||
                gunIsmi.equalsIgnoreCase("Çarşamba")||
                gunIsmi.equalsIgnoreCase("Perşembe")||
                gunIsmi.equalsIgnoreCase("Cuma");

        boolean haftasonu = gunIsmi.equalsIgnoreCase("Cumartesi") ||
                gunIsmi.equalsIgnoreCase("Pazar");

        if (haftaici){
            System.out.println("haftaici");
        } else if (haftasonu) {
            System.out.println("haftasonu");

        }else {
            System.out.println("Girdiginiz data gün ismi değil");
        }


    }

 }

