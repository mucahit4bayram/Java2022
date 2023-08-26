package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {

        // Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]

        List<Integer> tekrarEdenler= new ArrayList<>();
        // listte yan yana ikiden fazla yazýlmýþ ise (3, 3, 3,) çýktýda (3,3) olur tekrara girer.
        // bu tür durumlarda tekrara girmek istemiyorsak;
        // for loop'tan önce bir list oluþturmalýyýz    ===> List<Integer> tekrarEdenler= new ArrayList<>();
        // tekraredenler listesini kontrol etmek için
        // if boloðuna bir þart daha koþuyoruz          ===> && !tekrarEdenler.contains(arr[i])

        for (int i = 0; i < arr.length-1 ; i++) {
            // for loopumuz 0'dan arry'in sonuna kadar gitsin
            // if satýrýnda, arr[i+1] olduðu için length hata verdi, arr.length-1 olarak düzelttik

            if (arr[i]==arr[i+1] && !tekrarEdenler.contains(arr[i])){
                // arr[i] yanýndakine eþitse VE tekrar edenler listesinde yoksa o zaman yazdýr
                // (i=i+1) yani tekrar ediyorsa yazdýrsýn

                System.out.print(arr[i]+ " "); // 3 5 6

                tekrarEdenler.add(arr[i]); // yazdýrdýktan sonra da tekrar edenler listesine ekle.yazdýrdým diye
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

