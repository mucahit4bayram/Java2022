package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        /* kullanıcıdan ismini soy ismini ve yaşını alıp
        girilen bilgiler = Seyfi Çapar 34 şeklinde yazdırın

         */
        Scanner scan = new Scanner(System.in);  // elle yazıyoruz.  !!! EZBERLE !!!

        System.out.println("Lutfen isminizi giriniz");

        String isim=scan.nextLine();

        /*  /-/-/ !!! Ö N E M L İ !!! /-/-/

        String verileri scanner ile alınırken
        next (): ilk boşluğa kadar olan kısmı (1 kelime) alır
        nextLine () : satırın sonuna kadar ne yazarsak alır

        NOT : Eğer ardarda birden fazla String değer alacaksak nextLine() kullanmalıyız

         */

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim=scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        int yas=scan.nextInt();

        // girilen bilgiler = Seyfi Çapar 34 şeklinde yazdırın

        System.out.println("girilen bilgiler = "+isim+" "+soyisim+" "+yas);

    }
}
