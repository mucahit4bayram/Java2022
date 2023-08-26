package day46_maps;
import java.security.KeyStore;
import java.util.*;
public class ReusableMethods {
    public static Map<Integer, String> mapOlustur() { // bir method olu�turaca��z, bize haz�r map d�nd�recek
        // Integer,String olu�an, mapOlustur isminde map d�nd�recek, hi�bir parametre almayacak
        Map<Integer, String> sinifMap = new HashMap<>();

        sinifMap.put(101, "Ali, Can, JDev");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Devops");
        sinifMap.put(105, "Enes, Can, Tester");
        sinifMap.put(106, "Taha, Deniz, JDev");
        sinifMap.put(107, "Derya, Cem, Tester");
        return sinifMap;     // sinifMap i d�nd�r�yor
    }

    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        // ogrenciMap diye, Integer ve String den olu�an bir map yollad�
        // bende bu map'teki value'leri birer birer s�ral� yazd�rmak istiyorum.

        int sira = 1;
        for (String each : ogrenciMap.values()
        ) {
            System.out.println(sira + " - " + each);
            sira++;
        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        // �nce d�nd�rece�imiz listi olu�tural�m (List<String> methoddakiList)
        // isim ve soyisimleri almak i�in value'leri for each loop ile
        // split ile, String[] array'ine at�p
        // sonras�nda methoddakiList imize eklememiz laz�m (eachArr'nin 0. ve 1. elementini)
        // olu�an listi d�nd�rece�iz

        List<String> methoddakiList = new ArrayList<>();
        String[] eachArr;

        for (String each : ogrenciMap.values()
        ) {
            eachArr = each.split(", ");
            methoddakiList.add(eachArr[0] + " " + eachArr[1]);
        }
        return methoddakiList;
    }

    public static void bransOgrencisayisiYazdir(Map<Integer, String> ogrenciMap) {
        // bransIsmi = branstakiOgrencisayisi isteniyor
        // yeni bir map olu�turmal�y�z, ogrenciMap'inden yapamay�z
        // ogrenciMap'inden sayaca��z, yeni bir map'e koymam�z laz�m (bran� ve bran�taki ��renci say�s�n� yeni map'e koy)
        // bizim ogrenciMap'inde key ==> integer, values ==> String idi
        // �imdi olu�turaca��m�z map'te key ==> String, values ==> integer olmal�



        Map<String, Integer> bransOgrSayiMap = new TreeMap<>();// az element oldu�u i�in ve harf s�ras�na g�re ��ks�n
                                                               // diye TreeMap yapt�k.(h�zl� olsun diye HashMap yapabilirdik)
        Collection<String> valuesCollection = ogrenciMap.values(); // ogrenciMap deki t�m value'leri collection'a ald�k
        String[] valuesArr; // her bir value'yi par�alara b�lmek i�in array'e ihtiyac�m�z var
        String brans;
        Integer bransdakiOgrSayisi;

        for (String each : valuesCollection         // value'leri tek tek ele al�p, i�lerinden bran�� se�ece�iz
        ) {
            valuesArr = each.split(", ");      // her bir value'yi split ile par�alara b�l�p, arry'e atad�k
            brans = valuesArr[2];                   // value array'inin 2. indexi olan bran�'� ald�k.

            // brans'�n bransOgrSayiMap'inde key olarak daha �nceden eklenip eklenmedi�ini kontrol etmeliyiz
            // buraya kadar, ogrenciMap'inin ilk value deki brans'� bize getirdi.
            if (!bransOgrSayiMap.containsKey(brans)) { // bransOgrSayimap'inde, �imdi gelen brans yoksa
                bransOgrSayiMap.put(brans, 1);         // "brans" = 1 de

            } else { // gelen brans, map'de daha �nce varsa
                bransdakiOgrSayisi = bransOgrSayiMap.get(brans);
                // get() ==>methodu bize; key verirsen, ben sana integer olarak onun value'sini getiririm.
                // get(brans) yazarsak, bize o anda o brans'�n say�s� ka�sa onu getirir.
                // bransOgrSayiMap'inden brans'�n de�erini getirip, bransdakiOgrSayisi variable'�na atad�k
                // �rne�in, daha �nce 2 ise onu buraya atad�k.
                // �imdi , atad���m�z bu map de�erini 1 artt�rmal�y�z.

                bransOgrSayiMap.put(brans, ++bransdakiOgrSayisi);
                //bransOgrSayiMap'ine yeni bir eleman koyuyormu� gibi, (brans, ++bransdakiOgrSayisi) yi koyuyoruz.
            }
        }
        System.out.println(bransOgrSayiMap);
    }

    public static void entryYazdir(Map<Integer, String> sinifListMap) {

        Set<Map.Entry<Integer, String>> sinifListEntrySeti = sinifListMap.entrySet();

        for (Map.Entry<Integer, String> entry : sinifListEntrySeti
        ){
            System.out.println(entry);
        }
    }
}