package day09_MultidimentionalArray01;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultidimentionalArray01 {
    public static void main(String[] args) {

        String cumle[][]={{"Ali", "ata", "bak"},{"Ali", "topu", "tut"},{"Ali", "okula", "git"}, {"Ali", "eve", "gel"} };
        //eleman sayısını hesaplayınız.

        int sub=0;
        for (String w[] :cumle){
            //System.out.println(Arrays.toString(w));                              // w[] --> ["Ali", "ata", "bak"]  sub = 9
            for(String k : w){
            //    System.out.println(k+" ");          // w[] --> ["Ali", "topu", "tut"]  sub = 19
                sub=sub+k.length();
           //     System.out.println(sub);            // w[] --> ["Ali", "okula", "git"] sub = 30
            }
        }
        System.out.println(sub);


        //: [Calisirsan Java kolaydir] [calismazsan hicbir] [sey kolay degildir].
        //Multidimentional Array’in içinde a içeren elemanları yazdırınız.

        String ornek[][]={{"Calisirsan", "Java", "kolaydir"}, {"calismazsan", "hicbir"}, {"sey", "kolay", "degildir"}};


        for(String w[] : ornek){
            /*
                w[] -> ["Calisirsan", "Java", "kolaydir"]
                w[] -> ["calismazsan", "hicbir"]
                w[] -> ["sey", "kolay", "degildir"]
             */





            for(String k : w){
                //w[] -> ["Calisirsan", "Java", "kolaydir"] --> k -->Calisirsan"
                //w[] -> ["Calisirsan", "Java", "kolaydir"] --> k -->Java
                //w[] -> ["Calisirsan", "Java", "kolaydir"] --> k -->kolaydır
                if(k.toLowerCase().contains("a")){
                    System.out.print(k+" ");
                }
            }
        }
        System.out.println();

        //Ornek :   Array’in elemanlari toplamini hesplayiniz.
        //[ [8, 16, 4], [68, 2], [45, 9, 6, 1] ]

        int sayilar[][]={{8, 16, 4}, {68, 2}, {45, 9, 6, 1}};

        System.out.println(sayilar[2][1]);

        int toplam=0;

        for(int w[] : sayilar){
            for(int k : w){
                toplam=toplam+k;
            }
        }
        System.out.println(toplam);

        /*
        Multidimensional Array’i normal Array’e ceviren kodu yazınız.
		 [ [8, 16, 4], [68, 2] ]
         */

        int number1[][]={{8, 16, 4},{68, 2}};

        System.out.println(Arrays.deepToString(number1));

        int elemanSayisi=0;
        for(int w[] : number1){
            elemanSayisi=elemanSayisi+w.length;

            }
        int tekArray[]=new int[elemanSayisi];  //[0, 0, 0, 0, 0]


        int index=0;
        for (int w[] : number1){
            for(int k : w){
                tekArray[index]=k;
                index++;
            }
        }
        System.out.println(Arrays.toString(tekArray));

        //
        int number2[][]={{8, 16, 4},{68, 2}};
        //en buyuk ve en kucuk sayilari bulunuz .

        int enBuyuk=number2[0][0];
        int enKucuk=number2[0][0];

        for(int w[] : number2){     // w[] --> [8 , 16, 4]
            for(int k :w){          // w[] --> [68, 2]
                enBuyuk=Math.max(enBuyuk,k);     //16 --- 68
                enKucuk=Math.min(enKucuk,k);    // 4  --- 2
            }
        }
        System.out.println("En buyuk sayi : "+ enBuyuk+"\n en Kucuk sayi : "+enKucuk);

    }
}


