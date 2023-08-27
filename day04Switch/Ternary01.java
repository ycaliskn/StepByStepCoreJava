package day04Switch;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Ternary01 {

    public static void main(String[] args) {
        //

//        int sayi=11;
//
//        if(sayi%2==0){
//            System.out.println("cift sayıdır");
//
//       }else {
//            System.out.println("Tek sayıdır");
//        }
//
//
//        String sonuc= sayi % 2 == 0 ? "Çift sayıdır" : "Tek sayıdır";
//        System.out.println(sonuc);
//
//
//    //Ekrana buyuk olan sayıyı yazdıran kodu yazınız
//
//        int sayi1=45;
//        int sayi2=45;
//
//        if(sayi1<sayi2){
//            System.out.println(sayi2);
//        }else {
//            System.out.println(sayi1);
//        }
//
//        System.out.println(sayi1 < sayi2 ? sayi2 : sayi1);


//        Verilen sayının mutlak degerini bulan kodu yazınız
//        sayi<0 sayi*-1
//        sayi>=0 sayi

//        int number=5;
//
//        if(number<0){
//            System.out.println(number*-1);
//        }   else {
//            System.out.println(number);
//        }
//
//       int result= number<0 ? number*-1 : number;
//        System.out.println(result);
//

//        İki sayı aynı işaretli ise çarpan, farklı işaretli ise Islem yapamam yazan kodu yazınız

        int nmbr1=-45;
        int nmbr2=-65;

        Object result= (nmbr1>=0 ||nmbr2>=0) && (nmbr1<0 ||nmbr2<0) ? nmbr1*nmbr2 : "Islem yapamam";


    }

}
