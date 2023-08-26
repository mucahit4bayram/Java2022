package day20_Arrays;

import java.util.Arrays;

public class E03 {
    public static void main(String[] args) {

        // Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

        int arr[] = {3,5,8,5,2,4};

        int toplam =0;

        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];

        }
        System.out.println("Elemanlarin toplami : " + toplam); // 27

        // array'in tum elemanlarini once kucukten buyuge, sonra buyukten kucuge yazdirin

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 5, 8]

        //buyukten kucuge yazdirmak icin

        // 1 - for loop ile elemanlari ters sirada yazdiririz

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+ " ");        // 8 5 5 4 3 2
        }

        // 2- array yapmak isterseniz ayni uzunlukta bir array olusturup elemanlari ters sirada yeni arraye tasiyabilirsiniz
        System.out.println(" ");


        int tersArray[]= new int[arr.length];

        for (int i = 0; i < tersArray.length ; i++) {

            tersArray[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(tersArray)); // [8, 5, 5, 4, 3, 2]


    }
}
