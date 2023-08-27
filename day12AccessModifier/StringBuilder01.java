package day12AccessModifier;

public class StringBuilder01 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 63; i++) {
            sb.append('a');
            System.out.println(sb.capacity());
        }

        Bolgeler secilen=Bolgeler.IcAnadolu;

        /*
         "Akdeniz"  turizm
"Karadeniz"  çay,
 "İç Anadolu"  bugday,
 "Doğu Anadolu"  hayvancılık,
 "Güneydoğu Anadolu"  tarih turizmi


         */



        switch (secilen){

            case Ege:
                System.out.println("zeytinyağı");
                break;
            case Marmara:
                System.out.println("sanayi");
                break;
            case Karadeniz:
                System.out.println("cay");
                break;
            case Akdeniz:
                System.out.println("turizm");
                break;
            case IcAnadolu:
                System.out.println("bugday");
                break;
            case DoguAnadolu:
                System.out.println("hayvamcılık");
                break;
            case GuneydoguAnadolu:
                System.out.println("tarih turizm");
                break;

            default:
                System.out.println("Gecerli değil");
        }


        // 1. Yol :
        StringBuilder cumle1strb=new StringBuilder("Java");
        System.out.println(cumle1strb);

        // 2. Yol :
        StringBuilder cumle2strb=new StringBuilder();
        System.out.println(cumle2strb); //

        cumle2strb.append("Ders");
        System.out.println(cumle2strb);


        cumle2strb.append(" çalışmadan").append(" başarı olmaz");
        System.out.println(cumle2strb);


        StringBuilder cumle3strb=new StringBuilder("");
        System.out.println("cumle3strb bosken: "+cumle3strb.capacity());

        cumle3strb.append("Java");
        int numofchar=cumle3strb.length();
        System.out.println(numofchar);  //4

        System.out.println(cumle3strb.capacity());

        cumle3strb.append("xxxxxxxxxxxxx");
        System.out.println(cumle3strb.capacity());

//        cumle3strb.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println(cumle3strb.capacity());

        cumle3strb.setCharAt(0,'r');
        System.out.println(cumle3strb);

        cumle3strb.delete(4,17);
        System.out.println(cumle3strb);    //rava


        cumle3strb.deleteCharAt(1);
        System.out.println(cumle3strb);     //rva

        System.out.println(cumle3strb.capacity());

        cumle3strb.reverse();
        System.out.println(cumle3strb);     //arv

        String name="Hasan";

        System.out.println(name.toLowerCase());

        System.out.println("name : "+name);


        cumle3strb.insert(1,"kk");
        System.out.println(cumle3strb);         //akkrv

        cumle3strb.insert(3,"ABCDEFGHI", 2,5);
        //==>3.character'den sonra "ABCDEFGHI" String'inin index 2, 3, 4 deki charcaterlerini yerlestirir.

        System.out.println(cumle3strb);     //akkCDEvr


        String cumle1=cumle3strb.toString();
        System.out.println(cumle1);

        String name1="Kamil";

        StringBuilder name1StrB=new StringBuilder(name1);
        System.out.println(name1StrB);


        StringBuilder user1=new StringBuilder("girisdeneme");
        StringBuilder user2=new StringBuilder("Girisdeneme");

        System.out.println(user1.compareTo(user2));

        StringBuilder user3=new StringBuilder("Hirisdeneme");
        System.out.println(user2.compareTo(user3));         //-1


    }
}

