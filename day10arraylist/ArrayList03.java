package day10arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        //Bir List’teki elemanlardan birbirine en yakın olanları arasındaki farkı bulunuz.
        //[10, 18, 13, 30, 20]                 [10, 13, 18, 20, 30]


        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(18);
        sayilar.add(13);
        sayilar.add(30);
        sayilar.add(20);
        System.out.println(sayilar);

        Collections.sort(sayilar);

        System.out.println(sayilar);      //  [10, 13, 18, 20, 30]

        int minFark=Integer.MAX_VALUE;

        for(int i=1; i<sayilar.size(); i++){
            minFark= Math.min(minFark, sayilar.get(i)-sayilar.get(i-1));


        }
        System.out.println(minFark);


        /*
        List’te 5 hariç tum elemanları 2 katına çıkarınız
        [3, 7, 18, 5, 12]

         */
        ArrayList<Integer> num=new ArrayList<>();
        num.add(3);
        num.add(7);
        num.add(18);
        num.add(5);
        num.add(12);
        System.out.println(num);

        //1 yol
//        for(Integer w:num) {
//            if (w != 5) {
//                num.set(num.indexOf(w), w * 2);
//            }
//        }
        //[6, 14, 36, 5, 24]

        //2 yol

        for (Integer w : num){
            if(w==5){
                continue;
            }
            num.set(num.indexOf(w), w * 2);
        }

        System.out.println(num);//[6, 14, 36, 5, 24]



        /*
        List’te 7 ve 7 den onceki tum elemanları 2 katına çıkarınız
        [13, 9, 18, 7, 18]

         */

        ArrayList<Integer> list=new ArrayList<>();

        list.add(13);
        list.add(4);
        list.add(15);
        list.add(7);
        list.add(18);
        System.out.println(list);
        for(int w:list){
            list.set(list.indexOf(w), w*2);
            if(w==7){
                break;
            }
        }
        System.out.println(list);

        /*
        [5, 12, 38] array listi icin kullanıcıdan sayi tahmini alan
        a ) Listeki bir sayiyi dogru buldugunda degeri list'ten silsin
        b ) yanlış sayı girdiğinde sayiyi liste ekleyen
        c ) her seferinde bulması için kalan sayilari  adetini  ekrana yazdıran
        d ) kullanıcı 0 girdiğinde arrayliste eklemeden sistmeden cıkan
        e ) hepsini buldugunda kazandınız yazan kodu girer olsuturur musunuz
         */

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> oyunNums=new ArrayList<>();

        oyunNums.add(5);
        oyunNums.add(12);
        oyunNums.add(38);



        do  {
            System.out.print("Bir sayı tahmin edin: ");
            int deneme = scanner.nextInt();

            if (deneme == 0) {
                System.out.println("Oyundan çıkıyorsunuz!");
                break;
            } else if (oyunNums.contains(deneme)) {
                Integer add=deneme;
                oyunNums.remove(add);

            } else {
                oyunNums.add(deneme);

            }if(oyunNums.size()>3){
            System.out.println("Oyunu kazanabilmek için yanlış girdiğin sayilar ile birlikte: "+oyunNums.size()+" kadar sayi bilmelisiniz");
            }else if(oyunNums.size()>0){
                System.out.println("Oyunu kazanabilmek için : " + oyunNums.size() + " kadar sayi bilmelisiniz");
            }else {
                System.out.println("Tebrikler oyunu kazandınız");
            }

        }while (oyunNums.size()!=0);
    }
}
