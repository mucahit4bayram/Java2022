package day11_stringManiplation;

public class C07_startsWith {
    public static void main(String[] args) {

        /*
        12 ) startsWith () : Verilen String'in istenen karakter(ler) ile başlayıp başlamadığını kontrol eder.
                             İstenen karaker(ler) ile başlıyorsa TRUE, yoksa FALSE döndürür.
         */

        String input = "Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("J"));                   // true
        System.out.println(input.startsWith(""));                    // true
        System.out.println(input.startsWith("gun",5));   // true
        System.out.println(input.startsWith("v",2));     // true
        System.out.println(input.startsWith("gec",9));   // true

        /*
        13) isEmpty () : Verilen String'in uzunluğu 0 (sıfır) ise (hiçbir karakter içermiyorsa) TRUE,
                         yoksa FALSE döndürür.

                         - ""   ----> true döner
                         - null ----> hata verir
         */

        String str = "Calisirsaniz, Java Ogrenmek cok kolay";
        System.out.println(str.isEmpty());    // false

        String str2 = "";
        System.out.println(str2.isEmpty());   // true

        String str3 = null;
        System.out.println(str3.isEmpty());   // hata verir / expection hatası

    }
}
