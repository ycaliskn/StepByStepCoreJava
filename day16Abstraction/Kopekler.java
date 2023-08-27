package day16Abstraction;

public class Kopekler extends Memeliler{

    @Override
    public void eat() {
        System.out.println("Kopekler yer");
    }

    @Override
    protected void hareket() {
        System.out.println("Kopekler hareket eder");
    }
}
