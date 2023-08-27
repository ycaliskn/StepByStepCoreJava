package day13InheritancePolymorphism;

public class DunyaRunner {
    public static void main(String[] args) {
        Turkey insan=new Turkey();
        insan.konusmak();
        System.out.println(insan.nufus);            //83000000

        Avrupa avrupali =new Turkey();
        avrupali.konusmak();                        //Turkce konusulur
        System.out.println(avrupali.nufus);         //764000000


        Dunya human=new Fransa();
        human.konusmak();                         //Fransızca konusulur
        System.out.println(human.nufus);            //80000000
    }
}
