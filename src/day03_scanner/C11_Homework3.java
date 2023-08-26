package day03_scanner;

import java.util.Scanner;

public class C11_Homework3 {
    public static void main(String[] args) {

        //Kullanıcıdan yarıçap isteyip çemberin çevresini ve dairenin alanını hesaplayip yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Yaricapini giriniz");
        double r = scan.nextDouble();
        double pi = 3.14;
        double cevre = 2 * pi * r;
        double alan = pi*r*r;
        System.out.println("Cemberin Cevresi :" + cevre);
        System.out.println("Dairenin Alani :" + alan);
    }
}
