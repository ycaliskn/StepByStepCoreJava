package day13InheritancePolymorphism;

import java.util.Scanner;

public class EgitimRunner {
    public static void main(String[] args) {
        Ogretmen teacher=new Ogretmen();
        teacher.yapmak();                              //         teacher.yapmak();

        System.out.println(teacher.ogretmenSayisi);  //5

        Meb teacher1=new Ogretmen();

        System.out.println(teacher1.ogrenciSayisi);
        System.out.println(teacher1.ogretmenSayisi);        //140000
        teacher1.yapmak();                              //        Ogretmenler eğitim verir

        Meb stnd=new Ogrenci();
        System.out.println(stnd.ogrenciSayisi);         // 200000

        Meb milliEgitim=new Meb();
        milliEgitim.yapmak();            //   Guzel toplum için kaliteli egitim sağlar.

        Okul ogrneciOkul=new Ogrenci();
        ogrneciOkul.maas();

        Meb ogretmen2=new Ogretmen();
        ogretmen2.yapmak();

    }
}
