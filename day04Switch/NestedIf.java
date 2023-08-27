package day04Switch;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println( "Almak istediğnizi arabanın markasını yazar mısnız?");
        String marka=input.next();
        System.out.println( "Nakit miktarınızı girer misiniz?");
        int nakit= input.nextInt();

        if(marka.equalsIgnoreCase("Toyota")){
            if(nakit<30000){
                System.out.println(30000-nakit+" kadar bakiyeniz yetersiz");
            }
            else{
                System.out.println( "Toyota siparişiniz olusturulmuştur");
            }

        } else if (marka.equalsIgnoreCase("Honda")) {

            if(nakit<40000){
                System.out.println(40000-nakit+" kadar bakiyeniz yetersiz");
            }
            else{
                System.out.println( "Honda siparişiniz olusturulmuştur");
            }
        } else {
            System.out.println("Ürün bayimiz tarafından satışda değildir");
        }


    }
}
