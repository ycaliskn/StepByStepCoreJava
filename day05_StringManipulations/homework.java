package day05_StringManipulations;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {


        //1. soru

        //Asağıdaki ifadeyi sadece  2 method kullanarak  “home home sweet home” seklinde ekrana yazdırım
        // “evim evim guzel evim”

        String evim="evim evim guzel evim";

        System.out.println(evim.replace("evim","home").replace("guzel","sweet"));

        //2. soru
        /*
        Kullanıcıdan alınan userName bilgisinin aşagıdaki şartları karşıladıgını kontrol edin ?
        1)	İfadenin sonunun “@gmail.com” ya da “@hotmail.com” ya da @yahoo.com olması gerekmektedir.
        2)	İfadesinde @ ten once
        a.	En az Bir buyuk harf
        b.	En az 2 kucuk harf
        c.	En az bir sesli harf icermesi gerekmektedir.
        d.	Space karakteri içermemesi gerekmektedir
        e.	En az 5 chracter olması gerekmektedir.
        f.	Son character rakam olmamalı
        Sartlar dogru ise “Kullanıcı giriş ismi kabul edildi ”
        Değil ise “hatalı giriş” yazmasını saglayan kodu yazınız
        */

        String sifre="Ahmet9@gmail.com";
        boolean sart1=sifre.endsWith("@gmail.com")||sifre.endsWith("@hotmail.com")||sifre.endsWith("@yahoo.com");
        String part1=sifre.split("@")[0];
        boolean sartA=part1.replaceAll("[^A-Z]","").length()>0;
        boolean sartB=part1.replaceAll("[^a-z]","").length()>1;
        boolean sartC=part1.replaceAll("[^aeuiAEUI]","").length()>0;
        boolean sartD=part1.replaceAll("[^ ]","").length()==0;
        boolean sartE=part1.length()>4;
        boolean sartF=(part1.charAt(part1.length()-1)>'9');

        if(sart1&&sartA&&sartB&&sartC&&sartD&&sartE&&sartF){
            System.out.println( "Girdiginiz parola gecerli");
        }else{
            System.out.println("parola gecerli değil");
        }



/*




        //3. soru
        //Kullanicidan isim ve soyismini ayri ayri alin.
        //a. ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin                    Ali Yılmaz
        //b. soyisim daha uzun veya eşit ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.	 Ali YILMAZ

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Isim giriniz ");
        String name=input.next();
        System.out.println("Lutfen Soyisim giriniz ");
        String surName=input.next();

        if(name.length()>surName.length()){
            System.out.println(name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase()+
                    " "+ surName.substring(0,1).toUpperCase()+surName.substring(1).toLowerCase());

        }else{
            System.out.println(name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase()+
                    " "+ surName.toUpperCase());
        }

        //4 soru
        // Kullanıcıdan 6 characterli bir kelime alın ve erkana kelimeyi tersten yazdırın

        System.out.println("----------------------------------");
        System.out.println("bir kelime giriniz : ");
        String kelime=input.next();
        System.out.println(""
                +kelime.charAt(5)+kelime.charAt(4)+kelime.charAt(3)+kelime.charAt(2)+kelime.charAt(1)+kelime.charAt(0));


        //5 soru
        // “sarkastik” kelimesinde a harflerinin tekrarlı olup olmadıgını bulan 2 farklı kod yazın


        //     char sorguHarfi='i';

       // boolean tekrarSorguYol2=(k1.length()-1)==(k1.replace(sorguHarf,"").length());
        //       String sorguHarf="a";

        String k1="sarkastik";
        char sorguHarfi='i';
        boolean tekrar=k1.indexOf(sorguHarfi)==k1.lastIndexOf(sorguHarfi);





        if(tekrar) {
            System.out.println("tekrar etmiyor");
        }
        else {
            System.out.println("Tekrar ediyor");
        }
*/
        //
    }
}
