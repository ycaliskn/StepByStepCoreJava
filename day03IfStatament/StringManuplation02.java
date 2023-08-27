package day03IfStatament;

import java.util.Scanner;

public class StringManuplation02 {
    public static void main(String[] args) {
       //Kullanıcıdan alınan userName ve userPassword bilgilerinin ilk harflerini ekrana yazdıran kodu yazın?

        Scanner input=new Scanner(System.in);
//
//        System.out.println("Lutfen username girer misiniz");
//        char userName= input.next().charAt(0);
//        System.out.println("Lutfen password girer misiniz");
//        char pwd= input.next().charAt(0);
//        System.out.println(""+userName+pwd);



//        System.out.println("Lutfen isimnizi ve soyisminizi giriniz girer misiniz");
//        String name= input.nextLine();   //Hasan Yılmaz
//        char ilkHarf1=name.charAt(0);
//        char ikiniciHarf=name.split(" ")[1].charAt(0);
//        System.out.println(""+ilkHarf1+ikiniciHarf);

        String user1="Ali";
        String user2="Ali";
//        System.out.println(user1.equals(user2));
//        boolean sonuc2=user2.equals(user1);
//        System.out.println(sonuc2);

//        String user3="aLi";
//        System.out.println(user3.equalsIgnoreCase(user1));

//        int sayi1=100;
//        int sayi2=150;
//        System.out.println(sayi1==sayi2);   //false
//        System.out.println(sayi1==sayi2-50); //true
//        boolean result1=sayi1==sayi2;
//        System.out.println(result1);   //false
//
//        boolean result2;
//        System.out.println(result2=sayi1+50==sayi2);
//        System.out.println("result2: " + result2);
//
//        int deneme1=10;
//        int deneme2=20;
//        boolean sonuc2=10!=20;
//        System.out.println(sonuc2);
//
//        // bir sayinin birler basamagını bulan kodu yazınız?
//
//        int randomsayi=4893;
//        System.out.println(randomsayi%10);
//
//        System.out.println((randomsayi%100-randomsayi%10)/10);
//
//        //kullanıcıdan alınan ifadenin ilk harfinin buyuk harf oldugunu kontrol edip buyuk harf ise true değise false yazdıran bir kod yazınız
//
//
//        System.out.println("Bir kelime giriniz");
//        char ilkHarf=input.next().charAt(0);  //Yunus
//
//        boolean resultIlkHarf=ilkHarf>='A' && ilkHarf<='Z'; //true
//        System.out.println(resultIlkHarf);
//
//        //kullanıcıdan alınan ifadenin ilk harfinin kucuk harf oldugunu kontrol edip buyuk harf ise true değise false yazdıran bir kod yazınız
//        char ilkHarf1=input.next().charAt(0);  //Yunus
//        System.out.println(ilkHarf1>='a' && ilkHarf<='z');
//
//        //bir sayi 0 ile 10 arasında ise ekran true yazdıran değise false yazdıran kodu yazın
//
//        int sayi50=14;
//        System.out.println(sayi50>0&&sayi50<10);
//
        //Ornek kullanıcalından alınan sayı 50 kucuk veya 100 buyuk ise ekrana true değilse false



//        System.out.println("Bir sayi girer misiniz=");
//        int kullaniciSayi=input.nextInt();
//        System.out.println(kullaniciSayi<50||kullaniciSayi>100);


       int sayi1=15364;
     int result=sayi1%10+sayi1;
        System.out.println(result);


    }
}
