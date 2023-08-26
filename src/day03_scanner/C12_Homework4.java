package day03_scanner;

import java.util.Scanner;

public class C12_Homework4 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenler prizmasının uzun, kısa kenarlarını ve yüksekliğini isteyip
        prizmanın hacmini hesaplayıp yazdırın
         */
        /*
         Dikdörtgen prizmasının taban alanını : kısa kenar (a) * uzun kenar (b) * yükseklik (c)
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini giriniz");
        int a = scan.nextInt();
        int b= scan.nextInt();
        int c = scan.nextInt();

        int v = a*b*c;

        System.out.println("Dikdortgenler prizmasinin hacmi " +v);

    }
}
