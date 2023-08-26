package day03_scanner;

import java.util.Scanner;

public class C10_Homework2 {
    public static void main(String[] args) {

        // kullanıcıdan karenin bir kenar uzunluğunu alın ve karenin çevresini ve alanini hesaplayıp yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Karenin bir kenar uzunlugunu giriniz :");
        int sayi = scan.nextInt();
        int cevre = 4 * sayi;
        int alan = sayi * sayi;

        System.out.println("Karenin Cevresi :" + cevre);
        System.out.println("Karenin Alni :" + alan);


    }
}
