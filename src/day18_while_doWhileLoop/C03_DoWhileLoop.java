package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        while loop'da �nce kontrol edip sonra i�lem yapt���m�z i�in i�lem bittikten sonra loop'un k�r�lmas� i�in
        bir kez daha ba�a d�nmemiz gerekiyor. Bu durumda fazladan bir i�lem yap�l�yor.
         */

        int sayi =7;
        while (sayi<10){
            System.out.print(sayi);

            sayi++;

        }
        /*
        do-while loop ile �al��t���m�zda bu dezavantaj ortadan kalkar.
         */
        System.out.println();

        sayi =7;
        do {
            System.out.print(sayi);

            sayi++;
        }while (sayi<10);

        /*
        *** While Loop, dongunun ba�lang�c�nda kosulu kontrol eder ve kosul saglanirsa body icindeki kodlari calistirir.

        *** Do-while loop�ta ise , kosul body icerisindeki kodlar 1 kere calistiktan sonra kontrol edilir.

        *** Bir while loop�daki kosul yanl�ssa, loop hic calismaz
        *** �do-wile' loop�ta ise , kosul yanlissa kodlar 1 kere calisir
         */
    }
}
