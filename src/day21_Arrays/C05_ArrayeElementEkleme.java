package day21_Arrays;

import java.util.Arrays;
import java.util.SortedMap;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
         */

        /*              /-/-/!!! Ö N E M L Ý !!!/-/-/
        Array'in uzunluðunu deðiþtiremeyiz. Üç elemanlý bir Array'e ekleme yapýp 4 elemanlý yapamayýz.
        yeni bir Array oluþturup, sonra eski array daki deðerleri yeni arraya taþýrýz.
         */

        String [] sinifListesi = {"Ali Can","Nida Yucedal","Musa Yaman"};
        String eklenecekIsim = "Murat Babayigit";

        sinifListesi = elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));     // [Ali Can, Nida Yucedal, Musa Yaman, Murat Babayigit]

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        String[] yenisinifListesi = new String[sinifListesi.length+1]; // [null, null, null, null]
        // eski listeden 1 eleman fazla uzunlukta yeni bir array oluþturduk

        for (int i = 0; i < sinifListesi.length; i++) {
            yenisinifListesi[i] = sinifListesi[i];

        }
        // öncelikle eski listedeki tüm elemanlarý, yeni listeye taþýdýk
        yenisinifListesi[yenisinifListesi.length-1] = eklenecekIsim;
        // son index'e ise eklenecek ismi atadýk.


        return yenisinifListesi;
    }
}
