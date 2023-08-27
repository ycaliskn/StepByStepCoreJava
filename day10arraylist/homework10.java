package day10arraylist;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class homework10 {
    public static void main(String[] args) {


        /*1
        Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan kismini list olarak bize donduren bir method olusturun
        ["Ahmet", "Hasan", "Ali", "Mehmet", "John", "Angelina", "Tom"]  // istemeyen harf -->a
        ["Mehmet", "John", "Tom"];

         */

        ArrayList<String> list1=new ArrayList<>();
        list1.add("Ahmet");
        list1.add("Hasan");
        list1.add("Ali");
        list1.add("Mehmet");
        list1.add("John");
        list1.add("Angelina");
        list1.add("Tom");
        ArrayList<String> tersList1=new ArrayList<>();
        System.out.println(list1);

        for(String w:list1){
            if(!(w.toLowerCase().contains("a")))
            tersList1.add(w);
        }
        System.out.println(tersList1);
        System.out.println("---------------------------------------------------------------------------------------");

        /*2
            Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan kismini list olarak bize donduren bir
            ["Ahmet", "Hasan", "Ali", "Mehmet", "John", "Angelina", "Tom"]
         */

        ArrayList<String> list=new ArrayList<>();
        list.add("Ahmet");
        list.add("Hasan");
        list.add("Ali");
        list.add("Mehmet");
        list.add("John");
        list.add("Angelina");
        list.add("Tom");
        ArrayList<String> tersList=new ArrayList<>();
        System.out.println(list);

        for(int i=list.size()-1; i>-1;i--){
            tersList.add(list.get(i));
        }
        System.out.println(tersList);

        /*3
        // iki Chracter array olusturunuz
		// ve bu array’lerdeki ortak elemanlari bulunuz ortak eleman yok ise ortak eleman yoktur yazdırınız.
		// varsa ortak elemanları kesisim adında bir liste atayın ve ekrana yazdırın
		// ilk listeden kesisim elemanlarını silip ilk listeyi ekrana yazdırınız

		['A', 'Z', 'F', 'D', 'C']
		['T', 'A', 'U', 'C', 'K']

         */

        ArrayList<Character> firstList=new ArrayList<>();
        ArrayList<Character> secondList=new ArrayList<>();
        ArrayList<Character> kesisim=new ArrayList<>();
        firstList.add('A');
        firstList.add('Z');
        firstList.add('F');
        firstList.add('D');
        firstList.add('C');

        secondList.add('T');
        secondList.add('A');
        secondList.add('U');
        secondList.add('C');
        secondList.add('K');
        System.out.println(firstList);
        System.out.println(secondList);

        for(Character w : firstList){
            for (Character k:secondList){
                if(w.equals(k)){
                        kesisim.add(k);
                }
            }
        }
        System.out.println(kesisim);
        firstList.removeAll(kesisim);
        System.out.println(firstList);

        /*4
        ["Tom", "Brad", "Johny", "Angelina", "Mark"]
        {'T', 'B', 'J', 'A', 'M'};
         verilen iki Array'i yeni bir ArrayList'e ceviriniz.
         */

        char names[]={'T', 'B', 'J', 'A', 'M'};
        ArrayList<Character> namesList=new ArrayList<>();
//
        for (char w : names ){
            namesList.add(w);
        }
        System.out.println(namesList);


        //b
        ArrayList<String> denemeList=new ArrayList<>();
        String deneme[]={"Tom", "Brad", "Johny", "Angelina", "Mark"};

        for (String w : deneme ){
            denemeList.add(w);
        }
        System.out.println("denemeList : "+denemeList);

        //b için 2 yol

        ArrayList<String> yolDeneme=new ArrayList<>(Arrays.asList(deneme));

        System.out.println("yolDeneme : "+yolDeneme);


        /*

         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> oyunNums=new ArrayList<>();

        oyunNums.add(5);
        oyunNums.add(12);
        oyunNums.add(38);



        do  {
            System.out.print("Bir sayı tahmin edin: ");
            int tahmin = scanner.nextInt();

            if (tahmin == 0) {
                System.out.println("Oyundan çıkıyorsunuz!");
                break;
            } else if (oyunNums.contains(deneme)) {
                Integer add=tahmin;
                oyunNums.remove(add);

            } else {
                oyunNums.add(tahmin);

            }if(oyunNums.size()>3){
                System.out.println("Oyunu kazanabilmek için yanlış girdiğin sayilar ile birlikte: "+oyunNums.size()+" kadar sayi bilmelisiniz");
            }else if(oyunNums.size()>0){
                System.out.println("Oyunu kazanabilmek için : " + oyunNums.size() + " kadar sayi bilmelisiniz");
            }else {
                System.out.println("Tebrikler oyunu kazandınız");
            }

        }while (oyunNums.size()!=0);

        int price=100;

        System.out.println(price);     //100
        change(price);                  //200

        System.out.println(price);      //100

        int ogrPrice=saleOgrenci(price);
        System.out.println(ogrPrice);     //90

        LocalDate currentDate= LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        System.out.println(currentDate);   // 2023-07-14
        System.out.println(currentTime);   // 20:04:59.546797

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1=dtf1.format(currentDate);
        System.out.println(formattedDate1);  //07/14/2023

        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println(currentDateTime);
        //2023-07-14T20:12:43.341608500


        LocalDateTime currentDateTimeInJapon=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapon);
        //2023-07-14T20:12:43.341608500

        LocalDate dogumAhmet=LocalDate.of(2000,12,17);
        LocalDate dogumHasan=LocalDate.of(2008,5,17);

        Long yasFarki=ChronoUnit.DAYS.between(dogumAhmet, dogumHasan);

    }

    public static void change(int x){
        System.out.println(2*x);

    }

    public static int saleOgrenci(int a){
        return a*9/10;
    }

    public static int add(int... a){
        int toplam =0;
        for(int w : a){
            toplam=toplam+w;
        }
        return toplam;
    }

    public static void carpmaIslemi(int a, int b){
        System.out.println(a*b);
    }
    public static void carpmaIslemi(int a, int b, int c){
        System.out.println(a*b*c);
    }
    public static void carpmaIslemi(int a, double b){
        System.out.println(a*b);
    }
    public static void carpmaIslemi(double a, int b){
        System.out.println(a*b);
    }
}

