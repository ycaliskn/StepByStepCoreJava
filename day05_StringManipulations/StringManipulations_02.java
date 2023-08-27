package day05_StringManipulations;

public class StringManipulations_02 {

    public static void main(String[] args) {
        /*
        Bir password’un gecerli olup oladıgını asagıdakı kurallara gore inceleyiniz.
		1 ) Space hariç en az 8 character olmali
		2 ) En az 1 sembol icermeli
		3 ) En az 1 rakam icermeli
		4 ) En az 1 buyuk harf icermeli
		5 ) En az 2 kucuk harf icermeli

         */

        String psw="ALR0FSs. ";
        //1 sart
        boolean first=psw.replace(" ","").length()>7;

        //2 sart
        boolean second=psw.replaceAll("[^\\p{Punct}]", "").length()>0;

        //3 sart
        boolean third=psw.replaceAll("[^0-9]","").length()>0;

        //4 sart
        boolean fourth=psw.replaceAll("[^A-Z]","").length()>0;

        //5 sart
        boolean fifth=psw.replaceAll("[^a-z]","").length()>1;

        if (first&&second&&third&&fourth&&fifth){
            System.out.println("parola gecerli");
        }else{
            System.out.println("Hatalı parola");
        }

        /*
        Ornek : Verilen ifade "Al" ile baslıyor ve "dır" ile bitiyorsa Haklısın yazdırın aksi durumda Zaman Zaman yazdırın
		        Alısveris harikadır

         */
        System.out.println("---------------------------");
            String cumle1="alısveris harikadır ";


        System.out.println(cumle1.indexOf("harika"));
        System.out.println("----------------------------");
        System.out.println(cumle1.indexOf("a,5"));


        System.out.println(cumle1.lastIndexOf("a"));



        String cumle2="Kara kara karcık, ici dolu mayacık";
        System.out.println("----------");
        System.out.println(cumle2.lastIndexOf("a"));  //30
        System.out.println(cumle2.lastIndexOf('a',10));   //-->Kara kara k   -->8




        System.out.println(cumle1.startsWith("har", 10));

        //1 sart
        boolean birinci=cumle1.startsWith("Al");

        // 2 sart

        boolean ikinci=cumle1.endsWith("dır");

        if(birinci&&ikinci){
            System.out.println("haklısın");
        }else {
            System.out.println("zaman zaman");
        }





    }
}
