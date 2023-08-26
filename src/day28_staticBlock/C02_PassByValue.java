package day27_staticKeyword.day28_staticBlock;

public class C02_PassByValue {

    public static void main(String[] args) {

        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati)); // 90

        System.out.println(satisFiyati); // 100

        System.out.println(indirimliFiyat(satisFiyati)); // 90

        // iki farkli method'da satisFiyati isminde variable olabilir
        // Java buna itiraz etmez cunku, scope'lari farklidir.
    }
    public static double indirimliFiyat(double orjinalFiyat){

        // methodumuz %10 indirim yapip
        // yeni fiyati main method'a dondursun

        double satisFiyati=orjinalFiyat*0.9 ;


        return satisFiyati;

       /*
    java da program yaparken genelde main methodda kulland���m�z variable ismi ne ise kodu rahat takip edebilmek icin
    constructor da da method da da ayn� ismi kullanmay� tercih ederiz
    yani burada satisFiyati ismini kullandiysam, asa��da da satisFiyati ismini kullanmayi tercih ederiz
    ama scope diye bir konu g�rd�k herkesin variable � kendine dedik
    yukar�daki satisFiyatini yeni bir variable olusturmadan asa��da kullanamayiz.
    bir tane main methodun scope u var local scope 1 diyelim
    bir tane de method scope u var local scope2 diyelim
    biz program� cal�st�r�rken s�rekli scope lar aras�nda hareket ederezi,
    neden cunku main methodlar bizim robotlar�m�zd� s�rekli bizim ad�m�za baz� islemleri yaparlard�.
    100 tl ye yapt���n�z indirimde birinci m�steri 90 a ikinci 80 a 3. 70 e al�rsa olmaz
    benim her m�steri icin indirimli fiyatim 90 d�r
    yani ilk scope taki sat�s fiyati ikinci scope icin gecerli de�ildir.
    ayni scope ta ayn� isimde iki variable olusturulamaz
    data t�r� farkl� olsa bile ayn� isimde iki variable olusturulamaz
    farkl� scopelarda olusturulabilir.
         */

    }
}
