package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class M03_Iterator {
    public static void main(String[] args) {
        List<Integer> liste= new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); // [10, 20, 30]
        // liste'deki tum elementleri INDEX KULLANMADAN 3 artirin

        for (Integer each: liste
        ) {
            each+=3;
            System.out.print(each + " "); // 13 23 33
        }
        System.out.println("");
        System.out.println(liste);        // [10, 20, 30]

        /* Java index yapisi olmayan collection'lardaki elementlere ulasmak veya degistirmek icin
         Iterator interface'ini olusturmustur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degil.
        bunun yerine bize iterator döndüren  liste.iterator() method'unu kullaniyoruz
         */

        System.out.println(liste); // [10, 20, 30]

        Iterator it1 = liste.iterator();
        System.out.println(it1.next()); // 10
        System.out.println(it1.next()); // 20
        System.out.println(it1.next()); // 30
        //System.out.println(it1.next()); // 30'dan sonra element kalmadigindan next() RTE verir

        // Iterator'da geri donus yok, adim adim sona ulastiktan sonra
        // basa gelmek isterseniz yeniden bir iterator olusturmaniz gerekir
        // [10, 20, 30]

        Iterator it2= liste.iterator();

        // yeni it2'yi kullanarak listenin tum elementlerini silelim

        it2.next();  // iteratro'u bir saða kaydýrýp ilk elementi [10] üzerine aldý, yüklendi..
        it2.remove();// remove yapýnca [10]'u sildi. ==> [20, 30] kaldý
        it2.next();  // [20]'i üzerine aldý
        it2.remove();// [20]'i sildi. ==> [30] kaldý
        it2.next();  // [30]'u üzerine aldý.
        it2.remove();// [30]'u sildi. ==> []

        System.out.println(liste);  // iterator ile elementleri gezip, remove yapinca
                                    // liste kalici olarak degisti
                                    // index yapýsýný kullanmadan listedeki tüm elementleri kalýcý olarak sildik.

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste : "+liste);

        Iterator it3= liste.iterator();
        while(it3.hasNext()){ // iterator yanýnda olduðu müdettçe bunu devam ettir
            it3.next();       // bir yana geç
            it3.remove();     // geçtiðini sil
        }
        System.out.println("loop'dan sonra liste : "+liste);
        /*
         Goruldugu gibi Iterator kullanarak yapabildigim
         1- tum collection elementlerini yazdirmak
         2- tum collection elementlerini silmek
         Bu da bize yetmez
         */
    }
}
