package day07_DoWhileLoop;

import java.util.Scanner;

public class DoWhile01 {
    static String  name;
    public static void main(String[] args) {
        /*Ornek : Kullanıcıdan 100 den kucuk oldugu sürece sayi alınız 100 kucuk ise kazandiniz yazdirin
        aksi durumda kaybettiniz yazdiriniz.

	75       Kazandiniz
	50		  Kazandiniz
	125 		Kaybettiniz
*/
        String name2= " ";
        System.out.println(name);
        System.out.println(name2);
        int sayi1;
        int sayac=1;
        Scanner input=new Scanner(System.in);
        do{
            // ilk calismada kazandınız yazısını görmemek için sayaç variable ekledik.
            // en basta sayac =1  dedik if sart 1 iken yazdırmayacak sonra sayacı artıracagız ve her seferinde if in icine girmiş olacak
            if(sayac!=1){
            System.out.println("Kazandınız");
            }
            System.out.println("Lutfen bir sayi girinz:");
            sayi1 =input.nextInt();
            sayac++;
        }while (sayi1<100);
        System.out.println("Kaybettiniz");
    }
}
