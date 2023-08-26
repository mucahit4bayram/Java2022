package day03_scanner;

import java.util.Scanner;

public class C09_Homework1 {
    public static void main(String[] args) {

        // kullanıcıdan iki tam sayı alıp bu sayıların toplam, fark ve çarpımlarını yazdırın..

        Scanner scan = new Scanner(System.in); //Scanner objesini oluşturduk

        System.out.println("Lutfen iki tam sayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int toplam = sayi1 + sayi2;
        int fark = sayi2 - sayi1;
        int carpim= sayi1*sayi2;


        System.out.println("Girilen Sayilarin Toplami :" + toplam);
        System.out.println("Girilen Sayilarin Farki :" + fark);
        System.out.println("Girilen Sayilarin Carpimi :" + carpim);




    }
}
