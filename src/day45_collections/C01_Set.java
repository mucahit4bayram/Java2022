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

        int[] tekrarsizArr= new int[tekrarsizSet.size()]; // tekrarsizSet in uzunluðu kadar boþ bir arr oluþturduk

        //*** Set'teki elementleri arr ye atayabilmemiz için foreach loop olmaz, çünkü array index ister.
        //*** for loop kullansak set'ten element alamayýz. çünkü sette index yapýsý yoktur.
        //*** foreach loop'u oluþturup setten elementleri alacaðýz, ama indexi kendimiz oluþturacaðýz.

        int i=0; // kendi indeximizi oluþturduk
        for (Integer each:tekrarsizSet
        ) {
            tekrarsizArr[i]=each; // tekrarsizArr'in i. elementine each'i atayacaðýz
            i++;                  // for each loopta index otomatik artmadýðý için biz kendimiz manuel artýrdýk
                                  // for each loop'u indexli hale getirdik.
        }
        arr=tekrarsizArr; // tekrarsizArr'yi kendi arr mize atadýk
        System.out.println("Bizim array'in son hali : " + Arrays.toString(arr));
        // Bizim array'in son hali : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
