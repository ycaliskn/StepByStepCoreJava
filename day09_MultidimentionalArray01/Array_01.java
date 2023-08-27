package day09_MultidimentionalArray01;

import java.util.Arrays;

public class Array_01 {
    public static void main(String[] args) {

        //Asağıdaki Array için ek buyuk negatif ve en kucuk pozitif sayiyi bulunuz.
        int sayilarListe[] = {45, -70, 95, -3, 8, 20, -15};

        Arrays.sort(sayilarListe);

        System.out.println(Arrays.toString(sayilarListe));  // [-70, -15, -3, 8, 20, 45, 95]

        int sayilar[] = {-70, -15, -3, 8, 20, 45, 95};
        int enKucukPozitif=sayilar[sayilar.length-1];
        int enBuyukNegatif=sayilar[0];







        for(int w: sayilar){
            if(w<0){
                if(enBuyukNegatif<w) {
                    enBuyukNegatif = w;

                }
            }if(w>0) {
                    if (enKucukPozitif > w){
                        enKucukPozitif=w;
                    }
                }
            }

        System.out.println(""+enBuyukNegatif+" "+ enKucukPozitif);


        System.out.println(Math.max(2, 8));

        System.out.println(Math.max(-2,-80));

        System.out.println(Math.min(85,150));

        System.out.println(Math.min(0,50));

        int number[][]= {{5 , 3}, {8  , 16}, {6  , -3}};



                System.out.println(Arrays.deepToString(number));

        System.out.println(Arrays.toString(number[1]));

        System.out.println(number[0][1]);
        System.out.println(number[2][0]);

        //[[Ali, ata, bak], [Ali, topu, tut], [Ali, okula, git], [Ali, eve, gel]]

        String cumle[][]={{"Ali", "ata", "bak"},{"Ali", "topu", "tut"},{"Ali", "okula", "git"}, {"Ali", "eve", "gel"} };

        System.out.println(cumle[0][1]);
        System.out.println(Arrays.toString(cumle[1]));      //[Ali, topu, tut]

        System.out.println(cumle[3][1]);                //eve
        System.out.println(Arrays.deepToString(cumle));  //[[Ali, ata, bak], [Ali, topu, tut], [Ali, okula, git], [Ali, eve, gel]]


    }



    }

