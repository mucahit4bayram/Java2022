package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        /*
        Array : Ayn� data t�r�ndeki birden fazla de�er veya objeyi bar�nd�rabilen Java objeleridir.

        Array�lere kadar primitive data turleri ve String kullandik. Ancak bu data turlerine sadece bir deger alabiliyordu.
        Oysa gelismis bir uygulamada listeler olusturmamiz ve bunlari yonetmemiz gerekir.

        Ornegin bir okul uygulamasi yapacak olsak, sinif listeleri, ogretmen ve ogrenci listeleri, notlar vb..
        Liste olarak tutmamiz gereken bir cok data olacaktir.

        Java, birden fazla veriyi store edebilen farkli yapilar olusturmustur.
        Bunlardan hangisini kullanacagimiza yapacagimiz uygulamadaki ihtiyaclara gore karar veririz.



        1 - Bir variable'in array oldu�unu belirtmek i�in [] kullan�l�r.
            int sayi3[]={5,6,7,10}; int de�erler bar�nd�ran bir array

        2 - Bir array olu�tururken bar�nd�raca�� data t�r� ve ka� data bulunduraca�� belirtilmelidir.
            int sayi3[] = {5,6,7,10}; (int data t�r�nde 4 data bar�nd�r�r.)

            De�erleri ba�tan eklemesek bile ka� data koyaca��m�z� belirtmemiz gerekir.
            int sayi5[] = new int[6]; (int data t�r�nde 6 data bar�nd�r�r.)

            De�erleri ba�tan eklemezsek Java istedi�imiz uzunluktaki bir array olu�turacak ve t�m elemanlara default
            de�erler  atayacakt�r.
            [0,0,0,0,0,0]

            Default de�erler;
            - say�sal datalar i�in    : 0,
            - boolean i�in            : false,
            - char i�in               : '',
            - String i�in             : null, de�erleridir.

         3- Array olu�turulurken uzunlu�u belirtilir ve bu uzunluk array olu�turulduktan sonra de�i�tirilemez.

            �NEML� NOT : Bu �zellik sebebiyle, bir array olu�turulduktan sonra var olan datalar update edilebilir ancak;
            var olan datalara yeni bir data eklemek veya varolan datalardan birini tamamen silmek, (array'in uzunlu�unu
            de�i�tirece�i i�in) m�mk�n de�ildir.

         4- Bir array'in elemanlar�na ula�mak ve update etmek i�in index kullan�l�r.

            int sayi3[] = {5,6,7,8,10};

            sayi3[2] = 4; // sayi3 array'inin 2. indexini 4 yap,
            sayi3[0] = 1; // sayi3 array'in 0. indexini 1 yap,

            [1, 6, 4, 10]

            Bir array'da olmayan bir index ile i�lem yapmak isterseniz exception olu�ur.
            sayi3[5] = 5; (Exception in thread "main" java.lang...)

         5- Bir array'i veya elemanlar�n� yazd�rmak,

            Array non-primitive bir data (obje)dir ve �o�u non-primitive data gibi array'lar de direk yazd�r�lamaz,
            ancak Java'n�n olu�turdu�u Arrays class'indan yard�m al�narak yazd�r�labilir.

            int sayi3[] = {5,6,8,10};
            System.out.println(sayi3);                   // [I@2752f6e2] referans de�eri verir
            System.out.println(Arrays.toString(sayi3));  // [5, 6, 8, 10]

            Array elemanlar� ise (data t�r�ne ba�l� olarak) direk yazd�r�labilir.
            System.out.println(sayi3[2]);   // 8
            System.out.println(sayi3[1]);   // 6

         6- Bir String'i array'a �evirmek;

         */
            String str = "Java cok guzel";                       // par�alara b�lmek istersek, (split methodu kullan�l�r)
            String[] kelimeler = str.split(" ");            // kelimelere ay�rmak
            System.out.println(Arrays.toString(kelimeler));      // [Java, cok, guzel]

            String[] kelimeler2 = str.split("a");           // a lardan ay�rma
            System.out.println(Arrays.toString(kelimeler2));     // [J, v,  cok guzel]

            String[] kelimeler3 = str.split("cok");         // cok dan ay�rma
            System.out.println(Arrays.toString(kelimeler3));     // [Java ,  guzel]

            String[] kelimeler4 = str.split("");            // harflere ay�rma
            System.out.println(Arrays.toString(kelimeler4));     // [J, a, v, a,  , c, o, k,  , g, u, z, e, l]



        int sayilar [] = new int[3];
        System.out.println(sayilar); // [I@57829d67 referans, bilgisayardaki ram'in yerini g�steriyor

        // non-primitive data t�r�ndeki datalar� her zaman direk yazd�ramayabiliriz.
        // Array'i yazd�rmak istersek Arrays class'dan yard�m isteriz ### (toString) ###

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0]

        sayilar[2] = 10;
        sayilar[0] = 5;
        sayilar[1] = 3;

        System.out.println(Arrays.toString(sayilar)); // [5, 3, 10]  // index'e g�re s�ralad�

        String sinifList[] = {"Ali","Ay�e","Ahmet"};
        System.out.println(Arrays.toString(sinifList)); // [Ali, Ay�e, Ahmet]

        sinifList[1] = "Hasan";

        System.out.println(Arrays.toString(sinifList)); // [Ali, Hasan, Ahmet]

        System.out.println(sinifList[1]); // Hasan
        System.out.println(sinifList[0]); // Ali
    }
}
