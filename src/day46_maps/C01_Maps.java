package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
       /*
        * Map interface'dir.
        * Reel projelerde kullanilan database yapisina en uygun Java objesidir.
        * Maps key – value pairs kullanir. ( anahtar –deger(ler) ). Key’ler unique olmalidir.
        * Key’ler unique olmalidir.
        * Map ile ayni ozelliklere sahip birden fazla objeyi ve ozelliklerini store edebilirsiniz.(Ogrenci1, Ogrenci2)
          Ayný baþlýktaki bilgileri, ayný sýrada tutmalýyýz.
        * HashMap, diðerlerine göre farký hýzlý olmasýdýr.
        * LinkedHashMap, link özelliði olmasý sebebiyle biraz yavaþtýr, birbirine baðlýdýr, ekleme yapýlýnca en sona ekler.
        * TreeMap, elemanlarý doðal sýralýdýr.yine unique tir.
        */
        /*
        * Map ile key ve value bilgilerine ayri ayri ulasabilir, istedigimiz degisiklikleri ayri ayri yapabiliriz
            * keyset( ) method’u Set olarak key degerlerini verir.
            * values() method’u Collection olarak “value”lari verir. Collections’dan istedigimiz bir variable’a
              degerleri ekleyebilir ve kullanabiliriz.
         */

        Map<Integer,String> sinifList = new HashMap<>(); // key'lerimiz integer, value'lerimiz string

        sinifList.put(101,"Ali, Can, JDev"); // boþluklara dikkat etmeliyiz.
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, Tester");

        System.out.println(sinifList);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet()); // [101, 102, 103, 104]

        System.out.println(sinifList.values());
        // [Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester]

        System.out.println(sinifList.values().size()); // 4 tane element var
        //-------------------------------------------------------//

        // tum ogrencilerin isim ve soyisimlerini sira no ile alt alta yazdirin

        // * sinifList.values(). ==> bize Collection döndürüyor.
        // * dolayýsýyla value'leri alýp collection'a atamalýyýz.

        Collection<String> tumValueColl =sinifList.values(); // sinifList deki value leri collection olarak kaydediyoruz

        String[] eachArr;

        int sira=1;

        for (String each : tumValueColl
        ) {
            // buradaki each bize her bir ogrenciye ait
            // ayni yapidaki isim, soyisim, brans bilgilerini iceren String'ler getiriyor
            eachArr= each.split(", ");  // split methoduyla stringi bölüyorduk. virgül ve bir boþluða göre bölüyoruz.
                                             // ve arr ye atadýk
            System.out.println(sira + "- " + eachArr[0] + " " + eachArr[1]); //isim 0. elementte + soyisim 1. elementte
            sira++; // 1., 2., ... sýralý yazmasý için sýra ekledik.sýra no ile yazmýmýzý istedi.
        }
                                                /* Çýktýmýz :
                                                    1- Ali Can
                                                    2- Enes Cem
                                                    3- Taha Emre
                                                    4- Derya Deniz
                                                 */

        //----------------------------------------------------------------------------//

        // Map'de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek
        // bir sinif listesi olusturun

        List<String> sinifIsimSoyisimList= new ArrayList<>();   // list'imizi oluþturduk

        for (String each : tumValueColl
        ) {
            eachArr=each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]); // list'e ekledik.
        }
        System.out.println(sinifIsimSoyisimList); // [Ali Can, Enes Cem, Taha Emre, Derya Deniz]
    }
}
