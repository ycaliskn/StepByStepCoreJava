package day06_ForLoop;


public class ForLoop01 {
    public static void main(String[] args) {


//        String name="";
//        String sonuc=name.repeat(5);
//        System.out.println(sonuc);
//        double i=50.45;
//        String yeniSayi=String.valueOf(i);
//        System.out.println(yeniSayi);
//        double primitiveSayi=Double.valueOf(yeniSayi);
//        System.out.println(primitiveSayi);





//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//
//        for(int i =1; i<5; i=i+1 ){
//            System.out.println(i);
//        }

        for(int k=5; k<=11; k=k+1) {
            System.out.print(k + " ");

            //19 dan 8 e kadar tüm sayıları aynı satıra yazdırınız.
        }
        System.out.println();
            for(int i=19; i>7;i--){
                System.out.print(i+" ");
            }

        System.out.println();
            //19 dan 8 e kadar tüm cift sayıları aynı satıra yazdırınız.

        for(int i=18; i>7;i=i-2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------");
        for(int i=19; i>7;i--){
            if(i%2==0){
            System.out.print(i+" ");
            }

        }

        System.out.println();
        System.out.println("-------------------------");

        //38 dan 141 e kadar tüm "tek" sayıları aynı satıra yazdırınız.
        for(int i=38; i<=141; i++){

            if(i%2==1){
                System.out.print(i+"-");
            }
        }

        System.out.println();
        //"Burak” String’ini “B*u*r*a*k*” ceviren kodu yazdırınız
        String kelime1="Burak";


        for(int i=0; i<kelime1.length(); i++){
            System.out.print(kelime1.charAt(i)+"*");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        //“sarkastik” String’inin tekrarsız harflerini  ekrana yazdıran kodu yazınız
        String kelime2="sarkastik";
        String sonuc="";
        for(int i=0; i<kelime2.length(); i++){
            char harf1=kelime2.charAt(i);

            if(kelime2.indexOf(harf1)==kelime2.lastIndexOf(harf1)){
                System.out.print(sonuc +harf1);
            }


        }
        System.out.println();
        System.out.println("-----------------------------------------");

        //4 ten 8 e kadar olan tam sayiların toplamını hesaplayan kodu yazınız
        int sum=0;
        for(int i=4; i<9; i++){

            sum=sum+i;
            System.out.println(sum);
        }

        System.out.println();
        System.out.println("*************************************");
        int multpl=1;
       // 5 ten 2 e kadar olan tam sayiların çarpımını hesaplayan kodu yazınız.
        for(int i=5; i>1; i--){
            multpl=multpl*i;
            System.out.println(multpl);
        }
        System.out.println("");
        /*Size verilen Stringi tersten yazdıran kodu yaziniz?
		     SALI    ILAS
    */
        String deneme1="SALI";

        String result1="";
        for(int i=deneme1.length()-1; i>=0; i--){
            result1=result1+deneme1.charAt(i);

            System.out.println(result1);
        }
       // System.out.println(result1);

        //Size verilen String’deki a harfi haric tüm characterleri yazdiriniz.
        //		   muvafakatname  muvfktnme

        String deneme2="muvafakatname";

        for(int i=0; i<deneme2.length(); i++){
            if(deneme2.charAt(i)=='a'){
                continue;
            }
            System.out.print(deneme2.charAt(i));
        }
        System.out.println();
       // 2. yol
        for(int i=0; i<deneme2.length(); i++){
            if(deneme2.charAt(i)!='a'){
                System.out.print(deneme2.charAt(i));
            }

        }
        System.out.println();
        //10 dan 50’ye kadar kadar sayiları 4 e bolunenler haric ekrana yazdiriniz.


        for(int i=10; i<51; i++){
            if(i%4!=0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        //muvafakatname kelimesinin n harfinden onceki characterleri yazdiriniz

        for(int i=0; i<deneme2.length(); i++){

            if(deneme2.charAt(i)=='n'){
                break;
            }
            System.out.print(deneme2.charAt(i));
        }



    }
    }

