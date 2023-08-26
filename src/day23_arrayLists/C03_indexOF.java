package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOF {
    public static void main(String[] args) {

        List<String> urunler= new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.indexOf("Ikram")); // 1
        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]
        /*
         indexOf method'u bize bilgi donduren bir method'dur
         listemizi degistirmez
         */

        System.out.println(urunler.lastIndexOf("Ikram")); // 1

        /*
         indexOf method'u urunu aramaya 0.index'den,
         lastIndexOf method'u ise aramaya son index'den baslar.
         arama bitip, urun bulundugundugunda, ikisi de bulunan urunun index'ini verir
         */
        // bir tane daha ikram eklediðimizde ;

        urunler.add("Ikram");

        System.out.println(urunler);//  [Nutella, Ikram, Cekirdek, Cay, Ikram]

        System.out.println(urunler.indexOf("Ikram"));        // 1 ilk ikramý gösterdi
        System.out.println(urunler.lastIndexOf("Ikram")); // 4 son ikramý gösterdi

        System.out.println(urunler.indexOf("Hobby"));        // -1 olmayan üründe indexOf

        System.out.println(urunler.lastIndexOf("Hobby")); // -1 olmayan ürün lastIndexOf

    }
}
