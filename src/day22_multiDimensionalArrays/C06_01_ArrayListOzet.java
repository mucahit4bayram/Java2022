package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C06_01_ArrayListOzet {
    public static void main(String[] args) {

        /*                                /-/-/ ARRAY LÝST /-/-/

        ArrayList : öðe koleksiyonunu depolamak için, dinamik olarak boyutlandýrýlmýþ array'lerdir.

        Bazý sýnýrlamalar array'den kaynaklý olarak arraylist'e de geçmiþtir.

        Array'ler elementleri depolamak ve istediðimiz elementlere ulaþmak, update etmek, listelemek gibi bir çok
        iþlemi rahatlýkla yapmamýza imkan tanýr.
        Ancak element ekleme veya silemeye izin vermediklerinden kullanýcýlarýn çok tercih etmediði bir yapýdýr.
        Array'lerin uzunluklarý deðiþtirilemiyordu. Array'in uzunluðunu deðiþtirmek istersek dönüþtürmemiz gerekiyordu.

           int [] arr = {3,4,5,6};

           Örneðin yukarýdaki array'e 7 elemanýný eklemek istersek;
                * java beþinci elemaný bu array'e eklemeyi kabul etmez.
                * dönüþüm uygulamamýz gerekiyor.
                * öncelikle yeni bir array oluþturmalýyýz.

           int [] yeniArr = new int[arr.length+1];      // 5 elementli yeni bir array oluþturduk.
                                                        // eski array'in uzunluðunu 1 arttýrdýk.

                * new int [] array oluþturduðumuz için java default deðerler atar. int olduðu için [0, 0, 0, 0, 0]
                * for loop kullanarak eski elementleri yeni array'e taþýmamýz gerekiyor.
                * 4 elemaný taþýdýktan sonra, 5. element (4.indexteki) in yerine 7 elemanýný ekliyoruz.

            for (int i = 0; i < arr.length; i++) {
                yeniArr [i] = arr[i];               // eski array'in elemanlarýný yeni array'e taþýdýk
            }
            yeniArr [yeniArr.length-1] = 7;         // 7 elemanýný, 5. index'e ekledik

            arr = yeniArr;                          // eski array'in yeni array'e eþit olmasý için atama yaptýk.
         */

            int [] arr = {3,4,5,6};

            int [] yeniArr = new int[arr.length+1];

            for (int i = 0; i < arr.length; i++) {
                yeniArr [i] = arr[i];
            }
            yeniArr [yeniArr.length-1] = 7;
            arr = yeniArr;

            System.out.println(Arrays.toString(arr)); // [3, 4, 5, 6, 7]

            // *** bu array (arr) ayný isimde ama yeni, farklý bir array'dir.!!!

        /*
        JAVA, ARRAY'LERDEKÝ bu dezavantajý ortadan kaldýrmak için COLLECTIONS FRAMEWORK'u altýnda LIST INTERFACE'ini
        oluþturmuþtur.

        //-------------------
        Java Collections Nedir?

        Çoðu zaman programlarýmýzý geliþtirirken tek bir öge yerine ögelerden oluþan diziler tanýmlamak isteriz.
        Bu tanýmlamalarda eðer veri tipimiz ayný ise, eleman sayýmýz belliyse standart bir dizi tanýmlamasý
        gerçekleþtiriyorduk.
        Söz konusu deðerlerin belirsizliði durumunda ise collection framework içerisinde bulunan
        interfaceler ve bu interfacelerden oluþan kurgulardan faydalanýrýz.

        Bu oluþumlarýn en temelinde List, Set ve Map olmak üzere üç tip yer almaktadýr.
        Bu kavramlardan Set ve List, Java Collection interface’ini kullanýrken Map kavramý ise ayrý bir tür olarak
        bu yapýdan ayrýlýr. Bu yapýlarýn bütününü ele aldýðýmýzda ortaya Java Collection Framework çýkmaktadýr.

        Konumuzu fazla daðýtmadan asýl sorumuz olan “Java Collections Nedir” sorusuna dönecek olursak;
        verileri saklamak, saklanan veriyi çekmek, iþlemek ve zaman zaman sakladýðýmýz yerde çeþitli verileri aramak
        için collections kullanýrýz.

        Java Interface Nedir?

        Java’da Interface kullanýldýðý zaman içerisinde sadece kendi bünyesinden türeyen alt sýnýflarýn kullanýlmasý,
        doldurmasý zorunda olduðu içi boþ bir metot tanýmlamasý gerçekleþtirilen yapýlardýr.
        Biraz daha akýlda kalýcýlýðý arttýrmak için Java Interface Nedir sorusuna cevap olarak kendisinden üretilen
        sýnýflar için bir kýlavuz, yol gösterici veya gerçekleþtirilmesi gereken görevler bütünü gibi örneklendirerek
        bu soruyu cevaplayabiliriz.

        //---------------------

       - ArrayList temelde array yapýsýnda oluþturulmuþ olduðundan, esnek uzunluða sahip bir array gibi düþünülebilir.

       - Bir ArrayList oluþturmak için data türü <> içerisine yazýlmalýdýr.

                List<String> isimler = new ArrayList<>();

              *** List bir interface olduðundan eþitliðin saðýnda List deðil, bir Class olan ArrayList kullanýlmalýdýr.

              *** Eþitliðin saðýnda <> içerisine data türü yazýlabilir ama yazýlmasý zorunlu deðildir.

              *** Data türü olarak, primitive data türlerini kabul etmez, Wrapper Class'lar kullanýlabilir.

              *** Data türü olarak <Object> yazarsanýz, farklý data türlerinden elemanlarý kullanmanýza izin verir,
                  ancak bu durumda List kullanýlýrken çok fazla cast iþlemi yapmanýz gerekeceðinden
                  çok tercih edilen birþey deðildir.

         // ----------------------- //

         ARRAYLIST DEZAJANTALARI :

         * ArrayList temelde bir array olduðu için elementleri tek tek eklemek zorundasýnýz.

           Element eklemek için biz bir þey yapmak zorunda olmasak da arka planda Java element ekleyebilmek için
           her seferinde belli iþlemler yapmak zorunda olduðundan ArrayList oluþtururken tüm elementleri toplu olarak
           girmenize izin vermez.

           Var olan bir ArrayList'e baþka bir Collection eklemek veya baþka bir Collection üyelerini silmek istediðimizde
           uzunluk baþtan hesaplanabildiði için ArrayList bu tür ekleme ve silme yapmamýza izin verir.

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
        ARRAY'DEN ARRAYLIST YAPMA :  /-/-/  FOR-EACH LOOP Kullanarak List oluþturma /-/-/

        * ArrayList oluþtururken elementleri tek tek eklemek istemezseniz, önce bir array oluþturup sonra bu array'i
          ArrayList yapmayi terch edebilirsiniz.

          - Özellikle fazla elementi olan bir liste oluþturmamýz gerektiðinde, elementleri tek tek eklemek çok zahmetli
            olacaktýr.

          - Array bu konuda daha kullanýþlý olduðundan, uzun listeleri önce Array olarak oluþturup sonra ArrayList'e
            çevirmek daha avantajlý olacaktýr.

            Örneðin aþaðýdaki array'i bir list olarak oluþturmak için 17 satir add() kullanmak gerekir.

                int [] arrx = {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6};

            Bunun yerine boþ bir liste oluþturup FOR-EACH LOOP ile tüm elementleri bu list'e ekleyebilirsiniz.

         */
            int [] arrx = {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6};

            List<Integer> sayilarx = new ArrayList<>();
            for (Integer each:arrx
                 ) {
                sayilarx.add(each);

            }
            System.out.println("sayilarx : " + sayilarx); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6]

        /*
        ARRAY'DEN ARRAYLIST YAPMA :  /-/-/ ARRYS.ASLIST() METHOD'U Kullanarak List oluþturma /-/-/

        * Array'den ArrayList yapmak için Arrays.asList() method'u da kullanýlabilir ancak bu method'un
          2 BÜYÜK DEZAVANTAJI olduðunu bilmemiz gerekir.

            String [] strarr = {"a","b","c"};
            List<String> harfler = Arrays.asList(strarr);
            System.out.println("harfler : " + harfler); // [a, b, c]

          1-) Bu method ile oluþturlan ArrayList'ler, array'in negatif tarafý olan sabit uzunluk kuralýna tabi olurlar
              yani bu listelere ekleme veya silme yapamazsýnýz

                harfler.add("f");
                harfler.remove ("a");

              Ekeleme veya remove yapmak istediðimizde compile time'de Java problemi göremez, çünkü yapýlan iþlem
              syntax açýsýndan doðrudur. Fakat çalýþtýrdýðýmýzda exception ile karþýlaþýrýz.

              (Harfler ArrayList'ini oluþtururken, arrays class'ýndan yardým aldýðýmýz için
              buna array gibi muamele yapýyor.
              Yani her ne kadar ArrayList olsa da, array'in en kötü huyu olan uzunluðunun deðiþmemesidir.
              Dolayýsýyla array'lerin add ve remove özelliðinin olmamasý ArrayList'e de geçiyor.)


          2-) Büyük dezavantaj da her ne kadar kaynak olarak kullandýðýmýz strArr ve oluþturduðumuz yeni harfler listesi
              farklý objeler olsa da;
              Java bunlarý tek bir yapý gibi görür ve birinde yaptýðýmýz deðiþiklikleri otomatik olarak diðerine de iþler.

              Baslangicta strArr : [a, b, c]
              Baslangicta harfler : [a, b, c]

              strArr[0] = "e";                               // arr nin 0. index'indeki elemaný deðiþtirdik

              Array'i update ettiðimizde strArr : [e, b, c]
              Array'i update ettiðimizde harfler : [e, b, c]
                                                             // !!! sadece array'de deðil, harfler arralist'inde de
                                                             // deðiþiklik yaptý.!!!

              harfler.set(2,"t");                            // list in 2. elemanýný "t" yapalým

              List'i update ettiðimizde harfler : [e, b, t]
              List'i update ettiðimizde strArr : [e, b, t]
                                                            // deðiþikliði yine hem arr'ye, hem de arralist'e uyguladý.
         */


        /*    //~~~~~~~~~~~~~~~~~~~~~~~ARRAYLIST METHODS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

        ArrayList Methodlarý : ArrayList pekçok iþlemi kolayca yapabileceðimiz methodlara sahiptir.

        - Bir ArrayList'i yazdýrmak kolaydýr.

        List<String> isimler = new ArrayList<>();
                                                // Array'i yazdýrmak için Arrays class'ýndan yardým almamýz gerekiyordu.
                                                // (System.out.println(Arrays.toString(arr));

        System.out.println(isimler);         // List'in adýný yazmamýz yeterli (isimler)
                                             // [] (yeni oluþturduðumuz için, içinde hiç element olmadýðýndan çýktý boþ)
        isimler.add("Ali");
        isimler.add("Veli");
        System.out.println(isimler);        // [Ali, Veli]



        1-add() methodu : list e eleman eklemek icin kullanilan methoddur.
                          index li de eklenebilir index sizde eklenebilir.

        2-set() methodu : var olan bir elemani baskasiyla degistirmeye yarar.

        3-remove() methodu : belli bir elemaný silmeye yarar iki sekilde yapilir.
            i)--index kullanarak siler

            *** remove (index) method'u, silinen elemaný döndürür.
                Yani method'u System.out.println(hayvan.remove(1)) içinde kullanýrsak silinen elemaný ekrana yazdýrýr.

            ii)--direk elaman belirtilerek, kullanilan ilk yerdeki elemani siler

                *** Not: Index’siz remove( ) method’u true veya false dondurur.
                    System.out.println(hayvan.remove(“kedi”)); //true yani kedi eleman olarak vardi ve sildim
                    System.out.println(hayvan.remove(“tavsan”)); // false yani tavsan eleman olarak yoktu
                                                                 // dolayisiyla silemedim


        4-sort() methodu : elemanlari a dan z ye buyukten kucuge naturel order seklinde siralar.
                           Bunu yaparken """"Collections.sort()"""" seklinde yapar.

        5-contains() methodu : list te bir elemanin var olup olmadigini kontrol eder true ve false olarak dondurur.

        6-get() methodu : List te istenen index teki elemanlari getirir.

        7-size() methou : kac eleman oldugunu verir.uzunlugu da diyebiliriz.
                          Onemli noktasi array in uzunlugunu length verirken Array list te size verir.

        8-clear() methodu : adý ustunde temizlik yapar tum elemanlari siler.

        9-isEmpty methodu : List in ici bos ise true, dolu ise false olarak dondurmeye yarar.

        10-equals() methodu : List lerin yani birden fazla list in icindeki elemanlari kiyaslar
                              Esit ise true degilse false dondurur...

         */

        // Soru uzerinde tum methodlarý gösterecek olursak...

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
