package day21_Arrays;

public class C01_Array_MaxSayiyiBulma {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
         */

        int[] sayilar= {3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar); // method olusturup, argument olrak sayýlarý yazdýk


    }

    public static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi = sayilar[0];  // maximum sayýyý yazdýrmamýz için önce bulmamýz lazým.loop'la maximum sayýyý bulabiliriz.
                                   // önce maximum sayýyý içine koyabileceðimiz bir variable oluþturmalýyýz.
                                   // sonra deðer atamasý yapmalýyýz. sayýlar array'inin 0. elementini yazalým.

        for (int i = 1; i < sayilar.length; i++) { // 0. indexi maxSayýya atamýþtýk. tekrar kontrol etmeye gerek yok
                                                   // 1. indexten baþlayýp tek tek kontrol edip en buyük olan sayýyý bulalým
            if (sayilar[i] > maxSayi) { // sayýlarýn i indexindeki elementi maxSayi dan büyükse
                maxSayi=sayilar[i];     // yeni maximum sayý, sayýlarýn i. indeksindeki sayý olsun
            }

        }

        System.out.println("Arraydeki en buyuk sayi : " + maxSayi);
    }
}
