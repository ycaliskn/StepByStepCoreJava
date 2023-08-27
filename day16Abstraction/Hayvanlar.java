package day16Abstraction;

public abstract class Hayvanlar {
    public void drink(){
        System.out.println("Hayvanalr içer.");
    }

    public abstract void eat();

    protected abstract void hareket();

}
