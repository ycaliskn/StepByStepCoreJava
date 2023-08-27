package day06_ForLoop;

import java.util.Scanner;

public class homework06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        /* 1. SORU
        Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
		 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
			- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
			- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
			- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.

         */
        System.out.println("lutfen yuzden kucuk bir sayi giriniz...");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Java Guzeldir");
            } else if (i % 3 == 0) {
                System.out.println("Java");
            } else if (i % 5 == 0) {
                System.out.println("Guzeldir");
            } else {
                System.out.println(i);
            }

        }

 /*     2. SORU
        Interview Question Kullanicidan bir String isteyin.
         Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin
		“kelimeniz .... paindrome dir” ya da
		“kelimeniz .... paindrome değildir”  yazdırsın
        Palindrome : kelimenin ters ten yazımı ile düz yazımı aynı olan kelime
        Ornek kelimeler küllük , makam, elli denensin
*/

        System.out.println("lutfen bir yazi girin...");
        input.nextLine();
        String str = input.nextLine();

        // public static String tersineCevir(String str) seklinde "main method'un dışında" bir method olusturduk ve bunu
        // kullandık

        if (str.equals(tersineCevir(str))) {
            // if in içinde olusuturdugumuz method'dan gelen ters yazilmiş hali ile düz (ilk) halinin ayni olup olmadiğini
            // kontrol ettik
            System.out.println("Girdiginiz String palindrome");
        }else {
            System.out.println("Girdiginiz String palindrome degil");
        }

/*
        /*Soru 3
        kullanıcıdan baslangıc ve bitis isminde iki pozitif sayi alınız
        A ) Baslangıç degeri  bitis degerinden buyuk ve esit ise baslangıc degerinin faktoriyelini alır,
        (faktoriyel pozitif tam sayının kendisinden önceki bütün tam sayılarla 1'e inilinceye kadar çarpılması sonucunda elde edilen çarpımı gösterir.

        4! = 4 * 3* 2 * 1=24 gibi

        B) Baslangıç degeri bitis degerinden kucuk ise, program bitis degerinden baslangıc degerine
        kadar tüm tamsayıları toplar.

 */
        System.out.println("Başlangıç değerini giriniz:");
        int baslangic = input.nextInt();
        System.out.println("Bitiş değerini giriniz:");
        int bitis = input.nextInt();

        if (baslangic >= bitis) {
            // Başlangıç değeri bitiş değerinden büyük veya eşitse faktöriyel hesaplanacak
            long faktoriyel = 1L;
            //faktöriyel sayisi cok büyük cikacaği için long'un içine koyduk
            for (int k = baslangic; k > 1; k--) {
                faktoriyel=faktoriyel*k;
                System.out.println("Faktöriyel: " + faktoriyel);
            }
        }else {
            // Başlangıç değeri bitiş değerinden küçükse toplama yapılacak
            int toplam = 0;
            for (int i = bitis; i >= baslangic; i--) {
                toplam =toplam+ i;
            }
            System.out.println("Toplam: " + toplam);
        }

        /* Soru 4
        Kullanıcıdan ondalıklı bir sayi alın ve o sayının ondalık kısmının rakamları toplamının bulun.
        45.156  6+5+1=12
         */
        System.out.println("Lutfen kusurlu bir sayı giriniz (sayinin ondalik kismini ',' ile ayiriniz) : ");
        double sayi1=input.nextDouble();
        // sayiyi Strin olarak da alabiliriz
        System.out.println(sayi1);
        //sayinin dogru bir sekilde alındığını görüntülemek için yazdım
        String sayi1String=String.valueOf(sayi1);
        String kusuratSayi1=sayi1String.split("\\.")[1];

        //     45.156     ==>       45                                        156
        //                           |                                         |
        //  sayi1String.split("\\.")[0]               sayi1String.split("\\.")[1]

        // regex de ki "." ifadesi özel bir anlamı oldugu icin özel anlamı dısında kullanıldıgını belirtmek için
        // onune \\ yazdık

        // "." nın özel bir anlami oldugunu "" işareti icine yazdıgımızda alanın renginin farkli olmasından öngörebiliriz

        int sayi1Integer=Integer.valueOf(kusuratSayi1);
        // kusurat kısmını aldıktan sonra matametiksel işlem yapmak için primitive cevirdik
        int sonuc=0;

        for (int i =sayi1Integer;  i>0; i/=10) {
            sonuc=sonuc + i%10;
        }
        System.out.println(sonuc);


        // Soru 5: “Java çok kolay” ifadesini 2 yol ile (method ve loop ile) kullanıcının belittiği kadar alt alta yazdırın
        System.out.println( "ifadeyi kaç kere tekrar yazdırmak istiyorsaniz rakamsal olarak giriniz");
        int n=input.nextInt();
        String cumle="Javayı cok kolay \n";
        System.out.println(cumle.repeat(n));

        for(int i=1; i<n+1; i++){
            System.out.println("Javayı cok kolay");
        }

        /*
        kullanıcıdan :
        “Lutfen kurtarma parolanızı olusturmak için kullanıcı isim ve soyisim bilgilerini giriniz”. Satır halinde veri alınız
        a)	Kullanıcı space yazıp gecmeye çalışır ise
        “Lutfen bosluk veya hiçlik dışında gercek isminizi giriniz”
        b)	Basında veya sonunda space varsa
        “Lutfen bir dahaki sefer basta ve/veya sonda space olmadan isminizi giriniz”
        Uyarısında sonra alt basta ve sonda bosluk olmadan giriş bilgilerini yazdırınız
        c)	Diger durumda kayıt yapıldı diyerek giriş bilgilerini yazdırınız

        senaryolar
        1. kullanıcı 2 kez space'e basıp enterladı yazdı
                -->Lutfen bosluk veya hiçlik dışında gercek isminizi giriniz");
        2. kullanıcı "   Hasan Demir  " şeklinde girdi:
                -->Lutfen bosluk veya hiçlik dışında gercek isminizi giriniz
                -->Hasan Demir
        3. kullanıcı "hasan demir" şeklinde girdi:
                -->-->Hasan Demir
         */

        System.out.println("Lutfen kurtarma parolanızı olusturmak için kullanıcı isim ve soyisim bilgilerini giriniz");
        input.nextLine();
        String username=input.nextLine();
        if(username.isEmpty()){
            System.out.println("Lutfen bosluk veya hiçlik dışında gercek isminizi giriniz");
        } else if (username.trim().length()!=username.length()){
            System.out.println("Lutfen bir dahaki sefer basta ve/veya sonda space olmadan isminizi giriniz");
            System.out.println(username.trim());
        }else {
            System.out.println(username);
        }
    }

    // public       : access modifier  --> erişim sınırlayıcı
    // static       : static methodun içinde sadece static meyhod calisir (main mrthod static oldugu için)
    // String       : method'un return type i
    // tersineCevir : method'un ismi --> method'u cagirmak için kullaniriz
    // (String str) : method içinde kullanacağimiz variable'ı belirtiriz --> methodu cagirdiğimizda ()
    //  method içine kullanacagimiz variable yazariz

    public static String tersineCevir(String str) {
        String tersStr="";

        for (int i = str.length()-1; i >=0; i--) {


            tersStr+=str.substring(i, i+1);

        }

        return tersStr;
        //method'un vereceği sonuc değerini belirtir
    }



}