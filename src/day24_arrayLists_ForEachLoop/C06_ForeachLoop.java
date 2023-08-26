package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {

        /*
        bir loop sýrasýnda, sýralamayla ilginiz yoksa maksadýnýz bir array yada bir list'teki tüm elementlere ulaþmaksa
        for each loop çok iyi bir yöntem. (index lazým deðilse)
         */

        int[] arr ={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        // array'deki tum elemanlari iceleyelim, tek sayi olanlari list'e atayalim
        /*
          1- gelecekler ne ===> integer
          2- loop icinde ne isim verdigim
          3- nerden aldigim
         */

        for (int each: arr  // arr array'ine git her bir integer'ý al, bana getir. sýralama önemli deðil
            ) {
            if (each%2==1){ // her gelen sayýyý kontrol edeceðiz, tek ise listeye ekleyeceðiz
                liste.add(each);
            }
        }
        System.out.println(liste);  // [3, 23, 9, 1]

        //----------------------------------

//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i]%2==1){
//               liste.add(arr[i]);
//            }
//        }
//        System.out.println(liste); // [3, 23, 9, 1]

    }
}