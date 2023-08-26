package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_OrtakElemanlariBulma {
    public static void main(String[] args) {

        // Soru 3: iki String array olusturunuz ve bu array�lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
        // Sonucu ekrana yazdiriniz. Ortak eleman yoksa ekrana �Ortak eleman yok� yazdiriniz

        String[] arr1={"Ali","Veli","Can","Ayse"};
        String[] arr2={"Ali","Hasan","Ayse","Enes"};

        List<String> ortakIsimler=new ArrayList<>(); // ortakIsimler diye bir list olu�turduk. ortak olanlar� buna ataca��z.

        for (String each1: arr1
            ) {
            for (String each2:arr2
            ) {
                if (each1.equalsIgnoreCase(each2)){
                    ortakIsimler.add(each1);
                }
            }
        }
        if (ortakIsimler.isEmpty()){
            System.out.println("Hic ortak eleman yok");
        } else {
            System.out.println("her iki arraydeki ortak isimler : " + ortakIsimler); // [Ali, Ayse]
        }
        System.out.println(Arrays.toString(arr1)); // [Ali, Veli, Can, Ayse]
        System.out.println(Arrays.toString(arr2)); // [Ali, Hasan, Ayse, Enes]

        //------------------------------------------------

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i].equalsIgnoreCase(arr2[j])) {
//                    ortakIsimler.add(arr1[i]);
//                }
//            }
//
//        }
//        if (ortakIsimler.isEmpty()) {
//            System.out.println("Hic ortak eleman yok");
//        }else {
//            System.out.println("her iki arraydeki ortak isimler : " + ortakIsimler); // [Ali, Ayse]
//
//        }
//        System.out.println(Arrays.toString(arr1)); // [Ali, Veli, Can, Ayse]
//        System.out.println(Arrays.toString(arr2)); // [Ali, Hasan, Ayse, Enes]

    }
}
