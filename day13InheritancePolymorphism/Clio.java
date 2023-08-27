package day13InheritancePolymorphism;

public class Clio {
    int price;
    int year;

    public Clio() {
        System.out.println("Clio Constructer1");

    }

    public Clio(int price) {
        this.price = price;
        System.out.println("Clio Constructer2");
    }

    public Clio(int price, int year) {
        super();
        this.price = price;
        this.year = year;
        System.out.println("Clio Constructer3");

    }
}