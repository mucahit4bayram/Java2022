package day47_maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {

        // Verilen bir String'deki kullanilan harfleri
        // ve kullanilan harflerin tekrar sayisini H = 20 seklinde yazdirin

        String str= "Heeeeellllooooo Woooorrrrllllllddddd.";

        // rakam ve harf dýþýndaki herþeyi yok edelim.
        // \\W ifadesi a-z A-Z 0-9 _ disindakileri kapsar
        str=str.replaceAll("\\W","");

        String[] harflerArr = str.split(""); // "" ile böldüðümüz için tüm harflere ulaþtýk.

        System.out.println(Arrays.toString(harflerArr));
        // [H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]

        // harfleri key, kullanim adedini value yaparak bir map olusturalim
        Map<String,Integer> harfKullanimsayilariMap= new TreeMap<>();

        Integer harfKullanimsayisi;

        for (String each: harflerArr    // elemanlarý (harfleri), harflerArr'inden çekiyoruz. tüm harfler arr de
        ) {
            if (!harfKullanimsayilariMap.containsKey(each)){ //harfKullanimsayilariMap'inde, each (harf) içermiyorsa
                harfKullanimsayilariMap.put(each,1); // harfKullanimsayilariMap'ine yeni bir harf ekliyoruz
                                                     // elementin string key'i ==> each(bizim harfimiz) olacak
                                                     // deðeride baþlangýçta 1 olacak
            }else{ // varsa, var olaný update edelim
                harfKullanimsayisi=harfKullanimsayilariMap.get(each);
                //harfKullanimsayilariMap'den (each) olan harfimin kaç kere kullanýldýðýný getir.
                harfKullanimsayilariMap.put(each,++harfKullanimsayisi); // daha önceki harfKullanimsayisi'ni 1 arttýr.
            }
        }
        System.out.println(harfKullanimsayilariMap); // {H=1, W=1, d=5, e=5, l=10, o=9, r=4}
    }
}