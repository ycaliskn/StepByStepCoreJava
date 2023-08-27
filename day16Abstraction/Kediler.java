package day16Abstraction;

public class Kediler extends Memeliler{
    @Override
    public void eat() {
        System.out.println("Kediler yer");
    }
    @Override
    protected void hareket() {
        System.out.println("Kediler hareket eder");
    }
}
