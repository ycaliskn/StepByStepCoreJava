package day18Collection;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {


        HashSet<Integer> hastaKayit= new HashSet<>();

        hastaKayit.add(12202211);               //2022
        System.out.println(hastaKayit);
        hastaKayit.add(12202313);               //2023
        hastaKayit.add(12202105);               //2021
        hastaKayit.add(12202401);               //2024
        System.out.println(hastaKayit);

        hastaKayit.add(12202105);
        System.out.println(hastaKayit);

       hastaKayit.add(null);
        System.out.println(hastaKayit);


        HashSet<String> depokayit= new HashSet<>();

        depokayit.add("elma");
        depokayit.add("Armut");
        depokayit.add("süt");
        depokayit.add(null);
        System.out.println(depokayit);


        HashSet<String> depokayit1= new HashSet<>();

        depokayit1.add("elma");
        depokayit1.add("Armut");
        depokayit1.add("süt");
        depokayit1.add(null);
        System.out.println(depokayit);

        /*

         */

    }
}
