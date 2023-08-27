package day04Switch;

import java.util.Locale;

public class Ternary02 {
    public static void main(String[] args) {

//      //Ornek: Verilen yılın Leap Year (Artık yıl) olup olmadıgını kontrol eden kodu yazınız.
//        //i)  Yıl 100 bolunurse 400’e de bolunmelidir.   1600            1800
//        //ii) Yıl 100 bolunmuyorse 4’e de bolunmelidir. 1996            2001
//
//        int yil=1800;
//
//        if(yil%100==0){
//
//            if (yil%400==0){
//                System.out.println("lEAP YEAR");
//            }
//            else {
//                System.out.println("Not lEAP YEAR");
//            }
//
//        } else   {
//            if(yil%4==0){
//                System.out.println("lEAP YEAR");
//            }else {
//                System.out.println("Not lEAP YEAR");
//            }
//
//        }
//
//        String sonuc=yil%100==0 ? (yil%400==0 ?"lEAP YEAR" : "Not lEAP YEAR" ) : (yil%4==0 ? "\"lEAP YEAR\"": "Not lEAP YEAR" );
//
//        System.out.println(sonuc);

 /*       Ornek : Password’un gecerli olup olmadıgını aşaıdaki kurakllara göre kontrol eden kodu yazınız
        i)  5 harften fazla ise ilk harf ilk harf ‘a’ olmalıdır.
                ii) 5 karakter veya daha az harfli ise ‘Z’ olmalıdır.
*/


        String pswd="dsdf152";

        int uzunluk=pswd.length();

        System.out.println(uzunluk);

        String result1= pswd.length()>5 ? (pswd.charAt(0)=='a' ? "password olsuturuldu" : "hatalı giris"  )

                                        : (pswd.charAt(0)=='Z') ? "password olsuturuldu\"" : "hatalı giris";

        System.out.println(result1);



        String cumle="Kara kara karacık, İçi dolu mayacık.";


        System.out.println(cumle.lastIndexOf("kara",9)); //5


        //10

//        System.out.println(name.replace('a','.'));   //H.s.n Ali
//
//        System.out.println(name.substring(0, 1));                  //      H
//        System.out.println(name.substring(name.length()-1));//   i
//        System.out.println(name.substring(name.length()-3));//   Ali
//
//
//        name.length();


//        System.out.println(name.split("s")[0]);
//
//        System.out.println(name.contains("m"));     // true
//        System.out.println(name.contains("Ah"));    // true
//
//
//        System.out.println(name.toLowerCase());     // ahmet
//        System.out.println(name.toUpperCase());     // AHMET
//
//        System.out.println(name.length());  // -->5
//
//
//
//        System.out.println();   // -->  AHMET
//        System.out.println(name);                 // -->  Ahmet
//
//        name=name.toUpperCase();
//        System.out.println(name);                  // -->  AHMET
//


    }
}
