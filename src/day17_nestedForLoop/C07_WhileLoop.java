package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {

                         //-/-/   While Loop  (iken, oldugu surece)  /-/-/-/
        /*
        *** Döngünün baþlangýcýnda koþulu kontrol eder ve koþul saðlanýrsa body içindeki kodlarý çalýþtýrýr.

        *** While loop'daki koþul yanlýþsa, loop hiç çalýþmaz.

        *** Baþlangýç deðeri, bitiþ þartý, artýþ/azalýþ mutlaka olmalý.

        Baþlangýç deðeri ve artýþ miktarýný mutlaka eklemeliyiz. Artýþ yada azalýþ miktarýný eklemezsek
        sonsuz döngüye girer.

        condition (koþul) true oldukça kod çalýþýyor ve baþa dönüyor durumu tekrar kontro ediyor.
        condition (koþul) fals olduðunda döngüyü kýrýp alt satýra geçiyor.
         */

        // 20'den 50'ye kadar (sýnýrlar dahil) çift sayýlarý yazdýralým.

        // for loop ile yapalým

        int bas = 20;
        int bitis = 50;

        for (int i = bas; i <=bitis ; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }

        }
        System.out.println("");

        // while loop ile yapalým

        int temp = bas;
        while (temp<=bitis){

            if (temp%2==0){
                System.out.print(temp + " ");
            }
            temp ++;    //-/-/ !!! ARTIÞ MÝKTARINI EKLEMEMÝZ ÖNEMLÝ !!! /-/-/

        }
    }
}
