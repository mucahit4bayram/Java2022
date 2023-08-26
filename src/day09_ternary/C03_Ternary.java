package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayı isteyin.
        // sayı pozitif ise sayıyı yazdırın.
        // sayı sıfır veya negatif ise bir sayı daha isteyin ve ikisinin çarpımını yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        if (sayi>0) {
            System.out.println(sayi);
        }else {
            System.out.println("Lutfen bir sayi daha giriniz");
            double sayi2 = scan.nextDouble();
            System.out.println((sayi*sayi2));
        }

        /*
        Eğer if else içerisinde yeni kodlar varsa ternary ile yapmamız mümkün olmaz..
        Ternary içine koda yazılamaz (yeniden sayı alalım, yeni kod almak, yeni bir işlem yapmak olmaz.)
        ya direk sonuç (tek yada çift sayı, emekli olabilirsin/olmazsın.. gibi)
        yada daha önce alınan değerlere bağlı işlemleri yapabiliriz.

         */
    }
}
