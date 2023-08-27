package day04Switch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Kullanıcıdan yapılamsını istediği işlem işareti ve iki sayı alarak dört işlem yapan bir kod yazınız.


        Scanner input=new Scanner(System.in);
        System.out.println("lutfen ilk sayı giriniz");
        double sayi1=input.nextDouble();
        System.out.println("lutfen yapmak istediginiz 4 işlemi + - * /");
        char islem=input.next().charAt(0);
        System.out.println("lutfen ikinci sayıyı giriniz");
        double sayi2=input.nextDouble();


        switch (islem){
            case '+':
                System.out.println("Sonuç : " +(sayi2+sayi1));
                break;
            case '-':
                System.out.println("Sonuç : " +(sayi1-sayi2));
                break;
            case '*':
                System.out.println("Sonuç : " +(sayi1*sayi2));
                break;
            case '/':
                System.out.println("Sonuç : " +(sayi1/sayi2));
                break;
            default:
                System.out.println("Gecerli bir işlem giriniz. gecerli işlemler + - * / ");
        }


//        System.out.println("lütfen sayı giriniz");
//        double sayi1 =input.nextDouble();
//        System.out.println("lütfen bir sayı daha giriniz");
//        double sayi2 =input.nextDouble();
//        System.out.println(" 4 işlemi gir");
//        char islem= input.next().charAt(0);
//        switch (islem){
//            case '+':
//                System.out.println("Sonuç:"+(sayi1+sayi2));
//                break;
//            case '-':
//                System.out.println("sonuç"+ (sayi1-sayi2));
//                break;
//            case '/':
//                System.out.println("sonuç"+(sayi1/sayi2));
//                break;
//            case '*':
//                System.out.println("sonuç"+(sayi1*sayi2));
//                break;
//            default:
//                System.out.println("hay senin yapacağın işe");
//        }
    }

}
