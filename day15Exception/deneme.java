package day15Exception;

public class deneme {
    public static void main(String[] args) {

        String hastaIsimleri[]={"Ahmet", "Veli", "Hasan", "Deniz"};
      //  arraydenIndexElemaniGetir(hastaIsimleri,0);

      //  arraydenIndexElemaniGetir(hastaIsimleri,3);

      //  arraydenIndexElemaniGetir(hastaIsimleri,5);


//        String deneme1="Hasan";
//        stringUzunlukHesapla(deneme1);
//
//        String deneme2="";
//        stringUzunlukHesapla(deneme2);
//
//        String deneme3=null;
//        stringUzunlukHesapla(deneme3);



        String dene=null;

            double result1=stingIntBoluLenght(dene);
            /*
            1)NumberFormatException
            2)NullPointerException
            3)AritmaticException
             */
        System.out.println("result1 : "+result1);

        char sonuc=stringIndexdekiCharGetir("Hasan",0);

        System.out.println(sonuc);

        System.out.println(stringIndexdekiCharGetir("Hasan",3));  //a

        System.out.println(stringIndexdekiCharGetir("Hasan",6));
        //Bir String Array den index girerek eleman elde edebilmek icin bir method olusturun.
    }
    public static void arraydenIndexElemaniGetir(String str[], int index){
        try{
            System.out.println(str[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
            System.out.println("Array uzunlugundan buyuk bir index degeri girdiniz");
            e.printStackTrace();
        }

    }

    public static void stringUzunlukHesapla(String a){
        try {
            System.out.println(a.length());
        }catch (NullPointerException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static char stringIndexdekiCharGetir(String str, int indx){
        char sonuc=' ';

        try {

            sonuc=str.charAt(indx);
        }catch (StringIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }
        return sonuc;
    }


    public static double stingIntBoluLenght(String kelime){
        double sonuc=0;
        try {
            int uzunluk=kelime.length();
            int sayisalDegeri= Integer.valueOf(kelime);
            sonuc=sayisalDegeri/uzunluk;
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        return sonuc;
    }

    //2. yol

    public static double stingIntBoluLenght2(String kelime){
        double sonuc=0;
        try {
            int uzunluk=kelime.length();
            int sayisalDegeri= Integer.valueOf(kelime);
            sonuc=sayisalDegeri/uzunluk;
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return sonuc;
    }

}
