package day14StaticKeywordEncapsulation;

public class Ogrenci {

    String isim;
    static String bolum;

    public Ogrenci(String adi, String alanAdi){
        this.bolum=alanAdi;
        this.isim=adi;

    }

    public static void main(String[] args) {
        Ogrenci ogrnc1 = new Ogrenci("Ali","EşitAgırlık");
        Ogrenci ogrnc2 = new Ogrenci("Mehmet","Sayisal");




        System.out.println("ogrenci 1 isim : "+ogrnc1.isim);
        System.out.println("ogrenci 1 alan : "+ogrnc1.bolum);

        System.out.println("ogrenci 2 isim : "+ogrnc2.isim);
        System.out.println("ogrenci 2 alan : "+ogrnc2.bolum);
    }


}
