package day16Abstraction;

public class Kuslar extends Hayvanlar{

    @Override
    public void eat() {
        System.out.println("Kuslar yer.");
    }
    protected void hareket() {
        System.out.println("Kuslar hareket eder");
    }
}
