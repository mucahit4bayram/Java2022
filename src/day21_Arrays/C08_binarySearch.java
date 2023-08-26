package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        Binary search javada eleman aramanin kisa yoludur ancak binary search'un calismasi icin once
        array'in sirali hale getirilmesi gerekir.
        eger siralama yapmadan binary Search yaparsaniz sonucu bulamayabilir veya yanlis bulabilir
         */

        String[] harfler = {"Y","B","D","G","O","A"};

        String arananHarf = "Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));   // -7
        System.out.println(C03_Contains.contains(harfler,arananHarf)); // true

        // binarySearch bize aradýðýmýz elemanýn index'ini döndürür.
        // array sýralý olmadýðý için arama sonucunu doðru bulamayabilir.
        // emin olmak için önce sort yapmalýyýz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));                  // [A, B, D, G, O, Y]
        System.out.println(Arrays.binarySearch(harfler,arananHarf));   // 5
        System.out.println(C03_Contains.contains(harfler,arananHarf)); // true



    }
}
