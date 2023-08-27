package day13InheritancePolymorphism;

public class Turkey extends Avrupa{


    public Turkey(){
        super();
        System.out.println("Turkiye");

    }

    long nufus = 83000000L;
    public void konusmak(){
        System.out.println("Turkce konusulur");
    }


}
