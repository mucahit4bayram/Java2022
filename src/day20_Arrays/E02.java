package day20_Arrays;

import java.util.Arrays;

public class E02 {
    public static void main(String[] args) {

        // Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini
        // bir soldaki konuma tasiyacak bir program yazin.
        // Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

        int arr [] = {1,2,3,4,5,6,8,9};

        int kova = arr[0];

        for (int i = 0; i <arr.length-1 ; i++) {

            arr[i] = arr [i+1];

        }
        System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 6, 8, 9, 9]
        arr[arr.length-1] = kova;
        System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 6, 8, 9, 1]

        // tersini yapýp baþlangýçta olduðu duruma döndürelim .. saða kaydýracaðýz

        int temp = arr[arr.length - 1];

        for (int i =arr.length-1; i >0; i--) {
            arr[i] = arr[i-1];

        }
        System.out.println(Arrays.toString(arr)); // [2, 2, 3, 4, 5, 6, 8, 9]
        arr[0]=temp;
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 8, 9]



    }
}
