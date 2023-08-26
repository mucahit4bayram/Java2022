package day21_Arrays;

import java.util.Arrays;
import java.util.Collection;

public class C07_sort {
    public static void main(String[] args) {

        //-/-/   sort (Array de sýralama methodu)  /-/-/-/

        int []sayilar = {5,7,1,6,3,9};

        // Array'i, Arrays class'ini kullanarak natural sýralý hale getirebiliriz

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); // [1, 3, 5, 6, 7, 9]

    }
}
