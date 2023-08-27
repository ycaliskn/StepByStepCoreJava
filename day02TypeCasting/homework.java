package day02TypeCasting;

public class homework {

    public static void main(String[] args) {

        String name="Hasan";

        char ilkHarf=name.charAt(8); //-->H

        System.out.println(ilkHarf);


        int a=5;
        String name1=name+" "+ a;
        System.out.println(name1);


        name1.charAt(0);


        String nameSurname="Hasan Yılmaz";

        String deneme1=nameSurname.split(" ")[0];  // ---> Hasan


        System.out.println(deneme1);
    }


    public static class Car {


        public String marka= "Honda";
        public int price=10000;

        public static void main(String[] args) {

            Car araba= new Car();

            araba.dur();

        }

        public  void hareketEt(){
            System.out.println( "Benim arabam güzel hareket eder");
        }

        public  void dur(){
            System.out.println("Honda güvenli bir sekilde durur");
        }


    }
}
