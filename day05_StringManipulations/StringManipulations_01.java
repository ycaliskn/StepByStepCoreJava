package day05_StringManipulations;

import java.util.Scanner;

public class StringManipulations_01 {
    public static void main(String[] args) {
        //day05_StringManipulations;

        //Kullanıcıdan alınan ad ve soyadı tek satırda arada boslukla alın. Ekrana ad ve soyadın ilk harflerini yazdır.
//        Scanner input=new Scanner(System.in);
//        System.out.println("AD VE SOYADI Bilgisini giriniz");   //Ahmet KISA
//        String nameSurname=input.nextLine();
//
//        char ilk=nameSurname.charAt(0);
//        char soyAdiIlkHarf=nameSurname.split(" ")[1].charAt(0);
//        System.out.println(""+ilk+soyAdiIlkHarf);

        /*
        Bir passwork ‘un gecerli olup olmadıgını aşağıdaki kurallara göre kontrol eden kodu olusturunuz
		1. En az 6 character olmalı
		2. Space characteri içermemeli
		3. Ilk harfı kucuk harf olmalı
		4. Son characteri ‘.’ olmalı

		*/
        String psw="deneme.";

        //1 sart
        boolean first=psw.length()>5;

        //2 sart
        boolean second=!psw.contains(" ");

        //3 sart
        boolean third=psw.charAt(0)>='a'&& psw.charAt(0)<='z';

        //4 SART
        boolean fourth=psw.charAt(psw.length()-1)=='.';

        if(first&&second&&third&&fourth){
            System.out.println( "Sifre gecerli");
        }else {
            System.out.println("Sifre gecersiz");
        }


        String name="Hasan Ali";
        System.out.println(name.substring(5));

        String sonuc=name.substring(2,5);
        System.out.println(sonuc);

        System.out.println(name.substring(name.length()-3));

        String cumle="Kara kara Ankara";
        System.out.println(cumle.replace('a', '*'));
        System.out.println("-----------------------------------");
        System.out.println(cumle);

        String sonuc1=cumle.replace("kara", "?");
        System.out.println(sonuc1);


        System.out.println("------------------------------------------------");
        //Asagıda Strinde space hariç kaç karakter oldugunu gösteren codu yazınız7
        String cumle1="Hasan ana sınıfına basladı.";
        System.out.println(cumle1.replace(" ",""));
        // -->Hasananasınıfınabasladı
        int result=cumle1.replace(" ","").length();     // -->Hasananasınıfınabasladı.length();
        System.out.println(result);


        //Seri numarasındaki tum rakamların yerine * koyunuz.
        //AC4585265

        String serial="AC4585265";

        String serialNew=serial.replaceAll("[0-9]","*");

        System.out.println(serialNew);

        System.out.println(serial.replaceAll("[a-zA-Z]","-"));

        /*
        Verilen ifadedeki space, noktalama isareti ve  rakamlar haric character sayısını bulunuz.
			Ben sınavdan 100 aldım, dersem inanma!:)

         */
        String ornek="Ben sınavdan 100 aldım, dersem inanma!:)";

        int ornekSonuc=ornek.
                replaceAll("[ ]","").           // "Bensınavdan100aldım,derseminanma!:)"
                replaceAll("[\\p{Punct}]", ""). // "Bensınavdan100aldımderseminanma"
                replaceAll("[0-9]","").         //  Bensınavdanaldımderseminanma
                length();
        System.out.println(ornekSonuc);
    }
}
