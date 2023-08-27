package day16Abstraction;

public class Corolla implements Ac,Kaporta,Motor{


    @Override
    public void digital() {
        System.out.println("Corolla Ac digitaldir");
    }

    @Override
    public void klima() {
        System.out.println("Corolla klimasi digitaldir");
    }

    @Override
    public void celik() {
        System.out.println("Corolla kaprtasi celiktir");
    }



    @Override
    public void eco() {
        System.out.println("Corolla eco motoru vardır");
    }

    @Override
    public void tsi() {
        System.out.println("Corolla tsi motoru vardır");
    }


}
