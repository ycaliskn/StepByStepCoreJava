package day13InheritancePolymorphism;


public class Renault extends Araba{
    String color;
    public Renault(){
        super("Gri", 80000);
        System.out.println("Reanult Constructer1");

    }

    public Renault(String arabaRengi){
        this.color = arabaRengi;
        System.out.println("Reanult Constructer2");
    }

}
