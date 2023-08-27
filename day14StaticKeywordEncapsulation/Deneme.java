package day14StaticKeywordEncapsulation;

public class Deneme {

    int a;
    static int b;

    Deneme(int k){
        a+=k;
        b+=k;
    }

    public static void main(String[] args) {

        Deneme dnm1=new Deneme(3);

        System.out.println("a degeri : "+dnm1.a+", "+"b degeri : "+ dnm1.b);

        Deneme dnm2=new Deneme(4);
        System.out.println("a degeri : "+dnm2.a+", "+"b degeri : "+ dnm2.b);
        System.out.println("a degeri : "+dnm1.a+", "+"b degeri : "+ dnm1.b);



    }
}
