package day02TypeCasting;

public class Variable01 {

    public static int  sayi1=5;

    public static int number1=5;

    public static void main(String[] args){


        homework.Car esyam=new homework.Car();                //Honda güvenli bir sekilde durur
        esyam.dur();
        System.out.println(esyam.price);    //10000


//        String name="Yunus";
//        String surName="Deneme";
//        String bosluk=" ";
//        System.out.println(name+" "+surName);    //Yunus Deneme
//        System.out.println("    ");
//
//        System.out.println("\"Yunus\"");        //"Yunus"
//
//        System.out.println("*************************************************");
//
//        System.out.println("\"Yunus\"\bYunus");     //"YunusYunus
//
//        System.out.println("*************************************************");
//
//        System.out.println("\"Yunus\"\nYunus");     //"Yunus"
//                                                    //Yunus
//
//        System.out.println(number1);

        System.out.println(ilkIkiSayiToplaUcuncuIleCap(2,6,5));

        System.out.println(ikiSayininCarpimi(3.0,5.0));

        System.out.println(ikiSayiToplama(2, 5));



    }

    private static int ilkIkiSayiToplaUcuncuIleCap(int a, int b, int sayi) {
    return (a+b)*sayi;
    }

    public static int ikiSayiToplama(int a, int b){


        a=a+1;
        int sonuc= a+b;
        return sonuc;


    }

    public static double ikiSayininCarpimi(double a, double b){
        return a*b;
    }



    //Ornek ilk iki sayiyi toplayip ucuncu sayı ile carpan metodu yazdırın

        //class = variable + method   --> obje

}
