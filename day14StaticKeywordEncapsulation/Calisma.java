package day14StaticKeywordEncapsulation;

public class Calisma {

    static int sayi=10;



    public static void main(String[] args) {
        Calisma clsm1=new Calisma();
        Calisma clsm2=new Calisma();

        clsm1.sayi=sayi+5;
        clsm2.sayi=sayi+20;

        System.out.println(clsm1.sayi);
        System.out.println(clsm2.sayi);


    }
}
