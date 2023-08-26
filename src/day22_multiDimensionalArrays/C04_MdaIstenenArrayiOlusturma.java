package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MdaIstenenArrayiOlusturma {
    public static void main(String[] args) {

      /*
        Soru 4) Asagidaki multi dimensional array�in
        ic array�lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array�in elemani yapan
        ve yeni array�i ekrana    yazdiran bir program yaziniz
        Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
         */

        int[][] input= { {1,2,3}, {4,5}, {6,7} };

        int[] yeniArr=new int[input.length]; // yeni array'in uzunlu�u; i�erdeki her bir inner arrayi toplanaca�� i�in
                                             // outer arrayin uzunlu�u nekadarsa yeni arrayin uzunlu�uda o kadar olacak

        int toplam=0;

        for (int i = 0; i < input.length ; i++) {       // dis loop outer array'i gezer
            for (int j = 0; j <input[i].length ; j++) { // ic loop ise inner array'leri gezer

                toplam+=input[i][j]; // inner array'in t�m elementlerini toplama ekleyelim

            }                  // inner loop bitti�i zaman, outer loop da ba�a d�nmeden �nce
                               // buldu�u toplam� yenisine ekleyip sonras�nda s�f�rlamal�y�z
            yeniArr[i]=toplam; // yeni arrayin i. eleman� toplama e�it olsun
            toplam=0;          // sonras�nda toplam s�f�r olsun. s�f�rlamazsak �nceki toplam�n �st�ne ekleyerek devam eder.
        }
        System.out.println("Istenen yeni array : " + Arrays.toString(yeniArr));
        // outer loop bitince de yeni bir array yazd�racak

        /*
                         {1,2,3}, {4,5}, {6,7}
                            6       9      13

        Istenen yeni array : [6, 9, 13]
         */
    }
}

