package day03_scanner;

import java.util.Scanner;

public class C14_Homework6 {
    public static void main(String[] args) {

        // Kullanıcıdan ismini ve soyismini alip aralarında bir boşluk oluşturarak aşağıdaki şekilde yazdırın
        // İsim - soyisim : Mehmet Bulutöz

        Scanner scan = new Scanner(System.in);

        /*

        next() işlevini kullanmak yalnızca boşluktan önce gelenleri döndürür.
        nextLine(), geçerli satırı döndürdükten sonra tarayıcıyı otomatik olarak aşağı kaydırır.

         */

        System.out.println("Lutfen Isminizi Giriniz");
        String isim = scan.next();
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1);

        System.out.println("Lutfen Soyisminizi Giriniz");
        String soyisim = scan.next();
        soyisim = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1);

        System.out.println("Isim - soyisim : " + isim + " " + soyisim);

        /*
        SubString metodu alacağı parametrelere göre string dizisinin istenilen kadarlık kısmını ekrana yazar.
        Integer tipinde parametre alır
         */

        String str1 = "Günes her varligin uzerine dogar lakin, "
                + "gul baska kokar les baska";

        /* Kesit aldığımız String'i koyacağımız String değişken */
        String str2 = "";

        str2 += "40. karaterden itibaren ekrana yaz:\n" + str1.substring(40);
        str2 += "\n\n6. karakterden itibaren 32 karakter ekrana yaz:\n"
                + str1.substring(6, 39);

        System.out.println("str2 = " + str2);   // 40. karaterden itibaren ekrana yaz:
                                                // gul baska kokar les baska
                                                // 6. karakterden itibaren 32 karakter ekrana yaz:
                                                // her varligin uzerine dogar lakin



    }
}
