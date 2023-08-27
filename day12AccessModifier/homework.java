package day12AccessModifier;

public class homework {

    public static void main(String[] args) {
        /*
        For loop ile 1000 defa bir islem yapalim.
        ("1" yazan bir String olusturun ve sonuna " " boşluk atayın 1000 defa)
        ("1" yazan bir StringBuilder olusturun ve sonuna " " boşluk atayın 1000 defa)

		// Oncesinde ve sonrasinda zamani kontrol edip
		// StringBuilder ve String class’larinin performanslarini karsilastiralim.
		aradaki zaman farkına göre hangisi yavaş ise ekrana onu yazdıralım

		// Ipucu:  long TimeSb = System.nanoTime();  kullanalim
         */
        long time1 = System.nanoTime();
        String name="1";
        for (int i=0; i<1000; i++){
            name=name.concat(" ");
        }
        System.out.println(name);
        long time2 = System.nanoTime();

        StringBuilder nameStrd=new StringBuilder("1");
        for (int i=0; i<1000; i++){
            nameStrd.append(" ");
        }
        System.out.println(nameStrd);
        long time3 = System.nanoTime();

        if((time3-time2)>(time2-time1)){
            System.out.println("StringBuilder daha yavaş");
        } else if ((time2-time1)>(time3-time2)) {
            System.out.println("String daha yavaş");

        }

        //  SORU 2
        // Kullanıcıdan bir kelime alın ve aldığı kelimeyi tersten yazdıran iki ayrı method olusturun(yöntemleri farklı olsun)
        // eger tersi düzü ile aynı ise ekrana "Girdiginiz kelime polidron yazdırın"



        //Soru 3
        /*
        Meb.CLASS
                --> yapmak() method ==>  Güzel bir toplum icin kaliteli bir eiğitim saglar
                --> protected int ogretmenSayisi=20000;
                --> public int ogrenciSayisi=20000;
                --> default int Personel=1200000;

        Okul.Class
                --> gelmek() methodu ==>  ekrana "Herkes okula gelir"
                --> gitmek() methodu ==>  ekrana "Herkes aksam okuldan gider."
                --> int kitap=505;

         Ogrenci Class
                --> yapmak() methodu ==> ekrana "Ogrenciler ders dinler"
                --> int ogrenciSayisi =100;
                --> default int kitap=5;

         Ogretmen Class
                --> yapmak () method ==> Ekrana "Ogretmenler eğitim verir"
                --> int ogretmenSayisi = 5;
                --> maas ()methodu ==> Ekrana "Maasınız .... odemesi yapıldı" (class a ozel)

            OdevRunner.Class

                //Ogrenci.class'ından obje olustur. Tum method ve variableları yazdır
                //Ogretmen.Class'ından obje oustur. Tum method ve variableları yazdır
                //Okul.Class'ından obje olusturun.  Tum method ve variableları yazdır
                //Meb.Class'ından obje olusturun.  Tum method ve variableları yazdır

                Meb denemeOgretmen1=new Okul();
                objesi ile tum method ve variableri yazdir.

                Ogrenci denemeOgrenci1=new Okul();
                objesi ile tum method ve variableri yazdir.

                farkli bir package da EgitimSistemiRunner. class i olsutup
                //Meb.Class'ından obje olusturun.  Tum method ve variableları yazdır



         */
    }
}
