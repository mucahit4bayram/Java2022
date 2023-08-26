package day31_timeFormatter_varrags;

public class C06_StringBuilder_Not {
    public static void main(String[] args) {


    }
}
    /*
                                    String Builder

    * StringBuilder “ mutable ” yani deðiþtirilebilir S tring elde etmemize olanak tanýr.

    * Böylece hafýzada her seferinde yeni bir alan açýlmadan var olan alan üzerinde deðiþiklik
    yapýlabilir. Bu da StringBuilder sýnýfýný hafýza kullanýmý olarak String sýnýfýnýn önüne geçirir.

    * StringBuilder thread safe deðildir. Yani synchronized deðildir. Thread’li bir iþlem kullanýlacaksa
    StringBuilder kullanýlmasý güvenli deðildir.

    * Not: StringBuffer, StringBuilder’a benzer. StringBuilder, StringBuffer’dan hizlidir. Multi thread
           icin StringBuffer kullanilir.

                        String Builder

    1) StringBuilder sb1 = new StringBuilder() ===> Bos bir StringBuilder olusturur

    2) StringBuilder sb2 = new StringBuilder(" animal "); ===> Belli bir degeri olan StringBuilder olusturur

    3) StringBuilder sb3 = new StringBuilder(5); ===> Ilk uzunlugu tahmin edilen bir StringBuilder olusturur

    1) append( ); StringBuilder’a ekleme yapar

    2) length(); StringBuilder’in uzunlugunu verir

    3) capacity(); StringBuilder’un kapasitesini verir

    4) charAt(); StringBuilder’da istenen index’deki karakteri verir

    5) delete(4,7); StringBuilder’da istenen index’ler arasindaki karakterleri siler.

    6) deleteCharAt(7); StringBuilder’da istenen index’deki tek karakteri siler

    7) equals(); Iki StringBuilder’in degerlerinin karsilastirir.
        NOT 1: equals() method’unda parantez icine String yazarsak hata vermez ama false doner.
        NOT 2: equals() method’u == gibi calisir

    8) indexOf(); StringBuilder’da istenen karakterin index’ini verir.

    9) insert(3,"Java"); StringBuilder’da istenen indexden baslayarak istenen karakteri ekler.

    10) insert(3, 3,"Java ",1,2); StringBuilder’da istenen indexden baslayarak verilen String’in istenen parcasini ekler.

    11) replace(3, 8,"Ali"); StringBuilder’da istenen index’ler arasindaki bolumun yerine verilen String’i ekler.

    12) reverse( ); StringBuilder’i tersine cevirir.

    13) setCharAt(3, 'k'); StringBuilder’da istenen index’deki karakteri istedigimiz karakter yapar.

    14) subSequence(3,7); StringBuilder’da istenen indexler arasindaki karakterleri dondurur.

    15) toString( ); StringBuilder'i String'e çevirir.
        toString()’den sonra nokta koyup Stringmethod’lari kullanilabilir.

    16) trimToSize(); StringBuilder’in capacity ile length’ini esitler.

    17) compareTo(); 2 StringBuilder’in tum karakterlerinin esitligini kontrol eder. (0 ise esit)
     */

