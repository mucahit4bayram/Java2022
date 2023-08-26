package day21_Arrays;

public class C01_Array_MaxSayiyiBulma {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen bir int array�deki en buyuk sayiyi yazdiran bir method olusturun.
         */

        int[] sayilar= {3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar); // method olusturup, argument olrak say�lar� yazd�k


    }

    public static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi = sayilar[0];  // maximum say�y� yazd�rmam�z i�in �nce bulmam�z laz�m.loop'la maximum say�y� bulabiliriz.
                                   // �nce maximum say�y� i�ine koyabilece�imiz bir variable olu�turmal�y�z.
                                   // sonra de�er atamas� yapmal�y�z. say�lar array'inin 0. elementini yazal�m.

        for (int i = 1; i < sayilar.length; i++) { // 0. indexi maxSay�ya atam��t�k. tekrar kontrol etmeye gerek yok
                                                   // 1. indexten ba�lay�p tek tek kontrol edip en buy�k olan say�y� bulal�m
            if (sayilar[i] > maxSayi) { // say�lar�n i indexindeki elementi maxSayi dan b�y�kse
                maxSayi=sayilar[i];     // yeni maximum say�, say�lar�n i. indeksindeki say� olsun
            }

        }

        System.out.println("Arraydeki en buyuk sayi : " + maxSayi);
    }
}
