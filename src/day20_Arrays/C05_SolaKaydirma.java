package day20_Arrays;

import java.util.Arrays;

public class C05_SolaKaydirma {
    public static void main(String[] args) {

    /*
      Soru 1: Verilen 3 elemanli bir array�in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.

      Ornek; array [1, 2, 3] ise output [2, 3, 1] olacak.

     */

        int arr [] = {1,2,3} ;

        int temp = arr[0]; // 2'yi sola kayd�rd���m�zda 1 kaybolmas�n diye 1'i ge�ici olarak temp'e atad�k

        System.out.println(Arrays.toString(arr)); // [1, 2, 3]

        for (int i = 0; i < arr.length-1; i++) {
            arr [i] = arr [i+1]; // kayd�rma yapmak i�in index'i 1 olan� 0'a, 2 olan� 1'e atamal�y�z

        }
        // System.out.print(Arrays.toString(arr)); // [2, 3, 3]
                                                   // ba�lang��ta kaybolmas�n diye temp'e atad���m�z 1'i
        arr[arr.length-1] = temp;                  // son elemente at�yoruz.
        System.out.print(Arrays.toString(arr));    // [2, 3, 1]

        // yukar�da de�i�tirdi�imiz array'i ilk durumuna getirmek i�in sa�a kayd�ral�m
        // [2, 3, 1]       ==> [1, 2, 3]

        temp = arr[arr.length-1];  // [1]

        for (int i = arr.length-1; i >0 ; i--) {   // index'i 1 olan� 2'ye, 0 olan� da 1'ye atad�k
            arr[i] = arr[i-1];


        }
        System.out.println(Arrays.toString(arr)); // [2, 2, 3]
        arr[0] = temp;
        System.out.print(Arrays.toString(arr));   // [1, 2, 3]


    }
}
