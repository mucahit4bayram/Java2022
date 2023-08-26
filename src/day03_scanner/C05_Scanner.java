package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        /* kullanıcıdan iki sayı alıp bu sayıların çarpımını yazdırın

         */

        // 1. adım
        Scanner scan=new Scanner(System.in);

        // 2. adım bilgi vermek
        System.out.println("Lutfen ilk sayiyi giriniz");

        // 3. adım
        double sayi1= scan.nextDouble();

        /*
        double değer istenirse ----> double sayi1=scan.nextDouble();
                double sayi1=scan.nextDouble(); ))
        int    değer istenirse ----> int sayi1=scan.nextint();
                int sayi1=scan.nextInt();

        String değer istenirse ----> String sayi1=scan.next(); yada nextLine();
                String harf=scan.next();
                String harf=scan.nextLine();
         */

        // 2. sayı için 2. ve 3. adımları tekrarlarız
        System.out.println("Lutfen 2. sayiyi giriniz");
        double sayi2= scan.nextDouble();

        System.out.println("Girilen sayilarin carpimi : " +sayi1*sayi2);





    }
}
