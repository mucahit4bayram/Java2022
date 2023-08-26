package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatement {
    public static void main(String[] args) {

        /* kullanıcdan gün ismini alın ve haftaiçi veya hafta sonu olduğunu yazdırın.

        Örnek : gün = Pazar     output ="Hafta sonu"
                gün = Salı      output ="Hafta içi"
            *** string için equals method'unu kullanın
          */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun = scan.next().toLowerCase();
        // Pazar, pazar, PAZAR, PaZaR, PAzar ??? bilemeyiz,
        // pazar, pazar, pazar, pazar, pazar

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("Girilen gun HAFTASONU");
        }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
            || girilenGun.equals("casrsamba") || girilenGun.equals("persembe")
            || girilenGun.equals("cuma")){
            System.out.println("Girilen gun HAFTAICI");
        }
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma") || girilenGun.equals("cumartesi")
                || girilenGun.equals("pazar"))) {
            System.out.println("LUtfen gecerli bir gUn giriniz");
        }

    }
}
