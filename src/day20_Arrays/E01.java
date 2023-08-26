package day20_Arrays;

import java.util.Arrays;

public class E01 {
    public static void main(String[] args) {

                            //-/-/-/ ARRAY OLUÞTURMA-DEÐER ATAMA-YAZDIRMA /-/-/-//

        // Soru 1: 	Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun ve bu array’i yazdirin.

        String arr[] = new String [4];

        System.out.println("arr : " + Arrays.toString(arr)); // [null, null, null, null]

        arr [0] = "Ali";
        arr [1] = "Veli";
        arr [2] = "Ayse";
        arr [3] = "Fatma";

        System.out.println("arr : " + Arrays.toString(arr)); // [Ali, Veli, Ayse, Fatma]

        String arr2 [] = {"Ali", "Veli", "Ayse", "Fatma"};

        System.out.println("arr2 : " + Arrays.toString(arr2)); // [Ali, Veli, Ayse, Fatma]

        // Soru 2: Soru 1’deki elemanlardan “Ali” yerine “Can”, “Ayse” yerine “Gul” atayin

        arr2 [0] = "Can";
        arr2 [2] = "Gul";

        System.out.println("arr2 atama sonrasý : " + Arrays.toString(arr2)); // [Can, Veli, Gul, Fatma]

        System.out.println ("arr2 1.index : " + arr2[1]); // Veli

        // son elementi yazdýrýn
        System.out.println("arr2 son element : " + arr2[arr2.length - 1]); // Fatma
                                                   // String'deki lenght() idi, burada sadece lenght

        // System.out.println(arr[arr.length]); // ArrayIndexOutOfBoundsException
        // yazdigin index sinirlarin disinda

        //-----------------------------------------------------------------------------------//

        // Array'in elemanlarini yazdirmak istersek loop ile yazdirabiliriz

        int arr3 [] = {2,4,5,6,78,89};

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");         // 2 4 5 6 78 89

        }

        // Ya da Arrays Class'indan yardim alip  direk array olarak yazdirabiliriz

        System.out.println(Arrays.toString(arr3)); // [2, 4, 5, 6, 78, 89]





    }
}
