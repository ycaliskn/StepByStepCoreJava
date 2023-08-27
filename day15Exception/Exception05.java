package day15Exception;

public class Exception05 {

    public static void main(String[] args) {

        char ch1=IndexdekiCharGetir("Deneme",2);
        System.out.println(ch1);  //v


        char ch2=IndexdekiCharGetir("Java",5);
        System.out.println(ch2); //StringIndexOutOfBoundsException : Eger bir String'den character/ler alirken olmayan
        // bir index kullanilirsa StringIndexOutOfBoundsException
        // alinir.

        //bir kod yazdiginizda hata mesaji alinirsa log lara bakilir.
    }
    public static char IndexdekiCharGetir(String str, int idx){

        char ch=' ';

        try{
            ch=str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("İndex ile ilgili bir problem olustu."+e.getMessage());

            // e.printStackTrace();  //Detayli "log" icin
        }

        return  ch;
    }
}
