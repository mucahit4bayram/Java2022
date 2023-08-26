package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        /*
        Array : Ayný data türündeki birden fazla deðer veya objeyi barýndýrabilen Java objeleridir.

        Array’lere kadar primitive data turleri ve String kullandik. Ancak bu data turlerine sadece bir deger alabiliyordu.
        Oysa gelismis bir uygulamada listeler olusturmamiz ve bunlari yonetmemiz gerekir.

        Ornegin bir okul uygulamasi yapacak olsak, sinif listeleri, ogretmen ve ogrenci listeleri, notlar vb..
        Liste olarak tutmamiz gereken bir cok data olacaktir.

        Java, birden fazla veriyi store edebilen farkli yapilar olusturmustur.
        Bunlardan hangisini kullanacagimiza yapacagimiz uygulamadaki ihtiyaclara gore karar veririz.



        1 - Bir variable'in array olduðunu belirtmek için [] kullanýlýr.
            int sayi3[]={5,6,7,10}; int deðerler barýndýran bir array

        2 - Bir array oluþtururken barýndýracaðý data türü ve kaç data bulunduracaðý belirtilmelidir.
            int sayi3[] = {5,6,7,10}; (int data türünde 4 data barýndýrýr.)

            Deðerleri baþtan eklemesek bile kaç data koyacaðýmýzý belirtmemiz gerekir.
            int sayi5[] = new int[6]; (int data türünde 6 data barýndýrýr.)

            Deðerleri baþtan eklemezsek Java istediðimiz uzunluktaki bir array oluþturacak ve tüm elemanlara default
            deðerler  atayacaktýr.
            [0,0,0,0,0,0]

            Default deðerler;
            - sayýsal datalar için    : 0,
            - boolean için            : false,
            - char için               : '',
            - String için             : null, deðerleridir.

         3- Array oluþturulurken uzunluðu belirtilir ve bu uzunluk array oluþturulduktan sonra deðiþtirilemez.

            ÖNEMLÝ NOT : Bu özellik sebebiyle, bir array oluþturulduktan sonra var olan datalar update edilebilir ancak;
            var olan datalara yeni bir data eklemek veya varolan datalardan birini tamamen silmek, (array'in uzunluðunu
            deðiþtireceði için) mümkün deðildir.

         4- Bir array'in elemanlarýna ulaþmak ve update etmek için index kullanýlýr.

            int sayi3[] = {5,6,7,8,10};

            sayi3[2] = 4; // sayi3 array'inin 2. indexini 4 yap,
            sayi3[0] = 1; // sayi3 array'in 0. indexini 1 yap,

            [1, 6, 4, 10]

            Bir array'da olmayan bir index ile iþlem yapmak isterseniz exception oluþur.
            sayi3[5] = 5; (Exception in thread "main" java.lang...)

         5- Bir array'i veya elemanlarýný yazdýrmak,

            Array non-primitive bir data (obje)dir ve çoðu non-primitive data gibi array'lar de direk yazdýrýlamaz,
            ancak Java'nýn oluþturduðu Arrays class'indan yardým alýnarak yazdýrýlabilir.

            int sayi3[] = {5,6,8,10};
            System.out.println(sayi3);                   // [I@2752f6e2] referans deðeri verir
            System.out.println(Arrays.toString(sayi3));  // [5, 6, 8, 10]

            Array elemanlarý ise (data türüne baðlý olarak) direk yazdýrýlabilir.
            System.out.println(sayi3[2]);   // 8
            System.out.println(sayi3[1]);   // 6

         6- Bir String'i array'a çevirmek;

         */
            String str = "Java cok guzel";                       // parçalara bölmek istersek, (split methodu kullanýlýr)
            String[] kelimeler = str.split(" ");            // kelimelere ayýrmak
            System.out.println(Arrays.toString(kelimeler));      // [Java, cok, guzel]

            String[] kelimeler2 = str.split("a");           // a lardan ayýrma
            System.out.println(Arrays.toString(kelimeler2));     // [J, v,  cok guzel]

            String[] kelimeler3 = str.split("cok");         // cok dan ayýrma
            System.out.println(Arrays.toString(kelimeler3));     // [Java ,  guzel]

            String[] kelimeler4 = str.split("");            // harflere ayýrma
            System.out.println(Arrays.toString(kelimeler4));     // [J, a, v, a,  , c, o, k,  , g, u, z, e, l]



        int sayilar [] = new int[3];
        System.out.println(sayilar); // [I@57829d67 referans, bilgisayardaki ram'in yerini gösteriyor

        // non-primitive data türündeki datalarý her zaman direk yazdýramayabiliriz.
        // Array'i yazdýrmak istersek Arrays class'dan yardým isteriz ### (toString) ###

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0]

        sayilar[2] = 10;
        sayilar[0] = 5;
        sayilar[1] = 3;

        System.out.println(Arrays.toString(sayilar)); // [5, 3, 10]  // index'e göre sýraladý

        String sinifList[] = {"Ali","Ayþe","Ahmet"};
        System.out.println(Arrays.toString(sinifList)); // [Ali, Ayþe, Ahmet]

        sinifList[1] = "Hasan";

        System.out.println(Arrays.toString(sinifList)); // [Ali, Hasan, Ahmet]

        System.out.println(sinifList[1]); // Hasan
        System.out.println(sinifList[0]); // Ali
    }
}
