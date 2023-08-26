package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Kullan�c�dan tam say�lar al�n.
        Kullan�c� �ift say� girdi�i m�ddet�e say�lar� yazd�r�n.
        Tek say� girdi�inde i�lemi bitirin.
         */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        // while ile yaparsak
        /*
        Loop'larda kullanaca��m�z variable'lar� loop'tan �nce olu�turmal�y�z.
        while loop'da, loop'dan �nce olu�turdu�umuz bu variable'a atayaca��m�z de�eri iyi d���nmemiz gerekiyor.
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
        // do while loop ile yapal�m;
        // do while loop'da �nceden olu�turulan variable'a hangi de�er atand���n�n hi�nbir �nemi yok,
        // kodumuz her durumda �al���r.
        /*
        do-while'in dezavantaj�;
        ilk �al��t�rma kontrol yap�lmadan oldu�u i�in loop'un body'sinde yanl�� bir i�lem yap�lmamas�na
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
