package day13InheritancePolymorphism_part2;

public class Kediler extends Memeliler{

    @Override
    public void eat() {

        System.out.println("Kediler yemek yerler");
    }



    @Override
    public Integer population() {
        return 1000;
    }

    @Override
    public Memeliler create1() {
        return new Memeliler();
    }

    public void miyav(){
        System.out.println("Kediler miyavlar");




    }
}
