package day15Exception;

public class Exception02 {
    public static void main(String[] args) {

        String arr[]={"Ahmet", "Hasan", "Deniz", "Mehmet"};

        indexNumarasiylaArraydekiElemaniGetir(arr,2);  //Deniz
        indexNumarasiylaArraydekiElemaniGetir(arr, 0);  //Ahmet
        indexNumarasiylaArraydekiElemaniGetir(arr,4);   //


        //Bir String Array den index girerek eleman elde edebilmek icin bir method olusturun

    }
        public static void indexNumarasiylaArraydekiElemaniGetir(String arr[], int idx){
            try{
                System.out.println(arr[idx]);

            }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println( "Aray index'de bir problem meydana geldi");
//            // Bu benim teknik olmayan aciklamam;

                //       System.err.println(e.getMessage());

//            System.err.println("Array index ile ilgili bir problem yasandi");
//            //farkli renkli yazdigimiz uyari mesajini veriyor.
//
                System.err.println(e.getMessage().toUpperCase());
//
//            e.printStackTrace(); //Exception ile ilgili detaylica teknik mesaj verir.
//
            }
    }
}
