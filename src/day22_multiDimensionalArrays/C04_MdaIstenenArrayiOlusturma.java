package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MdaIstenenArrayiOlusturma {
    public static void main(String[] args) {

      /*
        Soru 4) Asagidaki multi dimensional array’in
        ic array’lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array’in elemani yapan
        ve yeni array’i ekrana    yazdiran bir program yaziniz
        Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
         */

        int[][] input= { {1,2,3}, {4,5}, {6,7} };

        int[] yeniArr=new int[input.length]; // yeni array'in uzunluğu; içerdeki her bir inner arrayi toplanacağı için
                                             // outer arrayin uzunluğu nekadarsa yeni arrayin uzunluğuda o kadar olacak

        int toplam=0;

        for (int i = 0; i < input.length ; i++) {       // dis loop outer array'i gezer
            for (int j = 0; j <input[i].length ; j++) { // ic loop ise inner array'leri gezer

                toplam+=input[i][j]; // inner array'in tüm elementlerini toplama ekleyelim

            }                  // inner loop bittiği zaman, outer loop da başa dönmeden önce
                               // bulduğu toplamı yenisine ekleyip sonrasında sıfırlamalıyız
            yeniArr[i]=toplam; // yeni arrayin i. elemanı toplama eşit olsun
            toplam=0;          // sonrasında toplam sıfır olsun. sıfırlamazsak önceki toplamın üstüne ekleyerek devam eder.
        }
        System.out.println("Istenen yeni array : " + Arrays.toString(yeniArr));
        // outer loop bitince de yeni bir array yazdıracak

        /*
                         {1,2,3}, {4,5}, {6,7}
                            6       9      13

        Istenen yeni array : [6, 9, 13]
         */
    }
}

