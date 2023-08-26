package day10_stringManiplation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        /*
        3 ) to UpperCase()
        4 ) to LowerCase()
            Girilen String değişkenindeki tüm harfleri istenen biçime çevirir.
         */
        String isim = "TechProEducation";
        System.out.println(isim.toLowerCase()); // techproeducation
        System.out.println(isim.toUpperCase()); // TECHPROEDUCATİON

        String str = "Beni psikopata baglamayin";
        System.out.println(str.toUpperCase());                            // BENI PSIKOPATA BAGLAMAYIN
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr"))); // BENİ PSİKOPATA BAGLAMAYİN
        /*
        toLoweCase(Locale locale)
        Eğer büyük-küçük harf dönüşümünde local bir dili esas almak isterseniz bu method kullanılır.
         */
    }
}
