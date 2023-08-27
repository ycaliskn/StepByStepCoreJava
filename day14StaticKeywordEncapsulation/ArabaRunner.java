package day14StaticKeywordEncapsulation;

import org.w3c.dom.ls.LSOutput;

public class ArabaRunner {
    public static void main(String[] args) {




        System.out.println(toplam(5, 3));


        Araba araba1 = new Araba();
        Araba araba2 = new Araba();
        Araba araba3 =new Araba();
        Araba araba4 =new Araba();

        System.out.println(araba1.ucret);
        System.out.println(araba1.sayac);

        System.out.println(araba2.ucret);
        System.out.println(araba2.sayac);


        System.out.println(araba3.ucret);
        System.out.println(araba3.sayac);

    }
    public static final int toplam(int a, int b){
        return a+b;
    }

    public static final double toplam(int a, double b){
        return a+b;
    }

    public static final double toplam(double a, double b){
        return a+b;
    }

    public static final double toplam(double a, double b, double c){
        return a+b+c;
    }
}
