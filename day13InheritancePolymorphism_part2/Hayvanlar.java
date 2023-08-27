package day13InheritancePolymorphism_part2;

public class Hayvanlar {
      protected void eat(){
        System.out.println("Hayvanlar yer");
    }


        public Integer population(){
          return 1000*10;
        }

        Hayvanlar creat(){
          return new Hayvanlar();
        }


        public Hayvanlar create1(){
          return new Hayvanlar();
        }

        public int toplamSayi(){
          return 5000;
        }

        private final int sayi2=100;

    public int getSayi2() {
        return sayi2;
    }
}
