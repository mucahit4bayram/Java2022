package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Kullanýcýdan tam sayýlar alýn.
        Kullanýcý çift sayý girdiði müddetçe sayýlarý yazdýrýn.
        Tek sayý girdiðinde iþlemi bitirin.
         */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        // while ile yaparsak
        /*
        Loop'larda kullanacaðýmýz variable'larý loop'tan önce oluþturmalýyýz.
        while loop'da, loop'dan önce oluþturduðumuz bu variable'a atayacaðýmýz deðeri iyi düþünmemiz gerekiyor.
         */

        while (sayi % 2 == 0) {

            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift : " + sayi);
            } else {
                System.out.println("Girilen sayi tek, benden bu kadar");
            }

        }
        // do while loop ile yapalým;
        // do while loop'da önceden oluþturulan variable'a hangi deðer atandýðýnýn hiçnbir önemi yok,
        // kodumuz her durumda çalýþýr.
        /*
        do-while'in dezavantajý;
        ilk çalýþtýrma kontrol yapýlmadan olduðu için loop'un body'sinde yanlýþ bir iþlem yapýlmamasýna
        dikkat etmek gerekir.
         */
        do {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift : " + sayi);
            } else {
                System.out.println("Girilen sayi tek, benden bu kadar");
            }

        } while (sayi % 2 == 0);
    }
}
