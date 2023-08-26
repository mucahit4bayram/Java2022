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

        int temp=urunler.indexOf(silinecekUrun);      // silinecek �r�n�n index'ini bulal�m.
                                                      // kullanabilmek i�in int temp'e atad�k

        String silinenUrun=urunler.set(temp,yeniUrun);// yeni �r�n� silinecek �r�n�n index'ine (temp)'e koyal�m
                                                      // bu method bize string silinen �r�n� d�nd�r�r.
                                                      // ikram

        eskiUrunler.add(silinenUrun);                 // silinen �r�n� (ikram)'� eski �r�nlere ekledik.

        System.out.println("urunler listesi : " + urunler); // [Nutella, Biskrem, Cekirdek, Cay]

        System.out.println("eski urunler listesi : " + eskiUrunler); // [Ikram]

        // listedeki cay'�n yerine kahve koyalim,

        yeniUrun="Kahve";
        silinecekUrun="Cay";

        temp=urunler.indexOf(silinecekUrun);

        silinenUrun=urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : " + urunler); // [Nutella, Biskrem, Cekirdek, Kahve]

        System.out.println("eski urunler listesi : " + eskiUrunler); // [Ikram, Cay]

        // listedeki Findik'�n yerine Cekirdek koyalim,

        yeniUrun="Findik";
        silinecekUrun="Cekirdek";

        temp=urunler.indexOf(silinecekUrun);

        urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinecekUrun);

        System.out.println("* urunler listesi : " + urunler); // [Nutella, Biskrem, Findik, Kahve]

        System.out.println("* eski urunler listesi : " + eskiUrunler); // [Ikram, Cay, Cekirdek]

    }
}
