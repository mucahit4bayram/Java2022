package day24_arrayLists_ForEachLoop;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C09 {
    public static void main(String[] args) {

        // Soru 3: iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
        // Sonucu ekrana yazdiriniz. Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String[] arr1={"Ali","Veli","Can","Ayse"};
        String[] arr2={"Ali","Hasan","Ayse","Enes"};

        Set<String> set1= new HashSet<>();
        Set<String> set2= new HashSet<>();

        for (String each: arr1
             ) {
            set1.add(each);

        }
        System.out.println(set1); // [Can, Veli, Ayse, Ali]

        for (String each: arr2
        ) {
            set2.add(each);

        }
        System.out.println(set2); // [Hasan, Ayse, Enes, Ali]

        // System.out.println(set1.retainAll(set2));
        // System.out.println(set1); // [Ayse, Ali]

        System.out.println(set1.removeAll(set2));
        System.out.println(set1); // [Can, Veli]
        System.out.println(set2); // [Hasan, Ayse, Enes, Ali]


    }
}
