package day11_stringManiplation;

public class C05_endsWith {
    public static void main(String[] args) {

        /*
        11 ) endsWith () : Verilen String'in istenen karakter(ler) ile bitip bitmediğini kontrol eder.
                           İstenen karakter(ler) ile bitiyorsa TRUE, yoksa FALSE döndürür.

                           - Parametre String olmalıdır
                           - Yanlış karakter sorgulanırsa souç ----> false
                           - Parametre kelime olabilir
                           - "" ile sorsak true döner
         */

        String str = "Ah be Java";

        System.out.println(str.endsWith("ava"));        // true

        System.out.println(str.endsWith("be Java"));    // true

        System.out.println(str.endsWith("Ah be Java")); // true

        System.out.println(str.endsWith(""));           // true


    }
}
