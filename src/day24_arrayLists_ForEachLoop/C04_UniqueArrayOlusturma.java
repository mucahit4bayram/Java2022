package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {

        // Soru 2) Verilen bir array’deki tekrar eden elementleri tek bir defa barindiran
        // yeni bir array olarak donduren bir method olusturun

        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};

        // methodla yapmamýzý ve unique elementlerden oluþan yeni bir array döndürmemizi istiyor
        // bize bir array getirecekse onu kaydedecek bir variable oluþturmalýyýz

        int[] uniqueArray=uniqueArrayOlustur(arr);
        // unique adýnda integer bir array oluþturduk.
        // method'dan gelen deðere atayacaðýz argument olarak arr yazdýk.
        // var olan array'i yollayacaðýz, method bize unique yapýp geri gönderecek

        System.out.println(Arrays.toString(uniqueArray)); // [1, 2, 3, 4, 5, 6, 9]
    }
    public static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));         // [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]
        // array'i oluþturabilmemiz için unique elementlerin sayýsýný bilmemiz lazým
        // önce yeni bir list oluþturalým  ===> benzersizList

        List<Integer> benzersizList = new ArrayList<>();

        // for loop oluþturuyoruz ve array'in uzunluðuna kadar gidiyoruz
        // (arr[i] != arr[i+1]) yanindaki elemente esit deðilse
        // benzersizList.add(arr[i]); listeye ekliyororuz

        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] != arr[i+1]){       // yandaki ile ayný olmayanlarý alacaðýz.
                benzersizList.add(arr[i]);
            }
        }
        System.out.println(benzersizList); // [1, 2, 3, 4, 5, 6]
        // loop bittiðinde benzersizList'imiz oluþmuþ oluyor. benzersiz list ==> 1,2,3,4,5,6,(9)'u almadý (length-1 den dolayý)
        // ama bizden array istiyor.

        // !!! (arr[i] != arr[i+1]) dediðimizde, hata almamak için ===> arr.length-1 e kadar kontrol ettik.
        // !!! dolayýsýyla son elementi kontrol etmedik.
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