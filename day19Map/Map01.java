package day19Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class Map01 {
    public static void main(String[] args) {


        /*
        at Ali pas at, hadi pas at." cumlesindeki kelimelerin tekrar sayisi ile yazdirin.
        {Ali=1, at=2, hadi=1, pas=2} seklinde yazdırır mısınız.
         */


        String cumle = "at Ali pas at, hadi pas at.";

        cumle=cumle.replaceAll("\\p{Punct}", "");
        System.out.println(cumle);      //at Ali pas at hadi pas at

        String kelime[]=cumle.split(" ");
        System.out.println(Arrays.toString(kelime));
        //[at, Ali, pas, at, hadi, pas, at]

        HashMap<String, Integer> tekrarAdedi=new HashMap<>();

//        //deneme
//        tekrarAdedi.put("Mehmet", 3);
//        tekrarAdedi.put("Hasan", 5);
//        System.out.println(tekrarAdedi.get("Kazım"));

        for (String w : kelime) {           //[Ali, pas, at, hadi, pas, at]
            Integer kelimeninValue = tekrarAdedi.get(w);

            if (kelimeninValue == null){
                tekrarAdedi.put(w,1);
            }else{
                tekrarAdedi.put(w,kelimeninValue+1);
            }


        }
        System.out.println(tekrarAdedi);
    }
}
