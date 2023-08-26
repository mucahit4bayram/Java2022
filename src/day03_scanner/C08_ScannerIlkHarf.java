package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {

        // kullan�c�dan ismini al�p ilk harfini b�y�k harf olarak yazd�r�n

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        /* java scanner class'�nda nextChar() method'u yoktur.
           bunun yerine String olarak ilk kelimeyi al�p
           onun da ilk harfini alabiliriz
         */

        char ilkHarf = scan.next().toUpperCase().charAt(0); //charAt da ilk harfin indexi 0 d�r
        // lower k���k harf, upper b�y�k harf yapt�r�r.


        System.out.println("Ismin ilk harfi : " + ilkHarf);

        /*
        eger charAt(0) yazdiktan sonra . koyarsak methodlar gelmez
		cunku charAt(0) methodu kullanilinca variable'imizi char yapmis oluruz
		char primitive data tipindedir ve
		primitive data tipleri method'lara sahip degildir
         */

    }
}
