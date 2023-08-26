package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
                                        // (bu method çalýþýrken throws FileNotFoundException fýrlatabilir.)
        /*
        Java'dan bilgisayarýmýzdaki bir dosyaya eriþmek istiyorsak
        FileInputStream Class'ýndan yardým alýrýz.
        Ayný þekilde Java'dan bilgisayarýmýzdaki bir dosyaya ekleme veya update yapmak istersek
        FileOutputStream Class'ýndan yardým alýrýz.
         */

        FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");
    // *** // okumasýný istediðimiz dosya yolunu girmeliyiz.
    // *** // test.txt ==> sað klik ==> Copy Path/Reference ==> Path From Content Root ==> yukarýya "" içine yapýþtýrýyoruz.

        /*
        görüldüðü gibi compile time'da altýný kýrmýzý çizen her durum Compile Time Error deðildir.
        Java'da bazi Exception'lar da Compile Time Exception'dir.
        Özellikle dosya okuma ve yazma ile ilgili exception'lar Compile Time Exception'dir.

        Compile Time Exception oluþtuðunda Java çözüm için 2 ihtimal önerir.
        1- try-catch ile çevrelemek
        2- method signature'ina throws keyword ile beklenen exception türünü yazmak

        throws Exception, sadece olayýn farkýnda olduðumuzun deklerasyonudur. Exception'in handle edilmesinde
        hiçbir rolü yoktur.
        Yani try-catch ile kontrol altina aldigimiz (handle) exceptionlarda kod calismaya devam ediyordu.
        Ancak throws exception yazdigimizda java bir exception ile karsilasirsa yine hicbir sey yapmamisiz gibi
        hata mesaji yayinlayip calismayi durdurur.
        */
    }
}
