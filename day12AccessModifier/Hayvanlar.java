package day12AccessModifier;

public class Hayvanlar extends Varliklar{

    protected void eat(){
        System.out.println("Hayvanlar yemek yer");
    }
    public void drink(){
        System.out.println("Hayvanlar icecek içer");
    }
    public int sayi=50000;
}
