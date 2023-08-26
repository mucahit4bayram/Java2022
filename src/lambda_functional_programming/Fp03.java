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

    // 1) Tüm elemanlarý büyük harf ile yazdýran bir method oluþturun.
    // 1. Yol
    public static void buyukHarfleYazdir(List<String>list) {

        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // 2. Yol
//    public static void buyukHarfleYazdir02(List<String>list){
//
//        list.replaceAll(String::toUpperCase); // replaceAll methodu listte kalýcý deðiþiklik yapar.(list ==> mutable)
//        System.out.println(list);
//    }

    // 2) Elemanlarý uzunluklarýna göre sýralayýp yazdýran bir method oluþturun.
    public static void uzunlugaGoreYazdir(List<String> list){

        list.
                stream().
                sorted(Comparator.comparing(String::length)).// Comparator.comparing(): Sýralama koþulun belirtmek için kullanýlýr.
                                                             // length seçerek, uzunluða göre sýralamýþ olduk.
                                                             // sorted : string lerde alfabetik sýralama yapar.(normalde)
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // 3) Elemanlarý uzunluklarýna göre ters sýralayýp yazdýran bir method oluþturun.
    public static void uzunlugaGoreTersYazdir(List<String> list){

        list.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).// reversed methodunu uygulayýnca uzunluða göre ters yazdýrdýk.
                                                                        // yani kýsadan uzuna göre.
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // 4) Elemanlarý son karakterlerine göre sýralayýp tekrarsýz yazdýran bir method oluþturun.
    public static void sonKaraktereGoreTekrarsizYazdir(List<String> list){

        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // 5) Elemanlarý önce uzunluklarýna göre ve sonra ilk karakterine göre sýralayýp yazdýran bir method oluþturun.

    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list){

        list.
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).
                                                          //thenComparing() :==>siralama icin bir kosul daha belirtir
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // 6) Uzunluðu 5'ten büyük olan elemanlarý silen bir method oluþturun.

//    public static void bestenBuyukleriSil(List<String> list){
//
//        list.removeIf(t->t.length()>5);                // removeIf() ==> eðer koþul doðruysa sil
//        System.out.println(list);

              // *** ==> list, mutable olduðu için elemanlarý iþlem sonrasý kalýcý deðiþtiðinden comment-out yapýyorum.
              // *** ==> stream(), methodunu kullanýrsak remove methodunu kullanamýyoruz.
//    }

      // 7) ‘A’, ‘a’ ile baþlayan yada ‘N’, ‘n’ ile biten elemanlarý silen bir method oluþturun.

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

    //8) Uzunluðu 8 ile 10 arasý olan yada 'o' ile biten elemanlarý silen bir method oluþturun.

//    public static void uzunlugu8ile10arasiveOIleBiteniSil(List<String > list){
//
//        list.removeIf(t->(t.length()>7 && t.length()<11) || t.endsWith("o"));
//        System.out.println(list);
//
//    }

    // 9) Tüm elemanlarýn uzunluklarýnýn 12'den az olup olmadýðýný kontrol eden bir method oluþturun.
    public static boolean uzunlugu12denAzMi(List<String> list){

        return list.stream().allMatch(t->t.length()<12);

                            // allMatch () ==> tum elemanlar istenen kosula uyuyor mu?
    }

    // 10) Hiçbir elemanýn 'X' ile baþlamadýðýný kontrol eden bir method oluþturun.
    public static boolean xIleBaslamiyorMu(List<String> list){

        return  list.stream().noneMatch(t->t.startsWith("X") || t.startsWith("x"));

                             // noneMatch () ==> hic bir eleman istenen kosula uyuyor mu?
    }

    // 11) Herhangi bir elemanýn 'r' ile bitip bitmediðini kontrol eden bir method oluþturun.
    public static boolean rIleBitenVarMi(List<String> list){

        return list.stream().anyMatch(t->t.endsWith("r"));

                             // anyMatch () ==>  herhangibir  eleman istenen kosula uyuyor mu?
    }
}