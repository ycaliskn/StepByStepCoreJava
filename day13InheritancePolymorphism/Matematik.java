package day13InheritancePolymorphism;

public class Matematik extends Kurs{
    public Matematik(){
        super("ek ders");
        System.out.println("Kurs 1");
    }

    public Matematik(int a){

        this();
        System.out.println("Kurs 2");
    }

//    public Matematik(String str){
//
//        super("ek ders");
//        System.out.println("Kurs 3");
//    }
}
