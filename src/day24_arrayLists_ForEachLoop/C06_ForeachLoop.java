package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {

        /*
        bir loop s�ras�nda, s�ralamayla ilginiz yoksa maksad�n�z bir array yada bir list'teki t�m elementlere ula�maksa
        for each loop �ok iyi bir y�ntem. (index laz�m de�ilse)
         */

        int[] arr ={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        // array'deki tum elemanlari iceleyelim, tek sayi olanlari list'e atayalim
        /*
          1- gelecekler ne ===> integer
          2- loop icinde ne isim verdigim
          3- nerden aldigim
         */

        for (int each: arr  // arr array'ine git her bir integer'� al, bana getir. s�ralama �nemli de�il
            ) {
            if (each%2==1){ // her gelen say�y� kontrol edece�iz, tek ise listeye ekleyece�iz
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