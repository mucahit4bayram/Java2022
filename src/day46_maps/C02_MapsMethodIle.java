package day46_maps;

import java.util.List;
import java.util.Map;
public class C02_MapsMethodIle {
    public static void main(String[] args) {

        // *** C01 deki yaptýðýmýz iþlemleri metodlu olarak yapmak istiyoruz. *** //
        //-----------------------------------------//

        Map<Integer,String> ogrenciMap =ReusableMethods.mapOlustur();
        // * ReusableMethods.mapOlustur(); //ReusableMethods'dan bir map oluþturduk.kapýcý bana mapi getirdi.
        // * fakat bu gelen map class'ýn malý deðil.
        // * Map<Integer,String> ogrenciMap //bu class için ogrenciMap oluþturup atama yapýyoruz.
        // * ogrenciMap artýk bu class'da

        System.out.println(ogrenciMap);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Devops,
        // 105=Enes, Can, Tester, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester}

        //-----------------------------------------//

        // value'lari sira numarali olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap); // ReusableMethods class'ýnýn altýnda
                                                          // tumValueSiraliYazdir(ogrenciMap) diye method oluþturuyoruz
                                                          // argüment olarak ogrenciMap ine göndermemiz lazým.

                                                        /* Çalýþtýrdýðýmýzda çýktýmýz :
                                                        1 - Ali, Can, JDev
                                                        2 - Enes, Cem, Tester
                                                        3 - Taha, Emre, JDev
                                                        4 - Derya, Deniz, Devops
                                                        5 - Enes, Can, Tester
                                                        6 - Taha, Deniz, JDev
                                                        7 - Derya, Cem, Tester
                                                         */
        //-----------------------------------------//

        // Isim ve soyisimlerin birlikte olacagi bir liste olusturun
        List<String> sinifisimsoyisimList= ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
                                    // ReusableMethods class'ýndan isimSoyisimListesiOlustur isminde method oluþtur
                                    // methoda argüment olarak (ogrenciMap) ekledik ki oradan oluþtursun.
                                    // bize döndüreceði listin, bu class'ýn malý olmasý için,
                                    // List<String> sinifisimsoyisimList ine atama yaptýk.

        System.out.println("isim soyisim listesi : " + sinifisimsoyisimList);
                 //isim soyisim listesi : [Ali Can, Enes Cem, Taha Emre, Derya Deniz, Enes Can, Taha Deniz, Derya Cem]

        //-----------------------------------------//

        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin

        //*  bransIsmi = branstakiOgrencisayisi  bu yapý map'de var. dolaysýyla biz iþlemi map'te tutmalýyýz ve onu yazdýrmalýyýz.
        //*  key (branþ) ==> String, value (öðrenci sayýsý) ==> integer olmalý

        ReusableMethods.bransOgrencisayisiYazdir(ogrenciMap); // {Devops=1, JDev=3, Tester=3}

    }
}
