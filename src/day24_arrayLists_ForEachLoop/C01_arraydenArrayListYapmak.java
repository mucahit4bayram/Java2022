package day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_arraydenArrayListYapmak {
    public static void main(String[] args) {

        String[] arr = {"Ismail","Nurullah","Fatih"};
        /*
        uzun listeler olu�turmam�z gerekti�inde tek tek eklemek yerine array olu�turup, bunlar� list'e �evirmek
        daha pratik olabilir. iki yontemimiz var;
        1- loop ile array'daki t�m elementlerei list'e atabiliriz.
        2- Arrays.asList() kullanabiliriz.
           Ancak bu method'un 2 tane k�t� yan etkileri var
           - Arrays class'� kullan�ld��� i�in array �zellikleri ge�erli olur.
             dolay�s�yla list'te olan add, remove gibi size'i de�i�tiren method'lar bu �ekilde olu�turulan list'lerde
             kullan�lmaz

           - kaynak olan array ile �r�n olan list �zde�le�tirilir
             birinde yap�lan dei�iklik, otomatik olarak di�erine de i�lenir.
         */

        List<String> sinifList = Arrays.asList(arr);
        System.out.println(sinifList); // [Ismail, Nurullah, Fatih]

        // 1. yan etki;

        // sinifList.add("Erdi"); // UnsupportedOperationException
        // sinifList.remove(1); // UnsupportedOperationException

        // 2. yan etki;
        arr[1] ="Emre";
        System.out.println("degisim sonrasi array : "+Arrays.toString(arr)); //  [Ismail, Emre, Fatih]
        System.out.println("Arry'i degistirince list : " + sinifList);       //  [Ismail, Emre, Fatih]

        sinifList.set(0,"Utku");
        System.out.println("List'i degistirince list : " + sinifList);             // [Utku, Emre, Fatih]
        System.out.println("List'i degistirince array : " + Arrays.toString(arr)); // [Utku, Emre, Fatih]


        /*
        List'lerde primitive data d�rleri kullan�lam�yor. E�er, Array; int, boolean, short... gibi primitive data
        t�r�nde ise <  > burada olu�turmam�za izin vermez, wrapper class'lar�n� tercih edersek kabul eder.
         */
    }
}
