package day16Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {

    public static void main(String[] args) throws IOException {
       // FileInputStream fis=new FileInputStream("src/main/java/day16Abstraction/File1.txt");

        /*
        1) FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
           "new" den sonraki "FileInputStream" hata verir. Java'ya verilen adresteki dosya'ya git dedik,
           Java iki durum icin endise'ye kapildi
                    i)Ya adres yanlissa
                    ii)Ya verilen adreste dosya yoksa.
           Biz "method isminden" sonra, "throws FileNotFoundException" yazarak, Java'ya bu iki endise duydugun durum
           olusursa "Exception At" dedik.
         */




        int a='g';
        System.out.println(a);
        System.out.println((char)a);



        ChaCharOkumaYazdirma();

        ChaCharOkumaYazdirma2();

    }

    public static void ChaCharOkumaYazdirma() throws IOException, ArithmeticException {
        FileInputStream fis=new FileInputStream("src/main/java/day16Abstraction/File1.txt");
        int k=0;
        while ((k=fis.read())!=-1){
            System.out.print((char)k);
        }

    }
    public static void ChaCharOkumaYazdirma2()   {
        try {
            FileInputStream fis=new FileInputStream("src/main/java/day16Abstraction/File1.txt");


                int k=0;
                while ((k=fis.read())!=-1){
                    System.out.print((char) k);
            }



        } catch (FileNotFoundException e) {
            System.out.println("Adres bilgisi hatalı veya adreste dosya bulunmuyor...."+e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayan chracter mevcut...."+e.getMessage());
        }


    }

}
