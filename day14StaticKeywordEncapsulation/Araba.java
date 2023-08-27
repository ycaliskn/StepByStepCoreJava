package day14StaticKeywordEncapsulation;

public class Araba {
    public static String marka = "Toyota" ;
    public String model = "Corolla" ;
    public int ucret = 350000 ;
    public static int sayac = 0 ;

    public Araba(){
        sayac++;
        ucret++;
    }

}
