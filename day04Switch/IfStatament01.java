package day04Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatament01 {
    public static void main(String[] args) {
       /* Kullanicidan tam sayı olarak sinav puanini alan ve notunun ne oldugunu aşağıdaki tabloya göre yazdırın
        0-40 	  D
        41-60    C
        60-80    B
        80-100  A
        100 < Yanlış Giriş
        <0    negatif puan girilemez
           */


        Scanner input=new Scanner(System.in);
        System.out.println( "Lütfen ekrana not bilgisini giriniz");
        int not=input.nextInt();

        if(not<0){
            System.out.println( "negatif puan girilemez");
        } else if (not<41) {
            System.out.println("Notunuz D");
        } else if (not<61) {
            System.out.println("Notunuz C");
        } else if (not<81) {
            System.out.println("Notunuz B");
        } else if (not<101) {
            System.out.println("Notunuz A");
        } else   {
            System.out.println( "YANLIŞ GİRİŞ. NOT DEGERİ 100DEN BUYUK OLAMAZ");
        }


    }
}
