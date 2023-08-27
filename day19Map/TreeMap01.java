package day19Map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        TreeMap<String,Double > guncelStok=new TreeMap<>();
        guncelStok.put("Avakado",40.5);
        guncelStok.put("Kırmızı et", 85.5);
        guncelStok.put("Pirinc", 3.0);
        guncelStok.put("Un",20.0);
        guncelStok.put("Ekmek",15.5);
        guncelStok.put("Sogan",12.0);

        System.out.println(guncelStok);


        SortedMap<String, Double> sonuc=guncelStok.tailMap("Sogan");
        System.out.println(sonuc);

        NavigableMap<String,Double> sonuc2=guncelStok.tailMap("Kırmızı et", false);
        System.out.println(sonuc2);



        SortedMap<String, Double> result3=guncelStok.subMap("Ekmek","Sogan");
        System.out.println(result3);


        Map.Entry<String,Double> result4=guncelStok.lowerEntry("Kırmıze Et");
        System.out.println(result4);

        //lowerEntry() ==> girilen keyden onceki entry seti verir. giriren deger ilk key ise null verir
        Map.Entry<String,Double> result5=guncelStok.lowerEntry("Avakado");
        System.out.println(result5);


        ///lowerEntry() ==> girilen deger TreeMapde yoksa olsaydı var olacagı sıraya gore bir onceki degeri verir.
        Map.Entry<String,Double> result6=guncelStok.lowerEntry("Patates");
        System.out.println(result6);



        Map.Entry<String,Double> result7=guncelStok.higherEntry("Pirinc");
        System.out.println(result7);


        Map.Entry<String,Double> result8=guncelStok.ceilingEntry("Kırmızı Et");
        System.out.println(result8);



        Map.Entry<String,Double> result9=guncelStok.ceilingEntry("Dondurma");
        System.out.println(result9);


        Map.Entry<String,Double> result10=guncelStok.floorEntry("Pirinc");
        System.out.println(result10);

        Map.Entry<String,Double> result11=guncelStok.floorEntry("Dondurma");
        System.out.println(result11);

        Map.Entry<String,Double> result12=guncelStok.floorEntry("Ananas");
        System.out.println(result12);
    }
}
