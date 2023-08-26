package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {

    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        buyukHarfleYazdir(liste);
        System.out.println();
        // buyukHarfleYazdir02(liste);
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizYazdir(liste);
        System.out.println();
        uzunlukVeIlkHarfeGoreSiralaYazdir(liste);
        System.out.println();
        //bestenBuyukleriSil(liste);
        //baslangiciAYadaSonuNOlaniSil(liste);
        //baslangiciAYadaSonuNOlaniSil02(liste);
        //uzunlugu8ile10arasiveOIleBiteniSil(liste);
        System.out.println("uzunlugu12denAzMi: "+uzunlugu12denAzMi(liste));

        System.out.println("xIleBaslamiyorMu: "+ xIleBaslamiyorMu(liste));
        System.out.println("rIleBitenVarMi: "+rIleBitenVarMi(liste));
    }

    // 1) T�m elemanlar� b�y�k harf ile yazd�ran bir method olu�turun.
    // 1. Yol
    public static void buyukHarfleYazdir(List<String>list) {

        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // 2. Yol
//    public static void buyukHarfleYazdir02(List<String>list){
//
//        list.replaceAll(String::toUpperCase); // replaceAll methodu listte kal�c� de�i�iklik yapar.(list ==> mutable)
//        System.out.println(list);
//    }

    // 2) Elemanlar� uzunluklar�na g�re s�ralay�p yazd�ran bir method olu�turun.
    public static void uzunlugaGoreYazdir(List<String> list){

        list.
                stream().
                sorted(Comparator.comparing(String::length)).// Comparator.comparing(): S�ralama ko�ulun belirtmek i�in kullan�l�r.
                                                             // length se�erek, uzunlu�a g�re s�ralam�� olduk.
                                                             // sorted : string lerde alfabetik s�ralama yapar.(normalde)
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // 3) Elemanlar� uzunluklar�na g�re ters s�ralay�p yazd�ran bir method olu�turun.
    public static void uzunlugaGoreTersYazdir(List<String> list){

        list.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).// reversed methodunu uygulay�nca uzunlu�a g�re ters yazd�rd�k.
                                                                        // yani k�sadan uzuna g�re.
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // 4) Elemanlar� son karakterlerine g�re s�ralay�p tekrars�z yazd�ran bir method olu�turun.
    public static void sonKaraktereGoreTekrarsizYazdir(List<String> list){

        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // 5) Elemanlar� �nce uzunluklar�na g�re ve sonra ilk karakterine g�re s�ralay�p yazd�ran bir method olu�turun.

    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list){

        list.
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).
                                                          //thenComparing() :==>siralama icin bir kosul daha belirtir
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // 6) Uzunlu�u 5'ten b�y�k olan elemanlar� silen bir method olu�turun.

//    public static void bestenBuyukleriSil(List<String> list){
//
//        list.removeIf(t->t.length()>5);                // removeIf() ==> e�er ko�ul do�ruysa sil
//        System.out.println(list);

              // *** ==> list, mutable oldu�u i�in elemanlar� i�lem sonras� kal�c� de�i�ti�inden comment-out yap�yorum.
              // *** ==> stream(), methodunu kullan�rsak remove methodunu kullanam�yoruz.
//    }

      // 7) �A�, �a� ile ba�layan yada �N�, �n� ile biten elemanlar� silen bir method olu�turun.

     // 1. Yol
//    public static void baslangiciAYadaSonuNOlaniSil(List<String> list){
//
//        list.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n');
//        System.out.println(list);
//
//    }
      // 2. Yol
//    public static void baslangiciAYadaSonuNOlaniSil02(List<String > list){
//
//        list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
//        System.out.println(list);//[Mark, Christopher, Mariano, Tucker]
//
//    }

    //8) Uzunlu�u 8 ile 10 aras� olan yada 'o' ile biten elemanlar� silen bir method olu�turun.

//    public static void uzunlugu8ile10arasiveOIleBiteniSil(List<String > list){
//
//        list.removeIf(t->(t.length()>7 && t.length()<11) || t.endsWith("o"));
//        System.out.println(list);
//
//    }

    // 9) T�m elemanlar�n uzunluklar�n�n 12'den az olup olmad���n� kontrol eden bir method olu�turun.
    public static boolean uzunlugu12denAzMi(List<String> list){

        return list.stream().allMatch(t->t.length()<12);

                            // allMatch () ==> tum elemanlar istenen kosula uyuyor mu?
    }

    // 10) Hi�bir eleman�n 'X' ile ba�lamad���n� kontrol eden bir method olu�turun.
    public static boolean xIleBaslamiyorMu(List<String> list){

        return  list.stream().noneMatch(t->t.startsWith("X") || t.startsWith("x"));

                             // noneMatch () ==> hic bir eleman istenen kosula uyuyor mu?
    }

    // 11) Herhangi bir eleman�n 'r' ile bitip bitmedi�ini kontrol eden bir method olu�turun.
    public static boolean rIleBitenVarMi(List<String> list){

        return list.stream().anyMatch(t->t.endsWith("r"));

                             // anyMatch () ==>  herhangibir  eleman istenen kosula uyuyor mu?
    }
}