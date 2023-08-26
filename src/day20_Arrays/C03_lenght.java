package day20_Arrays;

import java.util.Arrays;

public class C03_lenght {
    public static void main(String[] args) {

        int sayilar[] = {1,2,3};

        String harfler[] = new String [4];

        System.out.println("sayilar array'in uzunlugu : " + sayilar.length); // 3
        // NOT : String ve Array icin length method�larinda dikkatli olmak gerekir.
        //       Strings ==> length( )
        //       Arrays ==> length

        System.out.println("harfler array'in uzunlugu : " + harfler.length); // 4
        System.out.println(Arrays.toString(harfler));  // [null, null, null, null]

        // harfler array'inin son elementini yazd�ral�m
        System.out.println(harfler[harfler.length-1]); // null

        System.out.println(harfler[5]); // ArrayIndexOutOfBoundsException



    }
}