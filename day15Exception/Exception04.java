package day15Exception;

public class Exception04 {
    //String degeri int’e ceviren bir method olsuturunuz.
    public static void main(String[] args) {
        String degisimSayisi="5a0";
        int sonuc=stringCevirici(degisimSayisi);
        System.out.println(sonuc+15);

    }
    public static int stringCevirici(String degisim){
        int sayi=0;
        try {
            sayi=Integer.valueOf(degisim);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        return sayi;
    }

}

