package day11_stringManiplation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        /*
        9) lastIndexOf() : verilen String'de istenen karakterin kullanıldığı son index'i döndürür.
                           Eğer iki parametre girersek, aramayı istediğimiz indexten başa doğru yapabiliriz.
         */

        String cumle = "Java cok kolay, Java cok guzel";
        String kelime = "kolay";

        /* verilen kelime için aşağıdaki şartlardan uygun olani yazan bir program yazınız
        - verilen kelime cümlede kullanılmamış
        - verilen kelime cümlede sadece 1 kere kullanılmış
        - verilen kelime cümlede birden fazla kullanılmış
         */

        int kelimeIlkIndex = cumle.indexOf(kelime);    // kelimenin ilk kullanımını verir
        int kelimeSonIndex = cumle.lastIndexOf(kelime);// kelimenin son kullanımını verir

        if (kelimeIlkIndex == -1) {
            System.out.println("verilen kelime cumlede kullanilmamış");
        } else if (kelimeIlkIndex == kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");
        } else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");
        }


        String kelime2 = "Java";
        int kelime2IlkIndex = cumle.indexOf(kelime2);
        int kelime2SonIndex = cumle.lastIndexOf(kelime2);

        if (kelime2IlkIndex == -1) {
                System.out.println("verilen kelime cumlede kullanilmamis");
        } else if (kelime2IlkIndex == kelime2SonIndex) {
                System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");
        } else {
                System.out.println("verilen kelime cumlede birden fazla kullanilmis");



        }
    }
}
