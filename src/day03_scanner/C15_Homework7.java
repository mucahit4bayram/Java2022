package day03_scanner;

import java.util.Scanner;

public class C15_Homework7 {
    public static void main(String[] args) {
        // Kullanıcıdan ismini alıp isminin baş harfini yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String isim = scan.nextLine();

        isim = isim.toUpperCase(); //büyük harfe çevirdim

        System.out.println("Ismin Bas Harfi : " + isim.charAt(0));
        System.out.println("Ismin Bas Harfi = " + isim.substring(0,1));


    }
}
