package Homework;

public class Deney {

    static int sayac;
    int deneme;
        Deney(){
          deneme++;
    }
    Deney(String kelime){
            sayac++;
    }

    public static void main(String[] args) {
            Deney calisma1=new Deney();
            Deney calisma2=new Deney("aksam");
            Deney calisma3=new Deney("sabah");
            Deney calisma4=new Deney();

        System.out.println("calisma1.deneme : "+calisma1.deneme+" calisma1.sayac : "+calisma1.sayac);

        System.out.println("calisma3.deneme : "+calisma2.deneme +" calisma2.sayac : "+calisma2.sayac);

        System.out.println("calisma3.deneme : "+calisma3.deneme +" calisma3.sayac : "+calisma3.sayac);

        System.out.println("calisma4.deneme : "+calisma4.deneme +" sayac : "+Deney.sayac);

        sayac=15;

        Deney calisma5=new Deney("sabah");

        System.out.println("calisma5.deneme : "+calisma5.deneme +" sayac : "+Deney.sayac);




    }




    }

