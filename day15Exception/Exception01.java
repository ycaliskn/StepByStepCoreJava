package day15Exception;

public class Exception01 {
    public static void main(String[] args) {
   //     bolmeIslemiYap(10,2);   // ==> 5
   //     bolmeIslemiYap(0,6);    // ==> 0
   //     System.out.println("Bolme islemini yaptı");
        bolmeIslemiYap2(8,0);    // ==>

        System.out.println("----------------------------------------------------------------");
        System.out.println("Bolme islemini yaptı 2");


    }

    static void bolmeIslemiYap(int x, int y){
        System.out.println(x/y);

    }

    public static void bolmeIslemiYap2(int a, int b) {
        try {
            System.out.println(a / b);

            System.out.println("başarı ile çalıştı");


        } catch (ArithmeticException e) {
            //System.out.println("Bolme isleminde bir problem olustu ==>");

            //System.err.println("Bolme isleminde malesef 1 problem olustu ");//Bolme isleminde malesef 1 problem olustu

           // System.err.println(e.getMessage());

            e.printStackTrace();

          //  e.getMessage();
        }
    }
}