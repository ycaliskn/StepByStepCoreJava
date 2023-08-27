package day19Map;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class Map02 {
    public static void main(String[] args) {
        //kelimede harflerimn tekrar sayisini yadirin
        // a=1, b=3, c=2, d=1

        String deneme="abcdcbb";

        String harfler[]=deneme.split("");
        System.out.println(Arrays.toString(harfler));
        //[a, b, c, d, c, b, b]

        HashMap<String, Integer> tekrarAdediKontrol=new HashMap<>();

        for (String w: harfler){            //[a, b, c, d, c, b, b]


            Integer harflerValue=tekrarAdediKontrol.get(w); //Araydeki elelman HashMap de var mı yok mu
                                                            // HashMap'de varsa ==> value /// yoksa ==> null
            if(harflerValue==null){
                tekrarAdediKontrol.put(w,1);
            }else{
                tekrarAdediKontrol.put(w,harflerValue+1);
            }
        }

        System.out.println(tekrarAdediKontrol);



        HashMap<String, Integer> kitapList=new HashMap<>();
        kitapList.put( "Matematik",3);
        kitapList.put( "Fizik", 2);
        kitapList.put( "Kimya", 5);
        kitapList.put( "Biyoloji", 1);
        kitapList.put( "Cografya", 7);

        System.out.println(kitapList);

        Collection<Integer> dgerlerVaule=kitapList.values();
        System.out.println(dgerlerVaule);

        Integer MatematikValue=kitapList.get("Matematik");
        System.out.println(MatematikValue);


        Integer BiyolojiValue=kitapList.get("Biyoloji");
        System.out.println(BiyolojiValue);

        Integer HukukValue=kitapList.get("Hukuk");
        System.out.println(HukukValue);

    }
}
