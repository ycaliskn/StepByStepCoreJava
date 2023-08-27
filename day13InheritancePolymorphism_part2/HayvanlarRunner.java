package day13InheritancePolymorphism_part2;

public class HayvanlarRunner {
    public static void main(String[] args) {
        Kediler cat1=new Kediler();
        cat1.eat();

        Kuslar kus1=new Kuslar();
        kus1.eat();

        Hayvanlar k1=new Kediler();
        k1.eat();

    }
}
