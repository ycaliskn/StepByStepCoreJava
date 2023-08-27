package day07_DoWhileLoop;


import java.util.Arrays;
import java.util.Scanner;

public class homework07 {
    public static void main(String args[]) {


        /*
        Soru 1 :
        Kullanıcıdan bir cumle alınız ve kullanıcıdan girdiği cumlede istediği karakterin kaç kere tekrar ettiğini hesaplayiniz
        Kulladınıcım girdiği cumle : “Ali ata bak.”
        Kullanıcının hesaplanmasini istediği harf : ‘a’;
        Ali ata bak. Cumlede ‘a’ harfi 4 tanedir

         */
        Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen cumlenizi giriniz : ");
//        String cumle=input.nextLine();
//        System.out.println("Lutfen tekrar sayisini hesaplamak istediğiniz karakteri giriniz : ");
//        char sayimChar=input.next().toLowerCase().charAt(0);
//        //char characterini buyuk olarak aldik
//
//        int tekrarSayisi=0;
//        for (int i=0; i<cumle.length(); i++){
//            if(sayimChar==cumle.toLowerCase().charAt(i)){
//                //cumlenin asil kaydini degistirmeden dongu icinde harfleri buyuttuk
//                tekrarSayisi++;
//            }
//
//        }
//        System.out.println("\""+cumle + "\"" + " ifadesinde "+sayimChar+" characteri " +tekrarSayisi +" kere tekrar etmektedir");
//
//
//        /*  Soru 2 :
//        Kullanicidan bir sayi alin
//		ve bu sayiyi tam bolen sayilari
//		ve toplam kac tane olduklarini ekranda yazdirin
//
//        Ekran Cıktsıı : 1 3 5 15
//        15 sayisi için 4 tane tam bölen vardır
//
//         */
//        System.out.println("Lutfen bölenlerini bulmak istediğiniz sayiyi giriniz");
//       int number1 = input.nextInt();
//       int bolensayaci=0;
//        System.out.print("Sayinin bölenleri : ");
//        for(int i=1; i<number1+1; i++){
//            if(number1%i==0){
//                System.out.print(i+" ");
//                bolensayaci++;
//            }
//        }
//
//        System.out.print(""+"\n"+number1+ " sayisinin bolen sayisi : "+ bolensayaci);
//
//        System.out.println();
//
//        /*
//        ’u’ harfinden baslayarak ‘b’ harfine kadar b dahil tum harfleri yazdirin.
//        For ,  while ve do while ile
//        //ekran cıktısı
//        "u t s r q p o n m l k j i h g f e d c b"
//
//
//         */
//        for (char i = 'u'; i >='b' ; i--) {
//
//            System.out.print(i + " ");
//        }
//
//
//        System.out.println();
//        char ch='u';
//        while (ch>='b'){
//            System.out.print(ch + " ");
//            ch--;
//        }
//        System.out.println();
//
//        ch='u';  //bir oncekı dongude 'a' olmustu tekrar 'u' degerini atadım
//        do{
//            System.out.print(ch + " ");
//            ch--;
//
//        }while (ch>='b');
//        System.out.println();
//        /*
//        kullanıcıdan
//        a)	Sıfır dışında 3 un kati cift sayi sayi girmesini isteyiniz
//        b)	Kullanıcı dogru girdikce
//        “dogru sayı tekrar giriniz  ya da çıkmak için sıfıra basınız”
//        deyiniz
//        c)	yanlış girerse
//        “kaybettiniz hatalı giriş yaptınız”
//         yazdırınız ve
//
//        d)	girdiği her dogru deger için 100 puan alsın ve hata yaptıgında veya cıktıgında toplam puanları ekrana yazdırsın
//
//         */
//        System.out.println("Lutfen 3 e bölünen sıfır dışında çift bir sayi giriniz");
//        int rakam;
//        int puan =0;
//        do{
//
//            rakam =input.nextInt();
//            if(rakam==0){
//                break;
//            }
//            if(rakam%3==0&&rakam%2==0){
//                System.out.println("Dogru sayi girdiniz. Yeni sayi giriniz yada cıkış için '0' giriniz");
//                puan=puan+100;
//            }else {
//                System.out.println("hatalı giriş kaybettiniz");
//                break;
//            }
//
//
//        }while(true);
//        System.out.println("Toplam puanınız : "+puan);
//
//
//    /*  Soru 5:
//        Bir ile 100 alasında bir  sayi belirleyiniz kullanıcının bu sayiyi bulmasını saglayınız
//        a) girdiği sayi belirledğinizden kucuk ise
//        “bulamadınız sayiyi buyutun “
//        b)	girdiği sayi belirlediğinizden buyuk ise
//        “bulamadınız sayiyi kucultun “
//        c)	sayiyi tuturursa “kazandınız” yazdirin
//        hatalı giriş şansı 5 olsun beşten fazla hatali girerse hakkınız bitti deyip oyunu sonlandırın
//
//
//
//     */
//
//        int ramdom= 35;
//        int sayac=0;
//        System.out.println("Lutfen 0-100 arasi tahmini tam sayinizi giriniz : ");
//        do {
//
//            if(sayac==5){
//                System.out.println("hakkınız bitti oyunu kaybettiniz");
//                break;
//            }
//            int tahmin= input.nextInt();
//            if(ramdom<tahmin){
//                System.out.println("bulamadınız sayiyi kucultun");
//
//            }else if(ramdom>tahmin) {
//                System.out.println("bulamadınız sayiyi buyultun");
//
//            }else{
//                System.out.println("Kazandınız");
//                break;
//            }
//            sayac++;
//        }while (true);
//
//        /*
//        Soru 6 Kullanıcıdan satır sayısını alarak asagıdakı sekli elde ediniz
//                *
//               ***
//              *****
//             *******
//
//         */
//
//
//
//        System.out.println("satir sayisini giriniz");
//        int satir1=input.nextInt();
//
//        //3 farkli  islem var
//            //1- alt satıra yazdırma (dısdaki for)
//            //2- bosluk(space characteri) yazdırma --> satir sayisi ile ters orantılı
//            //3- * yazdırma işlemi   --> satir sayisinin 2 kati oraninda
//
//        //2 ve 3 işlemler per pese olan (iç içe değil) işlemler ikiside satir sayisi ile orantili
//
//
//        for(int i=1; i<=satir1; i++){
//            for(int k=satir1; k>i; k--){  // bosluk(space characteri) yazdırma --> satir sayisi ile ters orantılı
//                System.out.print(" ");    // satir sayisindan 1 eksik
//
//            }
//            for(int l=1; l<i*2; l++){     //3- * yazdırma işlemi   --> satir sayisinin 2 kati orantılı
//                System.out.print("*");    //3- * yazdırma işlemi   satir sayisinin 2 katından 1 eksik
//
//            }
//            System.out.println();
//        }

        int yasHasta[]=new int[5];
        yasHasta[0] = 15;

        String hastaIsim[] = {"Ahmet", "Hasan", "Deniz", "Hans"};

        System.out.println(Arrays.toString(hastaIsim));

        int characterSayisiToplami=0;
        for(String w: hastaIsim){
            characterSayisiToplami=characterSayisiToplami+w.length();
        }
        System.out.println(characterSayisiToplami);

        System.out.println("Lutfen kayıt edilecek hasta sayisini giriniz : ...");
        int hastaSayisi=input.nextInt();

        String namesHasta[] = new String[hastaSayisi];

        for(int i=1; i<=hastaSayisi; i++){
            System.out.println("Lutfen "+ i+". hasta ismini giriniz : ...");
            String hastaN= input.next();

            namesHasta[i-1]=hastaN;
        }
        System.out.println(Arrays.toString(namesHasta));

        //

    }


}
