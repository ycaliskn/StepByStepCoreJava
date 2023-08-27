package day14StaticKeywordEncapsulation;

public class OgrenciRunner {
    public static void main(String[] args) {

            Ogrenci ogrnc1 = new Ogrenci("Ali","EşitAgırlık");
            Ogrenci ogrnc2 = new Ogrenci("Mehmet","Sayisal");


            System.out.println("ogrenci 1 isim : "+ogrnc1.isim);
            System.out.println("ogrenci 1 alan : "+ogrnc1.isim);

            System.out.println("ogrenci 2 isim : "+ogrnc2.isim);
            System.out.println("ogrenci 2 alan : "+ogrnc2.isim);

    }
}
