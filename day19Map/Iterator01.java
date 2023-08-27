package day19Map;

import java.util.*;

public class Iterator01 {
    public static void main(String[] args) {

        List<String> nameList=new ArrayList<>();

        nameList.add("Ahmet Yılmaz");
        nameList.add("Hasan Demir");
        nameList.add("Ali Durmuş");
        nameList.add("Kamil Yıldız");

        for(String w: nameList){
            w=w+"*";
        }
        System.out.println(nameList);       //[Ahmet Yılmaz, Hasan Demir, Ali Durmuş, Kamil Yıldız]

        ListIterator<String> isimler= nameList.listIterator();

        while (isimler.hasNext()){
            String sonuc=isimler.next();
            isimler.set(sonuc+"*");
        }

        System.out.println(nameList);


    List<String> ogrenciler=new ArrayList<>();

        ogrenciler.add("Ahmet Yılmaz");
        ogrenciler.add("Hasan Demir");
        ogrenciler.add("Ali Durmuş");
        ogrenciler.add("Kamil Yıldız");

        System.out.println(ogrenciler);
//        ogrenciler.clear();
//        System.out.println(ogrenciler);

        ListIterator<String> ogrKayitlari=ogrenciler.listIterator();

//        while (ogrKayitlari.hasNext()){
//            ogrKayitlari.next();
//            ogrKayitlari.remove();
//        }

        System.out.println(ogrenciler);


        int sayac=0;

        while (ogrKayitlari.hasNext()){
           //System.out.println(ogrKayitlari.next());

            ogrKayitlari.next();
           // System.out.println(sayac);
            //sayac++;
        }


        while (ogrKayitlari.hasPrevious()){
            String oIsim=ogrKayitlari.previous();
            System.out.print(oIsim+", ");
        }


        List<String> soforKayit=new ArrayList<>();

        soforKayit.add("Ahmet Yılmaz");
        soforKayit.add("Hasan Demir");
        soforKayit.add("Ali Durmuş");
        soforKayit.add("Kamil Yıldız");

        System.out.println(soforKayit);

        Iterator<String> kayitsurucu=soforKayit.iterator();



    }
}
