package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1)  t-> "Logic" , (t, u)-> "Logic"
        Bu yap�ya "Lambda Expession"

    2) Functional Programming kapsam�nda "Lambda Expession" kullan�labilir ama �nerilmez.
       "Lambda Expession" yerine "Method Reference" tercih edilir.

    3) "Method Reference" kullan�m� ==> "Class Name :: Method Name" �eklindedir.

       Ayn� zamanda kendi class'lar�n�z� da  method referans olarak kullanabilirsiniz.

       �rne�in bir Animal class'�n�z var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
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

    // 1) Ard���k list elemanlar�n� ayn� sat�rda aralar�nda bo�luk b�rakarak yazd�ran bir method olu�turun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir); // Utils class'�na git, ayniSatirdaBosluklaYazdir methodunu kullan

        // forEacj ile list elemanlar�n� tek tek al�p, Utils method clas�m�zdaki methoda g�re yazd�r�yor.
        // hi�bir lambda expression kullanmadan, sadece methodlarla ��zd�k. Functional_programming budur.
    }

    // 2) Ard���k �ift list elementlerini ayn� sat�rda aralar�nda bo�luk b�rakarak yazd�ran bir method olu�turun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){

        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    // 3) Ard���k tek list elemanlar�n�n karelerini ayn� sat�rda aralar�nda bo�luk b�rakarak yazd�ran bir method olu�turun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){

        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesinAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    // 4) Ard���k tek list elemanlar�n�n k�plerini tekrars�z olarak ayn� sat�rda aralar�nda bo�luk b�rakarak yazd�ran bir method olu�turun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){

        list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    // 5) Tekrars�z �ift elemanlar�n karelerinin toplam�n� hesaplayan bir method olu�turun.
    // 1. Yol
    public static void tekrarsizCiftElemanlarinKareToplami01(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesinAl).reduce(0, Math::addExact);
        System.out.println(toplam);

    }
    // 2. Yol
    public static void tekrarsizCiftElemanlarinKareToplami02(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesinAl).reduce(Math::addExact).get();
        System.out.println(toplam);             // get () methodu ekleyince, ba�lang�� de�eri atamadan i�lemi yapt�.

    }
    // 3. Yol
    public static void tekrarsizCiftElemanlarinKareToplami03(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesinAl).reduce(0,Integer::sum);
        System.out.println(toplam);            // mat classa gitmeden, Integer wrapper classtan sum methodunu kulland�k

    }

    // 6) Tekrars�z �ift elemanlar�n k�p�n�n �arp�m�n� hesaplayan bir method olu�turun.

    public static void  tekrarsizCiftElemanlarinKupleriniCarpimi(List<Integer> list){

        Integer carpim = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(carpim);
    }

    // 7) List elemanlar� aras�ndan en b�y�k de�eri bulan bir method olu�turun.

    public static void getMaxEleman(List<Integer> list){

        Integer max = list.stream().distinct().reduce(Math::max).get();

        System.out.println("max = " + max);

    }

    // 8)List elemanlar� aras�ndan en k���k de�eri bulan bir method olu�turun.(Method Reference)

    public static void getMinEleman(List<Integer> list) {

        Integer min = list.stream().distinct().reduce(Math::min).get();

        System.out.println("min = " + min);
    }

    // 9) List elemanlar� aras�ndan 7'den b�y�k, �ift, en k���k de�eri bulan bir method olu�turun.
    public static void yedidenBuyukCiftMin(List<Integer> list){

        Integer min =list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemaniSec).reduce(Math::min).get();
        System.out.println(min);
    }

    // 10) Ters s�ralama ile tekrars�z ve 5'ten b�y�k elemanlar�n yar� de�erlerini(elaman�n ikiye b�l�m sonucunu) bulan bir method olu�turun.
    public static void terSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){
        List<Double> sonuc = list.
                        stream().       //Gerekli methodlar� kullanmam�z� sa�lar
                        distinct().     //Tekarl� olanlar� almaz
                        filter(t-> t>5).//Ko�ula g�re filtreleme yapar
                        map(Utils::yarisiniAl).           //Her bir eleman�n de�erini de�i�tirmeye yarar
                        sorted(Comparator.reverseOrder()).//Ters S�ralama yapar. B�y�kten k����e
                        collect(Collectors.toList());     //Elamanlar� collection'a �evirir.
        System.out.println(sonuc);

    }
}