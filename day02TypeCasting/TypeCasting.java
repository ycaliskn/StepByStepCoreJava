package day02TypeCasting;

public class TypeCasting {


    public static void main(String[] args) {

        byte sayi1=56;
        short yeniSayi1=sayi1;
        System.out.println(yeniSayi1);    //56

        short sayi2=5654;
        int yeniSayi2=sayi2;
        System.out.println(yeniSayi2);      //5654

        int sayi3=4566555;
        double yeniSayi3=sayi3;
        System.out.println(yeniSayi3);

        int sayi4=465;
        short yeniSayi4= (short) sayi4;
        System.out.println(yeniSayi4);
        short sayi5=295;
        byte yeniSayi5= (byte) sayi5;
        System.out.println(yeniSayi5);

        short sayi6=510;
        byte yeniSayi6=(byte) sayi6;
        System.out.println(yeniSayi6);

    }
}
