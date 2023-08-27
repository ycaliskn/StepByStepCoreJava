package day12AccessModifier;

public class Kediler extends Hayvanlar {

    public void miyav(){
        System.out.println("Kediler miyavlar");
    }
    public int sayi=50;
    protected void eat(){
        System.out.println("Kediler yemek yer");
    }

}
