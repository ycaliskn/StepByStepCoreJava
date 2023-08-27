package day16Abstraction;

public class Yaris implements Motor, Kaporta, Ac{

    @Override
    public void digital() {
        System.out.println("Yaris Ac digitaldir");
    }

    @Override
    public void klima() {
        System.out.println("Yaris digitaldir");
    }

    @Override
    public void celik() {
        System.out.println("Yaris  celiktir");
    }



    @Override
    public void eco() {
        System.out.println("Yaris eco motoru vardır");
    }

    @Override
    public void tsi() {
        System.out.println("Yaris tsi vardır");
    }

}
