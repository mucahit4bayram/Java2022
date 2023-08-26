package day46_maps;
import java.security.KeyStore;
import java.util.*;
public class ReusableMethods {
    public static Map<Integer, String> mapOlustur() { // bir method oluþturacaðýz, bize hazýr map döndürecek
        // Integer,String oluþan, mapOlustur isminde map döndürecek, hiçbir parametre almayacak
        Map<Integer, String> sinifMap = new HashMap<>();

        sinifMap.put(101, "Ali, Can, JDev");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Devops");
        sinifMap.put(105, "Enes, Can, Tester");
        sinifMap.put(106, "Taha, Deniz, JDev");
        sinifMap.put(107, "Derya, Cem, Tester");
        return sinifMap;     // sinifMap i döndürüyor
    }

    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        // ogrenciMap diye, Integer ve String den oluþan bir map yolladý
        // bende bu map'teki value'leri birer birer sýralý yazdýrmak istiyorum.

        int sira = 1;
        for (String each : ogrenciMap.values()
        ) {
            System.out.println(sira + " - " + each);
            sira++;
        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        // önce döndüreceðimiz listi oluþturalým (List<String> methoddakiList)
        // isim ve soyisimleri almak için value'leri for each loop ile
        // split ile, String[] array'ine atýp
        // sonrasýnda methoddakiList imize eklememiz lazým (eachArr'nin 0. ve 1. elementini)
        // oluþan listi döndüreceðiz

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
        // yeni bir map oluþturmalýyýz, ogrenciMap'inden yapamayýz
        // ogrenciMap'inden sayacaðýz, yeni bir map'e koymamýz lazým (branþ ve branþtaki öðrenci sayýsýný yeni map'e koy)
        // bizim ogrenciMap'inde key ==> integer, values ==> String idi
        // þimdi oluþturacaðýmýz map'te key ==> String, values ==> integer olmalý



        Map<String, Integer> bransOgrSayiMap = new TreeMap<>();// az element olduðu için ve harf sýrasýna göre çýksýn
                                                               // diye TreeMap yaptýk.(hýzlý olsun diye HashMap yapabilirdik)
        Collection<String> valuesCollection = ogrenciMap.values(); // ogrenciMap deki tüm value'leri collection'a aldýk
        String[] valuesArr; // her bir value'yi parçalara bölmek için array'e ihtiyacýmýz var
        String brans;
        Integer bransdakiOgrSayisi;

        for (String each : valuesCollection         // value'leri tek tek ele alýp, içlerinden branþý seçeceðiz
        ) {
            valuesArr = each.split(", ");      // her bir value'yi split ile parçalara bölüp, arry'e atadýk
            brans = valuesArr[2];                   // value array'inin 2. indexi olan branþ'ý aldýk.

            // brans'ýn bransOgrSayiMap'inde key olarak daha önceden eklenip eklenmediðini kontrol etmeliyiz
            // buraya kadar, ogrenciMap'inin ilk value deki brans'ý bize getirdi.
            if (!bransOgrSayiMap.containsKey(brans)) { // bransOgrSayimap'inde, þimdi gelen brans yoksa
                bransOgrSayiMap.put(brans, 1);         // "brans" = 1 de

            } else { // gelen brans, map'de daha önce varsa
                bransdakiOgrSayisi = bransOgrSayiMap.get(brans);
                // get() ==>methodu bize; key verirsen, ben sana integer olarak onun value'sini getiririm.
                // get(brans) yazarsak, bize o anda o brans'ýn sayýsý kaçsa onu getirir.
                // bransOgrSayiMap'inden brans'ýn deðerini getirip, bransdakiOgrSayisi variable'ýna atadýk
                // örneðin, daha önce 2 ise onu buraya atadýk.
                // þimdi , atadýðýmýz bu map deðerini 1 arttýrmalýyýz.

                bransOgrSayiMap.put(brans, ++bransdakiOgrSayisi);
                //bransOgrSayiMap'ine yeni bir eleman koyuyormuþ gibi, (brans, ++bransdakiOgrSayisi) yi koyuyoruz.
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