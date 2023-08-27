package day19Map;

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {
        Hashtable<String, Integer> ogrenciNotlari=new Hashtable<>();

        ogrenciNotlari.put("Ali DEMİR",95);
        ogrenciNotlari.put("Hasan YILDIZ",85);
        ogrenciNotlari.put("Hatice TURK",100);
        ogrenciNotlari.put("Kamil YILMAZ",65);

        System.out.println(ogrenciNotlari);

        //ogrenciNotlari.put(null,45); //key null  olamz ==> NullPointerException atar
        //ogrenciNotlari.put("Asli Kan", null); //value null olamaz ==> NullPointerException atar

        System.out.println(ogrenciNotlari);

        Bayi deneme=new Bayi("Istanbul","Kadikoy",350,false);

        System.out.println(deneme.city);

        Bayi deneme2=new Bayi("Ankara", "Cankaya",150, false);

        String deneme2Town=deneme2.town;
        System.out.println(deneme2Town);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");

        Hashtable<String,Bayi> guncelStok=new Hashtable<>();
        // {"Sting = Bayi obj ", Sting = Bayi obj ,  Sting = Bayi obj                         }

        guncelStok.put("IcAnadolu", new Bayi("Ankara", "Akdere",20, true));


        guncelStok.put("Marmara", new Bayi("Istanbul", "Taksim",110, false));
        guncelStok.put("Ege", new Bayi("İzmir", "Alsancak",95, false));
        guncelStok.put("Akdeniz", new Bayi("Antalya", "Kemer",65, true));
        System.out.println(guncelStok);


    }
}
