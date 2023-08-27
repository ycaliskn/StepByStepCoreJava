package day13InheritancePolymorphism;

public class Araba extends Vasita{


    String color;
    int km;

    public Araba(){
        System.out.println("Araba Constructer1");
    }


    public Araba(String renk, int km){
        super("araba");
        this.color = renk;
        this.km = km;
        System.out.println("Araba Constructer2");

    }
}