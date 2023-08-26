package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {
        /*
        Java’da tarih ve zaman icin 3 Class vardir. Bunlardan kendimize uygun olani secip object olusturarak kullanabiliriz.

        1 ) Local Date
        LocalDate currentDate1 = LocalDate.now();

        2) Local Time
        LocalTime currentTime1 = LocalTime.now();

        3) Local Date Time
        LocalDateTime currentTime1 = LocalDateTime.now();
         */

        LocalDate tarih = LocalDate.now();
                        // bir obje oluþturacaðýmýz zaman new keyword'unu kullanýyorduk (Scanner scan = new Scanner) gibi.
                        // bazen new ile oluþturamayýz fakat bazý methodla oluþturabiliriz.(LocalDate.now();)

        System.out.println(tarih); // 2022-07-23

        System.out.println(tarih.getDayOfYear()); // 204         // yýlýn kaçýncý günü olduðunu gösteriyor.
        System.out.println(tarih.getDayOfWeek()); // SATURDAY    //
        System.out.println(tarih.getMonthValue()); // 7          //
        System.out.println(tarih.isLeapYear()); // false         // artýk yýl olup olmadýðýný gösteriyor


        LocalDate tarih2 = LocalDate.of(2001, 5, 15);
        System.out.println(tarih2); // 2001-05-15

        LocalDate tarih3 = LocalDate.of(1990, Month.JANUARY, 10);
        System.out.println(tarih3); // 1990-01-10

        System.out.println(tarih.plusDays(100)); // 2022-10-31   // 100 gün sonra hangi tarih olacak

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12)); // 2027-11-04
                                                                         // 5 yýl, 3 ay, 12 gün sonra hangi tarih olacak

        System.out.println(tarih.minusWeeks(20)); // 2022-03-05            // 20 hafta önce

        System.out.println(tarih.minusDays(100).minusMonths(5)); // 2021-11-14

        System.out.println(tarih.isAfter(tarih2)); // true

        // iki farkli dogum gunu girildiginde
        // hangisinde doganin daha buyuk oldugunu bulunuz
        // tarih2 ve tarih3 icin yapalim

        if (tarih2.isAfter(tarih3)) {
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else {
            System.out.println("iki tarih birbiri ile ayni");
        }
    }

}
