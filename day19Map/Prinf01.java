package day19Map;

public class Prinf01 {

    public static void main(String[] args) {

        int adet1=5;

        double fiyat1=25.95;

        String urun1="Süt";

        int adet2=10;

        double fiyat2=15.65;

        String urun2="Deterjan";


        System.out.printf("ürünler : %-10S, adet : %-3d, fiyat : %1f", urun1,adet1,fiyat1);
        System.out.println();
        System.out.printf("ürünler : %-10S, adet : %-3d, fiyat : %1f", urun2,adet2,fiyat2);




    }
}
