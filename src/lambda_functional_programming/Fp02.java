package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1)  t-> "Logic" , (t, u)-> "Logic"
        Bu yapýya "Lambda Expession"

    2) Functional Programming kapsamýnda "Lambda Expession" kullanýlabilir ama önerilmez.
       "Lambda Expession" yerine "Method Reference" tercih edilir.

    3) "Method Reference" kullanýmý ==> "Class Name :: Method Name" þeklindedir.

       Ayný zamanda kendi class'larýnýzý da  method referans olarak kullanabilirsiniz.

       Örneðin bir Animal class'ýnýz var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
     */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami01(liste);
        tekrarsizCiftElemanlarinKareToplami02(liste);
        tekrarsizCiftElemanlarinKareToplami03(liste);
        tekrarsizCiftElemanlarinKupleriniCarpimi(liste);
        getMaxEleman(liste);
        getMinEleman(liste);
        yedidenBuyukCiftMin(liste);
        terSiralamaylaTekrarsizElemanlarinYarisi(liste);

    }

    // 1) Ardýþýk list elemanlarýný ayný satýrda aralarýnda boþluk býrakarak yazdýran bir method oluþturun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir); // Utils class'ýna git, ayniSatirdaBosluklaYazdir methodunu kullan

        // forEacj ile list elemanlarýný tek tek alýp, Utils method clasýmýzdaki methoda göre yazdýrýyor.
        // hiçbir lambda expression kullanmadan, sadece methodlarla çözdük. Functional_programming budur.
    }

    // 2) Ardýþýk çift list elementlerini ayný satýrda aralarýnda boþluk býrakarak yazdýran bir method oluþturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){

        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    // 3) Ardýþýk tek list elemanlarýnýn karelerini ayný satýrda aralarýnda boþluk býrakarak yazdýran bir method oluþturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){

        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesinAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    // 4) Ardýþýk tek list elemanlarýnýn küplerini tekrarsýz olarak ayný satýrda aralarýnda boþluk býrakarak yazdýran bir method oluþturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){

        list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    // 5) Tekrarsýz çift elemanlarýn karelerinin toplamýný hesaplayan bir method oluþturun.
    // 1. Yol
    public static void tekrarsizCiftElemanlarinKareToplami01(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesinAl).reduce(0, Math::addExact);
        System.out.println(toplam);

    }
    // 2. Yol
    public static void tekrarsizCiftElemanlarinKareToplami02(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesinAl).reduce(Math::addExact).get();
        System.out.println(toplam);             // get () methodu ekleyince, baþlangýç deðeri atamadan iþlemi yaptý.

    }
    // 3. Yol
    public static void tekrarsizCiftElemanlarinKareToplami03(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesinAl).reduce(0,Integer::sum);
        System.out.println(toplam);            // mat classa gitmeden, Integer wrapper classtan sum methodunu kullandýk

    }

    // 6) Tekrarsýz çift elemanlarýn küpünün çarpýmýný hesaplayan bir method oluþturun.

    public static void  tekrarsizCiftElemanlarinKupleriniCarpimi(List<Integer> list){

        Integer carpim = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(carpim);
    }

    // 7) List elemanlarý arasýndan en büyük deðeri bulan bir method oluþturun.

    public static void getMaxEleman(List<Integer> list){

        Integer max = list.stream().distinct().reduce(Math::max).get();

        System.out.println("max = " + max);

    }

    // 8)List elemanlarý arasýndan en küçük deðeri bulan bir method oluþturun.(Method Reference)

    public static void getMinEleman(List<Integer> list) {

        Integer min = list.stream().distinct().reduce(Math::min).get();

        System.out.println("min = " + min);
    }

    // 9) List elemanlarý arasýndan 7'den büyük, çift, en küçük deðeri bulan bir method oluþturun.
    public static void yedidenBuyukCiftMin(List<Integer> list){

        Integer min =list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemaniSec).reduce(Math::min).get();
        System.out.println(min);
    }

    // 10) Ters sýralama ile tekrarsýz ve 5'ten büyük elemanlarýn yarý deðerlerini(elamanýn ikiye bölüm sonucunu) bulan bir method oluþturun.
    public static void terSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){
        List<Double> sonuc = list.
                        stream().       //Gerekli methodlarý kullanmamýzý saðlar
                        distinct().     //Tekarlý olanlarý almaz
                        filter(t-> t>5).//Koþula göre filtreleme yapar
                        map(Utils::yarisiniAl).           //Her bir elemanýn deðerini deðiþtirmeye yarar
                        sorted(Comparator.reverseOrder()).//Ters Sýralama yapar. Büyükten küçüðe
                        collect(Collectors.toList());     //Elamanlarý collection'a çevirir.
        System.out.println(sonuc);

    }
}