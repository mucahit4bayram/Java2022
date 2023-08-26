package day20_Arrays;

import java.util.Arrays;

public class C05_SolaKaydirma {
    public static void main(String[] args) {

    /*
      Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.

      Ornek; array [1, 2, 3] ise output [2, 3, 1] olacak.

     */

        int arr [] = {1,2,3} ;

        int temp = arr[0]; // 2'yi sola kaydýrdýðýmýzda 1 kaybolmasýn diye 1'i geçici olarak temp'e atadýk

        System.out.println(Arrays.toString(arr)); // [1, 2, 3]

        for (int i = 0; i < arr.length-1; i++) {
            arr [i] = arr [i+1]; // kaydýrma yapmak için index'i 1 olaný 0'a, 2 olaný 1'e atamalýyýz

        }
        // System.out.print(Arrays.toString(arr)); // [2, 3, 3]
                                                   // baþlangýçta kaybolmasýn diye temp'e atadýðýmýz 1'i
        arr[arr.length-1] = temp;                  // son elemente atýyoruz.
        System.out.print(Arrays.toString(arr));    // [2, 3, 1]

        // yukarýda deðiþtirdiðimiz array'i ilk durumuna getirmek için saða kaydýralým
        // [2, 3, 1]       ==> [1, 2, 3]

        temp = arr[arr.length-1];  // [1]

        for (int i = arr.length-1; i >0 ; i--) {   // index'i 1 olaný 2'ye, 0 olaný da 1'ye atadýk
            arr[i] = arr[i-1];


        }
        System.out.println(Arrays.toString(arr)); // [2, 2, 3]
        arr[0] = temp;
        System.out.print(Arrays.toString(arr));   // [1, 2, 3]


    }
}
