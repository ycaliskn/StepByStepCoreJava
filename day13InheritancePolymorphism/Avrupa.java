package day13InheritancePolymorphism;

public class Avrupa extends Dunya{

    public Avrupa(){
        super();
        System.out.println("Avrupa");
    }
    long nufus = 764000000L;
    public void konusmak(){
        System.out.println("En cok Almanca konusulur");
    }
    public void uretim(){
        System.out.println("sanayi üretimi gelişmiştir");
    }
}
