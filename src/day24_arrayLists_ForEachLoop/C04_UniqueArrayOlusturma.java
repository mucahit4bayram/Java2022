package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {

        // Soru 2) Verilen bir array�deki tekrar eden elementleri tek bir defa barindiran
        // yeni bir array olarak donduren bir method olusturun

        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};

        // methodla yapmam�z� ve unique elementlerden olu�an yeni bir array d�nd�rmemizi istiyor
        // bize bir array getirecekse onu kaydedecek bir variable olu�turmal�y�z

        int[] uniqueArray=uniqueArrayOlustur(arr);
        // unique ad�nda integer bir array olu�turduk.
        // method'dan gelen de�ere atayaca��z argument olarak arr yazd�k.
        // var olan array'i yollayaca��z, method bize unique yap�p geri g�nderecek

        System.out.println(Arrays.toString(uniqueArray)); // [1, 2, 3, 4, 5, 6, 9]
    }
    public static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));         // [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]
        // array'i olu�turabilmemiz i�in unique elementlerin say�s�n� bilmemiz laz�m
        // �nce yeni bir list olu�tural�m  ===> benzersizList

        List<Integer> benzersizList = new ArrayList<>();

        // for loop olu�turuyoruz ve array'in uzunlu�una kadar gidiyoruz
        // (arr[i] != arr[i+1]) yanindaki elemente esit de�ilse
        // benzersizList.add(arr[i]); listeye ekliyororuz

        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] != arr[i+1]){       // yandaki ile ayn� olmayanlar� alaca��z.
                benzersizList.add(arr[i]);
            }
        }
        System.out.println(benzersizList); // [1, 2, 3, 4, 5, 6]
        // loop bitti�inde benzersizList'imiz olu�mu� oluyor. benzersiz list ==> 1,2,3,4,5,6,(9)'u almad� (length-1 den dolay�)
        // ama bizden array istiyor.

        // !!! (arr[i] != arr[i+1]) dedi�imizde, hata almamak i�in ===> arr.length-1 e kadar kontrol ettik.
        // !!! dolay�s�yla son elementi kontrol etmedik.
        // son elementi kontrol edip, yoksa listeye eklememiz gerekiyor.
        if (!benzersizList.contains(arr[arr.length-1])){
            benzersizList.add(arr[arr.length-1]);
        }

        // benzersiz list ==> 1,2,3,4,5,6,9
        // benzersiz listenin size bilgisini kullanarak bir array olusturduk
        int[] tekrarsizArr=new int[benzersizList.size()];

        // benzersiz listedeki tum elemanlari, yeni array'e atadik
        for (int i = 0; i < tekrarsizArr.length ; i++) {
            tekrarsizArr[i]= benzersizList.get(i);
        }
        // olusturdugumuz yeni array'i main method'a dondurduk
        return tekrarsizArr;
    }
}