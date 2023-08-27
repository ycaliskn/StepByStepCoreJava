package day11passByValue;

import day12AccessModifier.Hayvanlar;
import day12AccessModifier.Kediler;

public class AnimalsRunner extends Hayvanlar {

    public static void main(String[] args) {
        Kediler cats1=new Kediler();
        Aslanlar lions=new Aslanlar();
        lions.drink();
        lions.kukremek();
        Hayvanlar deneme1=new Hayvanlar();
        deneme1.drink();

    }
}
