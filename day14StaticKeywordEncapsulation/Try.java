package day14StaticKeywordEncapsulation;

public class Try {

    public static void main(String[] args) {
        String degismSayisi = "5a0";

        int sonuc=StringCevirici(degismSayisi);
        System.out.println(degismSayisi+15);        //5015
        System.out.println(sonuc+15);               //65
    }

    public static int StringCevirici(String degisim){
        int sayi=0;
        try {
            sayi=Integer.valueOf(degisim);
        }catch (NumberFormatException e){
            System.out.println("buraya sayi dışı ifade giremezsiniz");
        }
        return sayi;
    }

}


