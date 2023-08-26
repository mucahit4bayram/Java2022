package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        /*
          elimizde urunlerin bulundugu bir liste var.
          urun listesindeki istenen siradaki urunu istegimiz yeni urunle degistirip
          eski urunu, varolan eski urunler listesine ekleyelim
         */

        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler= new ArrayList<>();

        // listedeki ikram'in yerine biskrem koyalim,
        // ikram'i da eski urunler listesine ekleyelim

        String yeniUrun="Biskrem";

        String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun);      // silinecek ürünün index'ini bulalım.
                                                      // kullanabilmek için int temp'e atadık

        String silinenUrun=urunler.set(temp,yeniUrun);// yeni ürünü silinecek ürünün index'ine (temp)'e koyalım
                                                      // bu method bize string silinen ürünü döndürür.
                                                      // ikram

        eskiUrunler.add(silinenUrun);                 // silinen ürünü (ikram)'ı eski ürünlere ekledik.

        System.out.println("urunler listesi : " + urunler); // [Nutella, Biskrem, Cekirdek, Cay]

        System.out.println("eski urunler listesi : " + eskiUrunler); // [Ikram]

        // listedeki cay'ın yerine kahve koyalim,

        yeniUrun="Kahve";
        silinecekUrun="Cay";

        temp=urunler.indexOf(silinecekUrun);

        silinenUrun=urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : " + urunler); // [Nutella, Biskrem, Cekirdek, Kahve]

        System.out.println("eski urunler listesi : " + eskiUrunler); // [Ikram, Cay]

        // listedeki Findik'ın yerine Cekirdek koyalim,

        yeniUrun="Findik";
        silinecekUrun="Cekirdek";

        temp=urunler.indexOf(silinecekUrun);

        urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinecekUrun);

        System.out.println("* urunler listesi : " + urunler); // [Nutella, Biskrem, Findik, Kahve]

        System.out.println("* eski urunler listesi : " + eskiUrunler); // [Ikram, Cay, Cekirdek]

    }
}
