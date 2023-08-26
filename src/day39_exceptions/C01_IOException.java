package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
                                        // (bu method �al���rken throws FileNotFoundException f�rlatabilir.)
        /*
        Java'dan bilgisayar�m�zdaki bir dosyaya eri�mek istiyorsak
        FileInputStream Class'�ndan yard�m al�r�z.
        Ayn� �ekilde Java'dan bilgisayar�m�zdaki bir dosyaya ekleme veya update yapmak istersek
        FileOutputStream Class'�ndan yard�m al�r�z.
         */

        FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");
    // *** // okumas�n� istedi�imiz dosya yolunu girmeliyiz.
    // *** // test.txt ==> sa� klik ==> Copy Path/Reference ==> Path From Content Root ==> yukar�ya "" i�ine yap��t�r�yoruz.

        /*
        g�r�ld��� gibi compile time'da alt�n� k�rm�z� �izen her durum Compile Time Error de�ildir.
        Java'da bazi Exception'lar da Compile Time Exception'dir.
        �zellikle dosya okuma ve yazma ile ilgili exception'lar Compile Time Exception'dir.

        Compile Time Exception olu�tu�unda Java ��z�m i�in 2 ihtimal �nerir.
        1- try-catch ile �evrelemek
        2- method signature'ina throws keyword ile beklenen exception t�r�n� yazmak

        throws Exception, sadece olay�n fark�nda oldu�umuzun deklerasyonudur. Exception'in handle edilmesinde
        hi�bir rol� yoktur.
        Yani try-catch ile kontrol altina aldigimiz (handle) exceptionlarda kod calismaya devam ediyordu.
        Ancak throws exception yazdigimizda java bir exception ile karsilasirsa yine hicbir sey yapmamisiz gibi
        hata mesaji yayinlayip calismayi durdurur.
        */
    }
}
