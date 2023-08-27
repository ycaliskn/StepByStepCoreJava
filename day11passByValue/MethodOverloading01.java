package day11passByValue;

import java.time.LocalDate;
import java.util.Scanner;

public class MethodOverloading01 {
    public static void main(String[] args) {

        String name="Ahmet";



        double sonuc2= toplama(12,16.0);



       toplama(20.0,4);

  //      Scanner input=new Scanner(System.in);


        LocalDate currentDate= LocalDate.now();

        System.out.println(currentDate);


    }

    public static int toplama(int a, int b){
        return a+b;
    }
//    public static double toplama(double a, int b){
//        return a+b;
//    }
    public static double toplama(int a, double b){
        return a+b;
    }
    protected static double toplama(double a, double b){
        return a+b;
    }

    public static int toplama(int a, int b, int c){
        return a+b+c;
    }


}
