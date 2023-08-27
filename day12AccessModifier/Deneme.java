package day12AccessModifier;

import Homework.Meb;

public class Deneme {
    public static void main(String[] args) {
        StringBuilder cumle1strb=new StringBuilder("Java");
        System.out.println(cumle1strb);
        // 2. Yol :
        StringBuilder cumle2strb=new StringBuilder();
        System.out.println(cumle2strb); //
        cumle2strb.append("Ders");
        System.out.println(cumle2strb);
        cumle2strb.append(" çalışmadan").append(" başarı olmaz");
        System.out.println("---"+cumle2strb.capacity());
        System.out.println(cumle2strb);
        StringBuilder cumle3strb=new StringBuilder("");
        System.out.println("--"+cumle3strb.capacity());
        cumle3strb.append("java");
        System.out.println("--"+cumle3strb.capacity());
        int numofchar=cumle3strb.length();
        System.out.println(cumle3strb.capacity());
        cumle3strb.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("--"+cumle3strb.capacity());


        Meb deneme1=new Meb();
        System.out.println(deneme1.ogrenciSayisi);

    }
}


