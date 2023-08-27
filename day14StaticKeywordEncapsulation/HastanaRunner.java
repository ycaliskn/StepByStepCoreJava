package day14StaticKeywordEncapsulation;

public class HastanaRunner {

    public static void main(String[] args) {


    HastaKayit kayit1=new HastaKayit();

        System.out.println(kayit1.hastaIsim);

        System.out.println(kayit1.getYatisBolum());

        System.out.println(kayit1.getOdaNo());

        System.out.println(kayit1.isGunlukOlcum());

        kayit1.setGunlukOlcum(true);

        System.out.println(kayit1.isGunlukOlcum());

        kayit1.setOdaNo(25);

        //kayit1.setYatisBolum("Yogun Bakim");

        System.out.println("yeni oda no : "+kayit1.getOdaNo());

        System.out.println(kayit1.getYatisBolum());

        HastaKayit kayit2=new HastaKayit();


        System.out.println(kayit2.getOdaNo());
    }


}
