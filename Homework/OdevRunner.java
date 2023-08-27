package Homework;

public class OdevRunner {
    public static void main(String[] args) {
        Okul deneme1=new Ogrenci();
        deneme1.yapmak();
        System.out.println(deneme1.ogrenciSayisi);
        Okul deneme2=new Ogretmen();
        deneme2.yapmak();
        System.out.println(deneme2.ogretmenSayisi);

        Meb sistem1=new Meb();
        System.out.println(sistem1.getKazanc());

        Meb s1=new Ogretmen();
        System.out.println(s1.getKazanc());
    }
}
