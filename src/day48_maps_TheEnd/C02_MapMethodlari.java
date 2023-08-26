package day48_maps_TheEnd;
import day46_maps.ReusableMethods;
import java.util.Map;
public class C02_MapMethodlari {

    public static void main(String[] args) {

        Map<Integer,String> sinifListMap=ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);

        /*
        101=Ali, Can, JDev
        102=Enes, Cem, Tester
        103=Taha, Emre, JDev
        104=Derya, Deniz, Devops
        105=Enes, Can, Tester
        106=Taha, Deniz, JDev
        107=Derya, Cem, Tester
         */

        sinifListMap.clear();
        System.out.println("cleardan sonra map : " + sinifListMap); // cleardan sonra map : {}

        sinifListMap=ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(104, "Aradiginiz key yok"));
        // Derya, Deniz, Devops

        System.out.println(sinifListMap.getOrDefault(110, "Aradiginiz key yok"));
        // Aradiginiz key yok

        System.out.println(sinifListMap.isEmpty()); // false

        sinifListMap.putIfAbsent(104,"Derya, Okyanus, Developer");
        sinifListMap.putIfAbsent(108,"Aysun, Can, Devops");
        ReusableMethods.entryYazdir(sinifListMap);
        /*
        101=Ali, Can, JDev
        102=Enes, Cem, Tester
        103=Taha, Emre, JDev
        104=Derya, Deniz, Devops
        105=Enes, Can, Tester
        106=Taha, Deniz, JDev
        107=Derya, Cem, Tester
        108=Aysun, Can, Devops
         */

        /*
          SinifListesiMap'e key olarak 106 yoksa , value "Mevlut, Han, Tester" ekleyin
          106 daha onceden varsa, "eski degeri degistirmek istediginizden emin misiniz ?" yazdirin

          106'nin oldugunu kontrol etmek icin containsKey daha mantikli ama biz yeni ogrendigimiz method ile yapalim

          map.putIfabsent (key, value) ==> key varsa ekleme yapmaz, bize o key ile kayitli olan value'yu dondurur
          ==> key daha onceden map'e eklenmemisse eklemeyi yapar ve bize null dondurur
         */

        System.out.println(sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester"));
        // Taha, Deniz, JDev  // 106 kayýtlý olduðu için kayýrlý olan value yý yazdýrdý

        if (sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester")==null){
            System.out.println("Kayit basarili");
        } else{
            System.out.println("eski degeri degistirmek istediginizden emin misiniz ?");
        }
        System.out.println(sinifListMap.putIfAbsent(109,"Mevlut, Han, Tester"));
        //109 listede olmadýðý için null döndürüp, listeye ekledi

        ReusableMethods.entryYazdir(sinifListMap);
        /*
        101=Ali, Can, JDev
        102=Enes, Cem, Tester
        103=Taha, Emre, JDev
        104=Derya, Deniz, Devops
        105=Enes, Can, Tester
        106=Taha, Deniz, JDev
        107=Derya, Cem, Tester
        108=Aysun, Can, Devops
        109=Mevlut, Han, Tester
         */

        sinifListMap.remove(106); // 106'yi silip bana sildigini dondurur
        sinifListMap.remove(107,"Derya, Cem, Tester"); // silerse true, silmezse false dondurur
        //*** map de 106 ve 107 oolduðu için ikisini de sildi.

        ReusableMethods.entryYazdir(sinifListMap);
        /*
        101=Ali, Can, JDev
        102=Enes, Cem, Tester
        103=Taha, Emre, JDev
        104=Derya, Deniz, Devops
        105=Enes, Can, Tester
        108=Aysun, Can, Devops
        109=Mevlut, Han, Tester
         */

        sinifListMap.replace(105,"Erdal, Ciftci, Tester");
        sinifListMap.put(109,"Cavidan, Eken, JDev"); // ikisi ayni islevi yapiyor
        // *** 105 ve 109 u deðiþtirdi.

        ReusableMethods.entryYazdir(sinifListMap);
        /*
        101=Ali, Can, JDev
        102=Enes, Cem, Tester
        103=Taha, Emre, JDev
        104=Derya, Deniz, Devops
        105=Erdal, Ciftci, Tester
        108=Aysun, Can, Devops
        109=Cavidan, Eken, JDev
         */

        System.out.println(sinifListMap.size()); // 7
    }
}