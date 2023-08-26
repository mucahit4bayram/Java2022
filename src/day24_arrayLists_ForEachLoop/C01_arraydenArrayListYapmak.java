package day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_arraydenArrayListYapmak {
    public static void main(String[] args) {

        String[] arr = {"Ismail","Nurullah","Fatih"};
        /*
        uzun listeler oluþturmamýz gerektiðinde tek tek eklemek yerine array oluþturup, bunlarý list'e çevirmek
        daha pratik olabilir. iki yontemimiz var;
        1- loop ile array'daki tüm elementlerei list'e atabiliriz.
        2- Arrays.asList() kullanabiliriz.
           Ancak bu method'un 2 tane kötü yan etkileri var
           - Arrays class'ý kullanýldýðý için array özellikleri geçerli olur.
             dolayýsýyla list'te olan add, remove gibi size'i deðiþtiren method'lar bu þekilde oluþturulan list'lerde
             kullanýlmaz

           - kaynak olan array ile ürün olan list özdeþleþtirilir
             birinde yapýlan deiþiklik, otomatik olarak diðerine de iþlenir.
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
        List'lerde primitive data dürleri kullanýlamýyor. Eðer, Array; int, boolean, short... gibi primitive data
        türünde ise <  > burada oluþturmamýza izin vermez, wrapper class'larýný tercih edersek kabul eder.
         */
    }
}
