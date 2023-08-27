package day04Switch;

import java.util.Scanner;

public class homewrok {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.println("Lütfen cinsiyet bilgisini ERKEK & KADIN OLARAK girer misiniz?");
//        String gender= input.next();
//        System.out.println("Lütfen yaşınızı giriniz");
//        int age= input.nextInt();
//        if(gender.equalsIgnoreCase("KADIN")){
//            if(age<0){
//                System.out.println("Yaş bilgisi negatif olamaz");
//
//            }else if(age<60){
//                System.out.println("Emekliliğiniz icin "+(60-age)+" yıl daha çalışmanız gerekiyor");
//            }else {
//                System.out.println("Emekliliğin tadını çıkarın");
//            }
//        }
//        else if(gender.equalsIgnoreCase("Erkek")){
//                if(age<0){
//                    System.out.println("Yaş bilgisi negatif olamaz");
//
//                }else if(age<65){
//                    System.out.println("Emekliliğiniz icin "+(65-age)+" yıl daha çalışmanız gerekiyor");
//                }else {
//                    System.out.println("Emekliliğin tadını çıkarın");
//                }
//        }else{
//            System.out.println("Cinsiyet bilgisini lutfen \"KADIN\" veya \"ERKEK\" olarak giriniz");
//        }


        //1 pazar
        //2 pazartesi
        //3 salı

//            int gunNo = 6;
//            switch (gunNo) {
//                case 2:
//                case 3:
//                case 4:
//                case 5:
//                case 6:
//                    System.out.println("Simdi calisma zamani tatile " + (7- gunNo)+" gun var");
//                    break;
//                case 7:
//                case 1:
//                    System.out.println("Hafta Sonu Simdi dinlenme zamani");
//                    break;
//                default:
//                    System.out.println("Lutfen gecerli bir gun numarasi yaziniz");
//            }

//        int a = 4, b = 3, c = 3;
//
//
//       String result= (a == b) ? ((b == c) ? "eskenar ucgen" : "Ikızkenar ucgen") :
//                                    ((a==c) ? "İkizkenar Ucgen" : (b==c)? "Ikızkenar Ucgen " : "Cesitkenar ucgen");
//
//        String ucgenTipi = a==b && b==c ? "Eskenar Ucgen" : (a==b && b!=c || a==c && b!=c || b==c &&
//                a!=c ? " Ikizkenar Ucgen" : "Cesit Kenar Ucgen");
//
//        System.out.println(result);
//        System.out.println(ucgenTipi);

int sayi=100;

        System.out.println((sayi < -99 && sayi > -1000) || (sayi >99 && sayi < 1000) ? "Uc basamakli" : "Uc basamakli degil");

    }

}
