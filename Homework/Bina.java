package Homework;

public class Bina extends Ilce{

    String type;
    int yas;
    Bina(){
        System.out.println("Bina Consractor 1");
    }
    Bina(String tip){
        System.out.println("Bina Consractor 2");
    }
    Bina(String tip, int yas){
        super(30000);
        System.out.println("Bina Consractor 3");
    }

}
