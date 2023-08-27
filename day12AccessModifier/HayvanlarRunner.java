package day12AccessModifier;

public class HayvanlarRunner {
    public static void main(String[] args) {
       Hayvanlar cat=new Kediler();
       // cat.miyav();
        System.out.println(cat.sayi);
        cat.eat();




        Kopekler dog=new Kopekler();
        dog.drink();
        dog.hav();

        Kuslar bird=new Kuslar();
        bird.ciklemek();
        bird.eat();
        bird.gorunmek();


        Hayvanlar animals=new Hayvanlar();
        System.out.println(animals.sayi);


    }
}
