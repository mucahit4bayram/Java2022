package day21_Arrays;

import java.util.Arrays;
import java.util.SortedMap;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen bir array�e yeni bir element ekleyen method olusturun
         */

        /*              /-/-/!!! � N E M L � !!!/-/-/
        Array'in uzunlu�unu de�i�tiremeyiz. �� elemanl� bir Array'e ekleme yap�p 4 elemanl� yapamay�z.
        yeni bir Array olu�turup, sonra eski array daki de�erleri yeni arraya ta��r�z.
         */

        String [] sinifListesi = {"Ali Can","Nida Yucedal","Musa Yaman"};
        String eklenecekIsim = "Murat Babayigit";

        sinifListesi = elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));     // [Ali Can, Nida Yucedal, Musa Yaman, Murat Babayigit]

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        String[] yenisinifListesi = new String[sinifListesi.length+1]; // [null, null, null, null]
        // eski listeden 1 eleman fazla uzunlukta yeni bir array olu�turduk

        for (int i = 0; i < sinifListesi.length; i++) {
            yenisinifListesi[i] = sinifListesi[i];

        }
        // �ncelikle eski listedeki t�m elemanlar�, yeni listeye ta��d�k
        yenisinifListesi[yenisinifListesi.length-1] = eklenecekIsim;
        // son index'e ise eklenecek ismi atad�k.


        return yenisinifListesi;
    }
}
