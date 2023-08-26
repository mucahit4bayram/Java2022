package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C06_01_ArrayListOzet {
    public static void main(String[] args) {

        /*                                /-/-/ ARRAY L�ST /-/-/

        ArrayList : ��e koleksiyonunu depolamak i�in, dinamik olarak boyutland�r�lm�� array'lerdir.

        Baz� s�n�rlamalar array'den kaynakl� olarak arraylist'e de ge�mi�tir.

        Array'ler elementleri depolamak ve istedi�imiz elementlere ula�mak, update etmek, listelemek gibi bir �ok
        i�lemi rahatl�kla yapmam�za imkan tan�r.
        Ancak element ekleme veya silemeye izin vermediklerinden kullan�c�lar�n �ok tercih etmedi�i bir yap�d�r.
        Array'lerin uzunluklar� de�i�tirilemiyordu. Array'in uzunlu�unu de�i�tirmek istersek d�n��t�rmemiz gerekiyordu.

           int [] arr = {3,4,5,6};

           �rne�in yukar�daki array'e 7 eleman�n� eklemek istersek;
                * java be�inci eleman� bu array'e eklemeyi kabul etmez.
                * d�n���m uygulamam�z gerekiyor.
                * �ncelikle yeni bir array olu�turmal�y�z.

           int [] yeniArr = new int[arr.length+1];      // 5 elementli yeni bir array olu�turduk.
                                                        // eski array'in uzunlu�unu 1 artt�rd�k.

                * new int [] array olu�turdu�umuz i�in java default de�erler atar. int oldu�u i�in [0, 0, 0, 0, 0]
                * for loop kullanarak eski elementleri yeni array'e ta��mam�z gerekiyor.
                * 4 eleman� ta��d�ktan sonra, 5. element (4.indexteki) in yerine 7 eleman�n� ekliyoruz.

            for (int i = 0; i < arr.length; i++) {
                yeniArr [i] = arr[i];               // eski array'in elemanlar�n� yeni array'e ta��d�k
            }
            yeniArr [yeniArr.length-1] = 7;         // 7 eleman�n�, 5. index'e ekledik

            arr = yeniArr;                          // eski array'in yeni array'e e�it olmas� i�in atama yapt�k.
         */

            int [] arr = {3,4,5,6};

            int [] yeniArr = new int[arr.length+1];

            for (int i = 0; i < arr.length; i++) {
                yeniArr [i] = arr[i];
            }
            yeniArr [yeniArr.length-1] = 7;
            arr = yeniArr;

            System.out.println(Arrays.toString(arr)); // [3, 4, 5, 6, 7]

            // *** bu array (arr) ayn� isimde ama yeni, farkl� bir array'dir.!!!

        /*
        JAVA, ARRAY'LERDEK� bu dezavantaj� ortadan kald�rmak i�in COLLECTIONS FRAMEWORK'u alt�nda LIST INTERFACE'ini
        olu�turmu�tur.

        //-------------------
        Java Collections Nedir?

        �o�u zaman programlar�m�z� geli�tirirken tek bir �ge yerine �gelerden olu�an diziler tan�mlamak isteriz.
        Bu tan�mlamalarda e�er veri tipimiz ayn� ise, eleman say�m�z belliyse standart bir dizi tan�mlamas�
        ger�ekle�tiriyorduk.
        S�z konusu de�erlerin belirsizli�i durumunda ise collection framework i�erisinde bulunan
        interfaceler ve bu interfacelerden olu�an kurgulardan faydalan�r�z.

        Bu olu�umlar�n en temelinde List, Set ve Map olmak �zere �� tip yer almaktad�r.
        Bu kavramlardan Set ve List, Java Collection interface�ini kullan�rken Map kavram� ise ayr� bir t�r olarak
        bu yap�dan ayr�l�r. Bu yap�lar�n b�t�n�n� ele ald���m�zda ortaya Java Collection Framework ��kmaktad�r.

        Konumuzu fazla da��tmadan as�l sorumuz olan �Java Collections Nedir� sorusuna d�necek olursak;
        verileri saklamak, saklanan veriyi �ekmek, i�lemek ve zaman zaman saklad���m�z yerde �e�itli verileri aramak
        i�in collections kullan�r�z.

        Java Interface Nedir?

        Java�da Interface kullan�ld��� zaman i�erisinde sadece kendi b�nyesinden t�reyen alt s�n�flar�n kullan�lmas�,
        doldurmas� zorunda oldu�u i�i bo� bir metot tan�mlamas� ger�ekle�tirilen yap�lard�r.
        Biraz daha ak�lda kal�c�l��� artt�rmak i�in Java Interface Nedir sorusuna cevap olarak kendisinden �retilen
        s�n�flar i�in bir k�lavuz, yol g�sterici veya ger�ekle�tirilmesi gereken g�revler b�t�n� gibi �rneklendirerek
        bu soruyu cevaplayabiliriz.

        //---------------------

       - ArrayList temelde array yap�s�nda olu�turulmu� oldu�undan, esnek uzunlu�a sahip bir array gibi d���n�lebilir.

       - Bir ArrayList olu�turmak i�in data t�r� <> i�erisine yaz�lmal�d�r.

                List<String> isimler = new ArrayList<>();

              *** List bir interface oldu�undan e�itli�in sa��nda List de�il, bir Class olan ArrayList kullan�lmal�d�r.

              *** E�itli�in sa��nda <> i�erisine data t�r� yaz�labilir ama yaz�lmas� zorunlu de�ildir.

              *** Data t�r� olarak, primitive data t�rlerini kabul etmez, Wrapper Class'lar kullan�labilir.

              *** Data t�r� olarak <Object> yazarsan�z, farkl� data t�rlerinden elemanlar� kullanman�za izin verir,
                  ancak bu durumda List kullan�l�rken �ok fazla cast i�lemi yapman�z gerekece�inden
                  �ok tercih edilen bir�ey de�ildir.

         // ----------------------- //

         ARRAYLIST DEZAJANTALARI :

         * ArrayList temelde bir array oldu�u i�in elementleri tek tek eklemek zorundas�n�z.

           Element eklemek i�in biz bir �ey yapmak zorunda olmasak da arka planda Java element ekleyebilmek i�in
           her seferinde belli i�lemler yapmak zorunda oldu�undan ArrayList olu�tururken t�m elementleri toplu olarak
           girmenize izin vermez.

           Var olan bir ArrayList'e ba�ka bir Collection eklemek veya ba�ka bir Collection �yelerini silmek istedi�imizde
           uzunluk ba�tan hesaplanabildi�i i�in ArrayList bu t�r ekleme ve silme yapmam�za izin verir.

         */
            List<String> isimler1 = new ArrayList<>();
            List<String> isimler2 = new ArrayList<>();
            List<String> isimler3 = new ArrayList<>();

            isimler1.add("Ali");
            isimler1.add("Veli");
            System.out.println(isimler1); // [Ali, Veli]

            isimler2.add("Ayse");
            isimler2.add("Fatma");
            System.out.println(isimler2); // [Ayse, Fatma]

            isimler3.add("Ayse");
            isimler3.add("Veli");
            System.out.println(isimler3); // [Ayse, Veli]

            isimler1.addAll(isimler2);
            System.out.println(isimler1); // [Ali, Veli, Ayse, Fatma]

            isimler1.removeAll(isimler3);
            System.out.println(isimler1); // [Ali, Fatma]
        //--------------------------------------------------------------------------//
        /*
        ARRAY'DEN ARRAYLIST YAPMA :  /-/-/  FOR-EACH LOOP Kullanarak List olu�turma /-/-/

        * ArrayList olu�tururken elementleri tek tek eklemek istemezseniz, �nce bir array olu�turup sonra bu array'i
          ArrayList yapmayi terch edebilirsiniz.

          - �zellikle fazla elementi olan bir liste olu�turmam�z gerekti�inde, elementleri tek tek eklemek �ok zahmetli
            olacakt�r.

          - Array bu konuda daha kullan��l� oldu�undan, uzun listeleri �nce Array olarak olu�turup sonra ArrayList'e
            �evirmek daha avantajl� olacakt�r.

            �rne�in a�a��daki array'i bir list olarak olu�turmak i�in 17 satir add() kullanmak gerekir.

                int [] arrx = {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6};

            Bunun yerine bo� bir liste olu�turup FOR-EACH LOOP ile t�m elementleri bu list'e ekleyebilirsiniz.

         */
            int [] arrx = {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6};

            List<Integer> sayilarx = new ArrayList<>();
            for (Integer each:arrx
                 ) {
                sayilarx.add(each);

            }
            System.out.println("sayilarx : " + sayilarx); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6]

        /*
        ARRAY'DEN ARRAYLIST YAPMA :  /-/-/ ARRYS.ASLIST() METHOD'U Kullanarak List olu�turma /-/-/

        * Array'den ArrayList yapmak i�in Arrays.asList() method'u da kullan�labilir ancak bu method'un
          2 B�Y�K DEZAVANTAJI oldu�unu bilmemiz gerekir.

            String [] strarr = {"a","b","c"};
            List<String> harfler = Arrays.asList(strarr);
            System.out.println("harfler : " + harfler); // [a, b, c]

          1-) Bu method ile olu�turlan ArrayList'ler, array'in negatif taraf� olan sabit uzunluk kural�na tabi olurlar
              yani bu listelere ekleme veya silme yapamazs�n�z

                harfler.add("f");
                harfler.remove ("a");

              Ekeleme veya remove yapmak istedi�imizde compile time'de Java problemi g�remez, ��nk� yap�lan i�lem
              syntax a��s�ndan do�rudur. Fakat �al��t�rd���m�zda exception ile kar��la��r�z.

              (Harfler ArrayList'ini olu�tururken, arrays class'�ndan yard�m ald���m�z i�in
              buna array gibi muamele yap�yor.
              Yani her ne kadar ArrayList olsa da, array'in en k�t� huyu olan uzunlu�unun de�i�memesidir.
              Dolay�s�yla array'lerin add ve remove �zelli�inin olmamas� ArrayList'e de ge�iyor.)


          2-) B�y�k dezavantaj da her ne kadar kaynak olarak kulland���m�z strArr ve olu�turdu�umuz yeni harfler listesi
              farkl� objeler olsa da;
              Java bunlar� tek bir yap� gibi g�r�r ve birinde yapt���m�z de�i�iklikleri otomatik olarak di�erine de i�ler.

              Baslangicta strArr : [a, b, c]
              Baslangicta harfler : [a, b, c]

              strArr[0] = "e";                               // arr nin 0. index'indeki eleman� de�i�tirdik

              Array'i update etti�imizde strArr : [e, b, c]
              Array'i update etti�imizde harfler : [e, b, c]
                                                             // !!! sadece array'de de�il, harfler arralist'inde de
                                                             // de�i�iklik yapt�.!!!

              harfler.set(2,"t");                            // list in 2. eleman�n� "t" yapal�m

              List'i update etti�imizde harfler : [e, b, t]
              List'i update etti�imizde strArr : [e, b, t]
                                                            // de�i�ikli�i yine hem arr'ye, hem de arralist'e uygulad�.
         */


        /*    //~~~~~~~~~~~~~~~~~~~~~~~ARRAYLIST METHODS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

        ArrayList Methodlar� : ArrayList pek�ok i�lemi kolayca yapabilece�imiz methodlara sahiptir.

        - Bir ArrayList'i yazd�rmak kolayd�r.

        List<String> isimler = new ArrayList<>();
                                                // Array'i yazd�rmak i�in Arrays class'�ndan yard�m almam�z gerekiyordu.
                                                // (System.out.println(Arrays.toString(arr));

        System.out.println(isimler);         // List'in ad�n� yazmam�z yeterli (isimler)
                                             // [] (yeni olu�turdu�umuz i�in, i�inde hi� element olmad���ndan ��kt� bo�)
        isimler.add("Ali");
        isimler.add("Veli");
        System.out.println(isimler);        // [Ali, Veli]



        1-add() methodu : list e eleman eklemek icin kullanilan methoddur.
                          index li de eklenebilir index sizde eklenebilir.

        2-set() methodu : var olan bir elemani baskasiyla degistirmeye yarar.

        3-remove() methodu : belli bir eleman� silmeye yarar iki sekilde yapilir.
            i)--index kullanarak siler

            *** remove (index) method'u, silinen eleman� d�nd�r�r.
                Yani method'u System.out.println(hayvan.remove(1)) i�inde kullan�rsak silinen eleman� ekrana yazd�r�r.

            ii)--direk elaman belirtilerek, kullanilan ilk yerdeki elemani siler

                *** Not: Index�siz remove( ) method�u true veya false dondurur.
                    System.out.println(hayvan.remove(�kedi�)); //true yani kedi eleman olarak vardi ve sildim
                    System.out.println(hayvan.remove(�tavsan�)); // false yani tavsan eleman olarak yoktu
                                                                 // dolayisiyla silemedim


        4-sort() methodu : elemanlari a dan z ye buyukten kucuge naturel order seklinde siralar.
                           Bunu yaparken """"Collections.sort()"""" seklinde yapar.

        5-contains() methodu : list te bir elemanin var olup olmadigini kontrol eder true ve false olarak dondurur.

        6-get() methodu : List te istenen index teki elemanlari getirir.

        7-size() methou : kac eleman oldugunu verir.uzunlugu da diyebiliriz.
                          Onemli noktasi array in uzunlugunu length verirken Array list te size verir.

        8-clear() methodu : ad� ustunde temizlik yapar tum elemanlari siler.

        9-isEmpty methodu : List in ici bos ise true, dolu ise false olarak dondurmeye yarar.

        10-equals() methodu : List lerin yani birden fazla list in icindeki elemanlari kiyaslar
                              Esit ise true degilse false dondurur...

         */

        // Soru uzerinde tum methodlar� g�sterecek olursak...

        // SORU 1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.

        List<String> list1 = new ArrayList<>();

        list1.add("A");
        list1.add("C");
        list1.add("E");
        list1.add("F");

        System.out.println("CEVAP 1 : " + list1); // [A, C, E, F]

        // 1. sorunun devaminda sunlar isteniyor
        // indexsiz add() methodunu kullanarak, B yi ekleyiniz.
        // indexli add() methodunu kullanarak, L yi 1 numarali indexe ekleyiniz.
        // ArrayList i ekrana yazdiriniz, list boyle olmali; A, L, C, E, F, B.

        list1.add("B");
        System.out.println(list1); // [A, C, E, F, B]

        list1.add(1, "L");
        System.out.println(list1); // [A, L, C, E, F, B]

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // SORU 2) set() methodu kullanarak, E yi D yapiniz.
        // ArrayList i ekrana yazdiriniz, list boyle olmali; A, L, C, D, F, B.

        list1.set(3, "D");
        System.out.println("CEVAP 2 : " + list1); // [A, L, C, D, F, B]

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // SORU 3) remove() methodu kullanarak, F yi siliniz.
        // ArrayList i ekrana yazdiriniz, list boyle olmali; A, L, C, D, B.

        // Remove un 2 yontemle kaldirilma yolu var. bunlari uygulayalim.

        // 1. yontem ;

        // list1.remove("F"); // bunu aktif edince index degistiginden dolayi bu sekild uygulamis olduk.
        // System.out.println("list1.remove("F") = " + list1.remove("F")); // list1.remove("F") = true
        // System.out.println(list1); // [A, L, C, D, B]

        // 2. yontem ;

        list1.remove(4);
        //System.out.println("list1.remove(4) = " + list1.remove(4)); // list1.remove(4) = F
        System.out.println("CEVAP 3 : " + list1); // [A, L, C, D, B]

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // SORU 4) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        // ArrayList i ekrana yazdiriniz, list boyle olmali; A, B, C, D, L.

        Collections.sort(list1);
        System.out.println("CEVAP 4 : " + list1); // [A, B, C, D, L]

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // SORU 5) contains() methodu kullanarak, L nin list de var oldugunu ve M nin list de var olmadigini dogrulayiniz.

        boolean sonuc = list1.contains("L");
        boolean sonuc1 = list1.contains("M");

        System.out.println(sonuc); // true
        System.out.println(sonuc1); // false

        // 2. yol ;

        System.out.println(list1.contains("L")); // true
        System.out.println(list1.contains("M")); // false

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // SORU 6) get() methodu kullanarak istenen 2. indexi dondurur

        System.out.println("CEVAP 6 : " + list1.get(2)); // C

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // SORU 7) size() methodu kullanarak, list in kac eleman oldugunu ekrana yazdiriniz.

        System.out.println("CEVAP 7 : " + list1.size()); // 5

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // SORU 8) clear() methodu kullanarak, list deki tum elemanlari siliniz.

        list1.clear();
        System.out.println("CEVAP 8 : " + list1); // []

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // SORU 9) isEmpty() methodu kullanarak, list deki tum elemanlarin silindigini
        // dogrulayiniz

        System.out.println("CEVAP 9 : " + list1.isEmpty()); // true

        // Soru bitti fakat kalan methodu hatirlatma icin yaziyoruz...

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // SORU 10) equals() methodu iki ayri list te ki elamanlari kiyaslayip true veya false
        // dondurur..

        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();

        // iki bos list olusturup esit mi diye sorduk.
        // Bos oldugu icin bize true dondurdu...
        System.out.println("CEVAP 10 : " + first.equals(second)); // true

        // Sonraki adimda first list icine a harfi ekleyip sorunca false dondurdu.
        first.add("a"); // first'e a harfi ekledik.
        System.out.println(first.equals(second)); // false
        System.out.println(first); // [a]
        System.out.println(second);// []

    }


}
