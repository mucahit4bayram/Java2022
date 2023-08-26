package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {

    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Listenin boyutu : " + sayilar1.size()); //3

        sayilar1.add(2);              // 2 yi ekledik
        sayilar1.addAll(sayilar1);    // 5,3,2,2 yi tekrar ekledik
        System.out.println(sayilar1); // [5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println("Listenin yeni boyutu : " + sayilar1.size()); // 8

        sayilar1.set(2,8);            // (2. indexi 8 yap dedik)
        System.out.println(sayilar1); // [5, 3, 8, 2, 5, 3, 2, 2]

        System.out.println(sayilar1.set(0,12)); // hem 0. indexteki 5'i 12 yapacak,
                                                // hemde iþlemi println içerisinde yaptýðýmýz için sildiði elemaný gösterir.
                                                // 5

        System.out.println(sayilar1);           // [12, 3, 8, 2, 5, 3, 2, 2]
                                                // tekrar yazdýrdýðýmýzda listenin son halini yazdýrdý.

        /*
         set method'u istenen index'deki eski elementi silip, yerine verdigimiz yeni elementi set eder.

         eger eski elementi silmek istemiyorsak, add(index,deger) method'unu kullanabiliriz

         set() sildigi eski elementi de bize dondurur
         */

    }
}
