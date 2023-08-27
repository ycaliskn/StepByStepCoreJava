package day13InheritancePolymorphism_part2;

public class Memeliler extends Hayvanlar {
    @Override
    Kediler creat() {
        return new Kediler();
    }




    public void sutIleBeslenmek() {
        System.out.println("Süt ile beslenirler");



    }
}