package day11passByValue;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
        LocalDate anlikTarih= LocalDate.now();

        System.out.println(anlikTarih);             //2023-07-14

        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);

        LocalTime anliktZamanJaponya=LocalTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(anliktZamanJaponya);

        LocalTime anliktZamanIstanbul=LocalTime.now(ZoneId.of("Asia/Istanbul"));

        System.out.println(anliktZamanIstanbul);

        LocalDateTime currenDateTime = LocalDateTime.now();

        System.out.println(currenDateTime);
        //2023-07-14T22:43:02.827999300


        LocalDateTime currenDateTimeJaponya= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(currenDateTimeJaponya);
        //2023-07-15T04:43:02.827999300

        //Ornek : bugunden 580 gun sonra emekli olacagınıza göre emeklilik tarihinizi bulun.

        LocalDate emeklilikReferansTarihi=LocalDate.of(2023,7,14);
        LocalDate emeklilikTarihi=emeklilikReferansTarihi.plusDays(580);
        System.out.println("emeklilikTarihi : " + emeklilikTarihi);


        //iki cocugunuz doğum tarihleri arasındaki farkı gun olrak hesaplayan kodu veriniz.

        LocalDate dogumAhmet=LocalDate.of(2000,12,17);
        LocalDate dogumHasan=LocalDate.of(2008,5,27);

        Long yasFarki=ChronoUnit.DAYS.between(dogumAhmet,dogumHasan);
        System.out.println(yasFarki);

        LocalDate fetihIstanbul=LocalDate.of(1453,5,29);
        LocalDate kurulusCumhuriyet=LocalDate.of(1923,10,29);

       Long fark= ChronoUnit.MONTHS.between(fetihIstanbul,kurulusCumhuriyet);
        System.out.println(fark);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(anlikTarih);             //2023-07-14

        String anliktarih1=dtf1.format(anlikTarih);
        System.out.println(anliktarih1);        //07/14/2023

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String anliktarih2=dtf2.format(anlikTarih);
        System.out.println(anliktarih2);

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
        String anliktarih3=dtf3.format(anlikTarih);
        System.out.println(anliktarih3);

        System.out.println("---------------------------------------------------");
        System.out.println(currentTime);
        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("HH:mm");
        String anlikZaman1=dtf4.format(currentTime);
        System.out.println(anlikZaman1);

        System.out.println(currentTime);
        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("hh:mm:ss");
        String anlikZaman5=dtf5.format(currentTime);
        System.out.println(anlikZaman5);

        System.out.println(currentTime);
        DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("hh:mm a");
        String anlikZaman6=dtf6.format(currentTime);
        System.out.println(anlikZaman6);


    }
}
