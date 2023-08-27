package day16Exception;

public class CustomExcepiton {
    public static void main(String[] args) throws IllegalGradeException {


        notlariEkranaYazdir(100);
        boolean denemeSonuc=isimChecked("Deniz");
        System.out.println(denemeSonuc);
    }
    public static void notlariEkranaYazdir(int a) throws IllegalGradeException {
        if(a<0||a>100){
            throw new IllegalGradeException("Notlar 0 ile 100 arasındadir.");
        }
        else {
            System.out.println(a);
        }
    }
    public static boolean isimChecked(String name){
        boolean sonuc=true;
        if(name.charAt(0)>='A'&& name.charAt(0)<='Z') {
            sonuc = true;
        }else {
            sonuc=false;
            throw new IllegalNameException("Buyuk harf ile baslamali");

        }
        return sonuc;
    }

}
