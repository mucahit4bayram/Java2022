package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        // Verilen bir array'deki tekrar eden elementleri silip
        // tekrarsiz halini array'e atayan kod yaziniz

        int[] arr ={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};

        Set<Integer> tekrarsizSet = new HashSet<>();

        for (int each: arr
        ) {
            tekrarsizSet.add(each);
        }
        System.out.println("Set : " + tekrarsizSet);

        int[] tekrarsizArr= new int[tekrarsizSet.size()]; // tekrarsizSet in uzunlu�u kadar bo� bir arr olu�turduk

        //*** Set'teki elementleri arr ye atayabilmemiz i�in foreach loop olmaz, ��nk� array index ister.
        //*** for loop kullansak set'ten element alamay�z. ��nk� sette index yap�s� yoktur.
        //*** foreach loop'u olu�turup setten elementleri alaca��z, ama indexi kendimiz olu�turaca��z.

        int i=0; // kendi indeximizi olu�turduk
        for (Integer each:tekrarsizSet
        ) {
            tekrarsizArr[i]=each; // tekrarsizArr'in i. elementine each'i atayaca��z
            i++;                  // for each loopta index otomatik artmad��� i�in biz kendimiz manuel art�rd�k
                                  // for each loop'u indexli hale getirdik.
        }
        arr=tekrarsizArr; // tekrarsizArr'yi kendi arr mize atad�k
        System.out.println("Bizim array'in son hali : " + Arrays.toString(arr));
        // Bizim array'in son hali : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
