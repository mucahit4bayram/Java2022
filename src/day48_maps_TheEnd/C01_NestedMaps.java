package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
    public static void main(String[] args) {

        /*
        Eðer bir element ile ilgili tutacaðýmýz bilgiler çoksa veya kompleks ise bu defa içi içe map kullanmayý
        tercih edebiliriz.

        Ýç içe map kullandýðýmýzda daha fazla datayý, daha düzenli olarak tutma imkanýmýz olur
        Ancak, blgiye ulaþmak ve manipule etmek zorlaþacaktýr.

        Örnek olarak dünkü map'imizi map'lerden oluþan bir map olarak oluþturalým:
        sinifMap.put(no=102, isim=Enes, soyisim=Cem, brans=Tester);
        sinifMap.put(103,"Taha, Emre, JDev");
        sinifMap.put(104,"Derya, Deniz, Tester");
         */

        Map<String,String> ogr101=new HashMap<>();
        ogr101.put("isim", "Enes");
        ogr101.put("soyisim", "Cem");
        ogr101.put("brans", "Tester");

        Map<String,String> ogr102=new HashMap<>();
        ogr102.put("isim", "Taha");
        ogr102.put("soyisim", "Emre");
        ogr102.put("brans", "JDev");

        Map<String,String> ogr103=new HashMap<>();
        ogr103.put("isim", "Derya");
        ogr103.put("soyisim", "Deniz");
        ogr103.put("brans", "Devops");

        Map<Integer,Map<String,String>> ogrencinestedMap=new HashMap<>();
        ogrencinestedMap.put(101, ogr101);
        ogrencinestedMap.put(102, ogr102);
        ogrencinestedMap.put(103, ogr103);

       Set<Map.Entry<Integer, Map<String,String>>> ogrenciEntrySeti = ogrencinestedMap.entrySet();
       for (Map.Entry each : ogrenciEntrySeti) {
           System.out.println(each);
       }

       // 102 nolu kiþinin ismini yazdýralým
        System.out.println(ogrencinestedMap.get(102).get("isim"));


    }
}
