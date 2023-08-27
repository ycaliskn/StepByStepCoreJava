package day14StaticKeywordEncapsulation;

public class Practice {
    int i=10;
    static int k=15;

    public static void main(String[] args) {
        Practice p1=new Practice();
        Practice p2=new Practice();

        p1.i=18;
        p1.k=23;
        System.out.println("p1.k : "+ p1.k);
        System.out.println("p2.k : "+ p2.k);

        System.out.println("------------------");

        System.out.println("p1.i : "+ p1.i);
        System.out.println("p2.i : "+ p2.i);

    }

}
