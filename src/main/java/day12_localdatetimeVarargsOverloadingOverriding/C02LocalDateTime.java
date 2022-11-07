package day12_localdatetimeVarargsOverloadingOverriding;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class C02LocalDateTime {
    public static void main(String[] args) {
        /* Tom 29 Ekim 1923 tarihinden 45 yil 8 ay 5 gun sonra dogdu.
      Veli 15 Eylul 1993 tarihinden 24 yil 2 ay 11 gun sonra dogdu.
      Tom ve Veli'nin dogum tarihini hesaplayan kodu yazıniz.
      Tom ve Veli'nin dogum tarihlerinin aynı olup olmadığını kontrol eden kodu yazıniz.
 */

        LocalDate dogTom = LocalDate.of(1923,10,29)
                .plusYears(45)
                .plusMonths(8)
                .plusDays(5);

        System.out.println(dogTom);

        LocalDate dogVeli=LocalDate.of(1993,9,15)
                .plusYears(24)
                .plusMonths(2)
                .plusDays(11);

        System.out.println(dogVeli);

        boolean ayniMi=dogTom.equals(dogVeli);
        System.out.println(ayniMi);


        //Example : 2 saat dilimi arasindaki saat dilimini hesaplama
        //Japan ile Germany arasinda saat farkini hesaplayan kodu yaziniz

        LocalDateTime farkJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo")) ;
        LocalDateTime farkGermany = LocalDateTime.now(ZoneId.of("Europe/Berlin")) ;

        long fark = ChronoUnit.HOURS.between(farkJapan,farkGermany);
        System.out.println(fark);

        //Ex: Tarih 2022-10-31 ve saat 03:26:00pm.oldugunda asagidaki kod ne yazdirir?

        LocalTime time = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dtf.format(time.plusHours(2)));


        LocalTime time2 = LocalTime.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf2.format(time.minusHours(1)));
    }
}
