package day12_stringManiplation;

public class C06_trim {

    public static void main(String[] args) {

        /*
        18) trim() : İstediğimiz String'in başında veya sonunda var olan boşluk/ "space"leri temizler.
         */

        String str = " Java ogrenmek cok guzel. ";

        System.out.println(str);                    //  Java ogrenmek cok guzel.
        System.out.println(str.length());           // 26
        System.out.println(str.trim());             // Java ogrenmek cok guzel.
        System.out.println(str.trim().length());    // 24
    }
}
