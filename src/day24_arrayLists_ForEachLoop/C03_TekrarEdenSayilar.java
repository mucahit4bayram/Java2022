package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {

        // Soru 1) Verilen bir array�deki tekrar eden elementleri yazdirin.

        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]

        List<Integer> tekrarEdenler= new ArrayList<>();
        // listte yan yana ikiden fazla yaz�lm�� ise (3, 3, 3,) ��kt�da (3,3) olur tekrara girer.
        // bu t�r durumlarda tekrara girmek istemiyorsak;
        // for loop'tan �nce bir list olu�turmal�y�z    ===> List<Integer> tekrarEdenler= new ArrayList<>();
        // tekraredenler listesini kontrol etmek i�in
        // if bolo�una bir �art daha ko�uyoruz          ===> && !tekrarEdenler.contains(arr[i])

        for (int i = 0; i < arr.length-1 ; i++) {
            // for loopumuz 0'dan arry'in sonuna kadar gitsin
            // if sat�r�nda, arr[i+1] oldu�u i�in length hata verdi, arr.length-1 olarak d�zelttik

            if (arr[i]==arr[i+1] && !tekrarEdenler.contains(arr[i])){
                // arr[i] yan�ndakine e�itse VE tekrar edenler listesinde yoksa o zaman yazd�r
                // (i=i+1) yani tekrar ediyorsa yazd�rs�n

                System.out.print(arr[i]+ " "); // 3 5 6

                tekrarEdenler.add(arr[i]); // yazd�rd�ktan sonra da tekrar edenler listesine ekle.yazd�rd�m diye
            }
        }
        System.out.println(tekrarEdenler); // [3, 5, 6]

        int[] arr1 ={2,3,5,6};
        System.out.println(Arrays.toString(arr1)); //[2, 3, 5, 6]

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " ");  // 2 3 5 6
        }

    }
}

