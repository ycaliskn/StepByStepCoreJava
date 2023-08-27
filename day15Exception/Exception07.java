package day15Exception;

import java.util.Scanner;

public class Exception07 {
    public static void main(String[] args) {

            System.out.println("Lutfen yasinizi giriniz...");
            Scanner input=new Scanner(System.in);
            int yas=input.nextInt();
           // yasYazdirma(yas);


            yasYazdirma2(yas);
//            try {
//                yasYazdirma2(yas);
//
//            }catch (IllegalArgumentException e){
//                System.out.println(e.getMessage());
//            }

        System.out.println( "--------------------------------------");


    }

    public static void yasYazdirma(int a){
        if(a>0){
            System.out.println(a);
        }else {
            System.out.println("Yas nagatif olmaz");
        }

    }




    public static void yasYazdirma2(int a){
        if(a<0||a>200){
            throw new IllegalArgumentException("Yas nagatif olamaz veya 200 den buyuk olamaz");

            //Method'un icinde exception üretme
        }
        System.out.println(a);

    }
}
