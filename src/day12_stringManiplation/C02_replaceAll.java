package day12_stringManiplation;

public class C02_replaceAll {
    public static void main(String[] args) {

        /*
        15 ) replaceAll() : replace() methodu ile benzer olarak verilen String'deki istenen karakter(ler)i istenen yeni
                            karakter(ler) ile değiştirir. Aralarındaki farklar;

                            - replace() methodunda char kullanılabilir, replaceAll()'da char kullanılamaz
                            - replaceAll() methodunda Regular Expression (kurallı ifadeier) kullanılabilir.

                            \\s : boşluk (space)
                            \\S : boşluk dışındaki tüm karakterler
                            \\w : harf ve rakamlar (a-z, A-Z. 0-9)
                            \\W : harf ve rakamlar dışındaki tüm karakterler
                            \\d : rakamlar (0-9)
                            \\D : rakamlar dışındaki tüm karakterler
         */

        String str = "1Bu2gu3n Ja*va- cok g3uz/el";

        // str'i Bugun Java cok guzel haline geririn.
        // replaceAll() daki all'un amacı aynı özellikteki tüm karakterleri kapsamasıdır.
        // bütün sayıları sil
        // bütün özel karakterleri sil
        // tüm özel karakterleri silelim dediğimizde space'ler de siliniyor
        // space leri korumak için en başta onların yerine cümlede bulunmayacak bir string koyalım
        // "qazwsx"

        str=str.replace(" ","qazwsx");
        System.out.println(str);                              // 1Bu2gu3nqazwsxJa*va-qazwsxcokqazwsxg3uz/el

        str=str.replaceAll("\\W","");
        System.out.println(str);                              // 1Bu2gu3nqazwsxJavaqazwsxcokqazwsxg3uzel

        str=str.replaceAll("\\d","");
        System.out.println(str);                              // BugunqazwsxJavaqazwsxcokqazwsxguzel

        // istenmeyen ozel karakter ve sayilardan kurtulduk
        // simdi space'leri geri getirelim

        str=str.replace("qazwsx"," ");        // Bugun Java cok guzel
        System.out.println(str);


    }
}
