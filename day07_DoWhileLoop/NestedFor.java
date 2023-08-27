package day07_DoWhileLoop;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class NestedFor {

    public static void main(String[] args) {
        //her ay icin 4 hafta olmalı bunu loop ile 3 ay icin yazdiralim

//        for(int i = 1; i<4; i++) {
//            System.out.println("ay"+i);
//
//            for(int k=1; k<5; k++){
//                System.out.println("hafta" +k);
//            }
//        }
//
//        /*Asagıdaki sekli ekrana yazdırınız.
//
//        ****
//        ****
//        ****
//        ****
//        ****
//        ****
//         */
//
//
          Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen satir sayisini giriniz");
//        int satir=input.nextInt();
//
//        System.out.println("Lutfen sutun sayisini giriniz");
//        int sutun=input.nextInt();
//
//        System.out.println("Lutfen sekil giriniz");
//        char sekil=input.next().charAt(0);
//
//        for(int i=1; i<=satir; i++){
//
//            for(int k=1; k<=sutun; k++){
//                System.out.print(sekil); // ***
//
//
//                                      //***
//            }
//
//            System.out.println();
//        }
        /*
        Asagidaki sekli cizen kodu yazınız.
			1
			1 2
			1 2 3
			1 2 3 4

         */

        for(int i=1; i<5; i++){

                for(int k=1; k<=i; k++){
                    System.out.print(k+" ");
                }
            System.out.println();

        }

        /*
            *****  tekrar 5  -->  1
            ****   terka  4  i--> 2
            ***    tekrar 3  i --> 3
            **     tekrar 2  i --> 4
            *      tekrar 1 i --> 5
             satir sayisini kullanıcıdan alınız

         */

        System.out.println("Lutfen satir sayisini giriniz");
        int satirSayi=input.nextInt();

        for(int i=1; i<=satirSayi; i++){
            for (int k=satirSayi; k>=i; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
