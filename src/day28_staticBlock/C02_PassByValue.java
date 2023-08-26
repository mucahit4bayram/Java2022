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
    java da program yaparken genelde main methodda kullandýðýmýz variable ismi ne ise kodu rahat takip edebilmek icin
    constructor da da method da da ayný ismi kullanmayý tercih ederiz
    yani burada satisFiyati ismini kullandiysam, asaðýda da satisFiyati ismini kullanmayi tercih ederiz
    ama scope diye bir konu gördük herkesin variable ý kendine dedik
    yukarýdaki satisFiyatini yeni bir variable olusturmadan asaðýda kullanamayiz.
    bir tane main methodun scope u var local scope 1 diyelim
    bir tane de method scope u var local scope2 diyelim
    biz programý calýstýrýrken sürekli scope lar arasýnda hareket ederezi,
    neden cunku main methodlar bizim robotlarýmýzdý sürekli bizim adýmýza bazý islemleri yaparlardý.
    100 tl ye yaptýðýnýz indirimde birinci müsteri 90 a ikinci 80 a 3. 70 e alýrsa olmaz
    benim her müsteri icin indirimli fiyatim 90 dýr
    yani ilk scope taki satýs fiyati ikinci scope icin gecerli deðildir.
    ayni scope ta ayný isimde iki variable olusturulamaz
    data türü farklý olsa bile ayný isimde iki variable olusturulamaz
    farklý scopelarda olusturulabilir.
         */

    }
}
