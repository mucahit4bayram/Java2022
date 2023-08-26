package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        while loop'da önce kontrol edip sonra iþlem yaptýðýmýz için iþlem bittikten sonra loop'un kýrýlmasý için
        bir kez daha baþa dönmemiz gerekiyor. Bu durumda fazladan bir iþlem yapýlýyor.
         */

        int sayi =7;
        while (sayi<10){
            System.out.print(sayi);

            sayi++;

        }
        /*
        do-while loop ile çalýþtýðýmýzda bu dezavantaj ortadan kalkar.
         */
        System.out.println();

        sayi =7;
        do {
            System.out.print(sayi);

            sayi++;
        }while (sayi<10);

        /*
        *** While Loop, dongunun baþlangýcýnda kosulu kontrol eder ve kosul saglanirsa body icindeki kodlari calistirir.

        *** Do-while loop’ta ise , kosul body icerisindeki kodlar 1 kere calistiktan sonra kontrol edilir.

        *** Bir while loop’daki kosul yanlýssa, loop hic calismaz
        *** ‘do-wile' loop’ta ise , kosul yanlissa kodlar 1 kere calisir
         */
    }
}
