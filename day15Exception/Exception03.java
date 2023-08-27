package day15Exception;

public class Exception03 {

    public static void main(String[] args) {
        String str = "Hasan";
        kelimedekiCharSayisiniBul(str); // 5;
        String s = "";
        kelimedekiCharSayisiniBul(s);   //0
        String a  =null;
        kelimedekiCharSayisiniBul(a);  //==> NullPointerException
        // Eger lenght() methodunda null kullanirsaniz bu exeption i alabilirsiniz
    }
    public static void kelimedekiCharSayisiniBul(String z) {
        try {
            System.out.println(z.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Bir hata olustu \n");
            System.err.println(e.getMessage());


        }
    }

}
