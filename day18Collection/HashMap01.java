package day18Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {
        HashMap<String, Integer> isimList=new HashMap<>();
        isimList.put("Ajdar", 3000);
        System.out.println(isimList);
        isimList.put("Acun Ilıcalı", 5000);
        isimList.put("Tom Hans", 7000);
        isimList.put("Omer Faruk", 8000);
        System.out.println(isimList);

        isimList.put("Omer Faruk", 10000);
        System.out.println(isimList);

        isimList.put("Hasan Ali Kaldırım", 8000);

        System.out.println(isimList);

        isimList.put(null, 3000);
        System.out.println(isimList);

        isimList.put(null,2000);
        System.out.println(isimList);

        Set<String> keyIsimList = isimList.keySet();
        System.out.println(keyIsimList);


        isimList.put("Ajda Pekka", null);

        isimList.put("Dede Korkut", null);


        System.out.println(isimList);

        Collection<Integer> valueIsimList=isimList.values();

        System.out.println(valueIsimList);

        Integer valueOmerFaruk=isimList.get("Omer Faruk");


        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");

        Integer silmeAjdaPekkan=isimList.remove("Ajda Pekka");
        System.out.println(silmeAjdaPekkan);
        System.out.println(isimList);

        boolean result2=isimList.remove("Ajdar",3000);
        System.out.println(result2);
        System.out.println(isimList);

        Integer newdeneme=isimList.replace("Acun Ilıcalı", 1000);
        System.out.println(newdeneme);
        System.out.println(isimList);

        boolean sonuc3=isimList.replace("Acun Ilıcalı", 3000, 8500);
        System.out.println(sonuc3);
        System.out.println(isimList);

        //Tum Integer degerlerin ortalamasını veren kodu yazınız.
        Collection<Integer> valuesOrnek1=isimList.values();
        Integer sub=0;
        int sayac=0;

        for (Integer w : valuesOrnek1){
            if(w!=null){
                sub=sub+w;
                sayac++;
            }
        }
        System.out.println("isimList value degerleri ortalaması : "+ (sub/sayac));


        isimList.put("Angalina Julie",10000);
        isimList.put("Brad Pit", 9500);
        isimList.put("Cuneyt Arkın", 10500);
        isimList.put("Ayşen Gruda", 6500);

        System.out.println(isimList);

        //A ile baslamayan isimlerin toplam character sayisini hesaplayınız.

        Collection <String> ornek2Key= isimList.keySet();
        int toplam=0;

        for (String w: ornek2Key){
            if((w!=null)&&((!w.startsWith("a"))||(!w.startsWith("A")))){
                toplam=toplam+w.length();
            }
        }

        System.out.println(toplam);

        //   Ornek : her bir entry’i alt alta yazdırın.
        Set<Map.Entry<String, Integer>> setIsimList= isimList.entrySet();

        System.out.println(setIsimList);

        for (Map.Entry w : setIsimList){
            System.out.println(w);
        }

        Integer sonuc4=isimList.putIfAbsent("Kemal Sunal", 15500);
        System.out.println(sonuc4);
        System.out.println(isimList);

        /*
        putIfAbsent()
        deger key olaraka varsa value'yu degiştirmiyor farklı value yazılsa da value yo koruyor ve Integer olarak value verir
        deger key olaraka yoksa ekleme yapıyor
         */
    }
}
