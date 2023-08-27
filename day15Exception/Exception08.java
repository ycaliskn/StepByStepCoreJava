package day15Exception;

public class Exception08 {
    public static void main(String[] args) {
        //double r1 = compareNumOfCharacters("Java", "xy");
      //  System.out.println(r1);

        double r2 = compareNumOfCharacters(null, "xy");
        System.out.println(r2);

    }

    public static double compareNumOfCharacters(String s, String t) {
        double result = 0;
        try {
            result = s.length() / t.length();
        } catch (NullPointerException e) {
            System.out.println("lenght() method'u null ile kullanilmaz");
        } catch (ArithmeticException e) {
            System.out.println("Herhangi bir sayi sifir ile bolunemez");
        }   finally {
            System.out.println("Server ile baglantıyı kes");
        }

        return result;
    }
}