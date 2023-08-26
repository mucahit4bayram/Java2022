package day46_maps;

import java.util.List;
import java.util.Map;
public class C02_MapsMethodIle {
    public static void main(String[] args) {

        // *** C01 deki yapt���m�z i�lemleri metodlu olarak yapmak istiyoruz. *** //
        //-----------------------------------------//

        Map<Integer,String> ogrenciMap =ReusableMethods.mapOlustur();
        // * ReusableMethods.mapOlustur(); //ReusableMethods'dan bir map olu�turduk.kap�c� bana mapi getirdi.
        // * fakat bu gelen map class'�n mal� de�il.
        // * Map<Integer,String> ogrenciMap //bu class i�in ogrenciMap olu�turup atama yap�yoruz.
        // * ogrenciMap art�k bu class'da

        System.out.println(ogrenciMap);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Devops,
        // 105=Enes, Can, Tester, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester}

        //-----------------------------------------//

        // value'lari sira numarali olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap); // ReusableMethods class'�n�n alt�nda
                                                          // tumValueSiraliYazdir(ogrenciMap) diye method olu�turuyoruz
                                                          // arg�ment olarak ogrenciMap ine g�ndermemiz laz�m.

                                                        /* �al��t�rd���m�zda ��kt�m�z :
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
                                    // ReusableMethods class'�ndan isimSoyisimListesiOlustur isminde method olu�tur
                                    // methoda arg�ment olarak (ogrenciMap) ekledik ki oradan olu�tursun.
                                    // bize d�nd�rece�i listin, bu class'�n mal� olmas� i�in,
                                    // List<String> sinifisimsoyisimList ine atama yapt�k.

        System.out.println("isim soyisim listesi : " + sinifisimsoyisimList);
                 //isim soyisim listesi : [Ali Can, Enes Cem, Taha Emre, Derya Deniz, Enes Can, Taha Deniz, Derya Cem]

        //-----------------------------------------//

        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin

        //*  bransIsmi = branstakiOgrencisayisi  bu yap� map'de var. dolays�yla biz i�lemi map'te tutmal�y�z ve onu yazd�rmal�y�z.
        //*  key (bran�) ==> String, value (��renci say�s�) ==> integer olmal�

        ReusableMethods.bransOgrencisayisiYazdir(ogrenciMap); // {Devops=1, JDev=3, Tester=3}

    }
}
