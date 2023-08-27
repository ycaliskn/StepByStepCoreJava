package day11passByValue;
import java.util.ArrayList;
import java.util.Scanner;
public class homework11 {

    public static void main(String[] args) {



        StringBuilder name1=new StringBuilder("Hasan");
        StringBuilder name2=new StringBuilder("Hasan");
        System.out.println("name1"+name1);
        System.out.println("name2"+name2);
        StringBuilder name3=new StringBuilder("Mehmet");
        StringBuffer name=new StringBuffer("Mehmet");
        System.out.println(name2);

            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> asalSayilar = new ArrayList<>();
            int hak = 3;
            int puan = 0;

            System.out.println("0'a basarak oyundan çıkabilirsiniz.");
            System.out.println("Bir sayı girin: ");

            while (hak > 0) {
                int girilenSayi = scanner.nextInt();

                if (girilenSayi == 0) {
                    System.out.println("Oyundan çıktınız.");
                    break;
                }

                if (!isAsal(girilenSayi)) {
                    hak--;
                    if (hak > 0) {
                        System.out.println("Sayı asal değil. Kalan hakkınız: " + hak + ". Tekrar deneyiniz.");
                    } else {
                        System.out.println("Oyunu kaybettiniz.");
                    }
                } else if (asalSayilar.contains(girilenSayi)) {
                    System.out.println("Bu sayıyı daha önce girdiniz. Lütfen farklı bir sayı giriniz.");
                } else {
                    asalSayilar.add(girilenSayi);
                    puan += 100;
                    System.out.println("Tebrikler, bildiniz! Yeni sayı girer misiniz?");
                }
            }

            System.out.println("Puanınız: " + puan);



        /* istediğimiz kadar sayıyı ile 'sizin belirleyeceğiniz bir kelimenin uzunlugu' ile çarpıp ekrana
        // "n kadar sayi ile kelimesinin character sayisinin çarpım sonucu ..." yazdıran methodu olusturunuz.

        //String kelime = "orneklem";
        //methodun içinde bu String'in character sayisi ile istediğimiz kadar sayi carpabileceksiniz.
        */


        carpKelimeUzunluk("Deneme",5,15,35,85,455,45464,4544,4546445,44545454);



    }

    public  static void carpKelimeUzunluk(String k, int... a){
        long mult=1;
        int flag=1;
        for (int w :a){
            flag++;
            mult=mult*w;
        }
        System.out.println("girdinizi : "+flag+"sayi ile "+k+" kelimesinin character sayisinin çarpım sonucu : "+mult);
    }
        public static boolean isAsal(int sayi) {
            if (sayi < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    return false;
                }
            }
            return true;
        }
}


