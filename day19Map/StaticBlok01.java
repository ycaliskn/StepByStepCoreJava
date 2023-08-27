package day19Map;

public class StaticBlok01 {

    public static int sayilarToplami;
    private static String kelime;

    static {
        kelime="Ahmet";
        System.out.println("kelime : "+kelime);
    }

    public static void main(String[] args) {
        System.out.println("Main çalıştı");


    }

    static {
        sayilarToplami=5;
        System.out.println(sayilarToplami);
    }



}
