package day31_timeFormatter_varrags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : " + tarihSaat);
        // ilk olusturulan tarih : 2022-07-31T12:02:40.573996200

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy  hh:mm a");
        System.out.println(dtf1.format(tarihSaat)); // 31/7/22  12:02 ÖS

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy  HH:mm a");
        System.out.println(dtf2.format(tarihSaat)); // 31/Tem/2022  12:02 ÖS
    }
}

