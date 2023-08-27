package day11passByValue;

public class PassByValue01 {
    public static void main(String[] args) {

    int price=100;

    change(price);                   //   300

        System.out.println(price);   //   100

        System.out.println(sale(price)); //90

        System.out.println("price : "+ price);

        int yemek=1000;

        int ogrenciYemek=saleOgrenci(yemek);

        System.out.println(ogrenciYemek);       //900

        int personelYemek= salePersonel(yemek);

        System.out.println(personelYemek);          //800

        System.out.println("Yemek : " +yemek);      //Yemek : 1000

        int e = 40;
        int f = e--;

        System.out.println("f : "+ f); //40
        System.out.println("e : " +e); //39

        int sonuc=toplamIslemi(8,10);
        System.out.println("5+9 : "+toplamIslemi(5, 6));
        System.out.println("8+5 : " +sonuc);



    }

    public static void change(int a){
        System.out.println(a*3);
    }

    public static int sale(int a){
        return a*9/10;
    }
    public static int saleOgrenci(int x){
        return x*9/10;
    }
    public static int salePersonel(int y){
        return y*8/10;
    }

    public static int toplamIslemi(int a, int b){
        return a+b;
    }
    public static int ucSayiToplamaYap(int a, int b, int c){
        return a+b+c;

    }
    public static int dortSayiToplamaYap(int a, int b, int c, int d){
        return a+b+c+d;

    }

    public static int sonsuzSayiToplami(int ...eleman){
        int toplam=0;
        for(int w : eleman){
            toplam=toplam+w;
        }
        return toplam;
    }

    public static int sonsuzIslem(int ...eleman){
        int toplam=0;
        for(int w : eleman){
            toplam=toplam+w;
        }
        return toplam;
    }

    public static long sonusCarpma(int... k) {//{(5, 2, 4, 3)
        int carpim=1;
        for(int w : k){
            carpim=carpim*w;

        }

        return carpim;
    }

}
