package day11_stringManiplation;

public class C01_indexOf {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";
        /*
        Verilen bir String'de herhangi bir String veya char'in ilk kullanıldiği index'i bize döndürür.
         */

        System.out.println(str.indexOf('g'));  // 6
        System.out.println(str.indexOf("r"));  // 7
        System.out.println(str.indexOf("j"));  // -1

        System.out.println(str.indexOf("mek")); // 10

        /*
        Eğer istediğimiz index'den sonrasını kontrol etmek istersek o zaman aynı method'u iki parametreli olarak
        kullanabiliriz.
         */

        System.out.println(str.indexOf("g", (6+1)));  // yazılan index'i bize döndürür // 18

        // yukarıdaki str'da 2. ve 3. e'nin indexlerini bulunuz.
        // 2. e'yi bulabilmek için 1. e'nin index ine ihtiyacım var

        int ilke = str.indexOf("e");
        System.out.println(str.indexOf("e")); // 8
        System.out.println(ilke);             // 8

        int ikincie = str.indexOf("e", ilke+1);
        System.out.println(ikincie);  // 11


        // eğer 2. e varsa 3. e nin olup olmadığını ve varsa indexini yazdıralım.

        if (ikincie==-1) {
            System.out.println("verilen str'da 2. e yok");
        }else{
            int ucuncue = str.indexOf("e",ikincie+1);
            if (ucuncue==-1) {
                System.out.println("verilen str'da 3. e yok");
            }else{
                System.out.println("verilen str'daki 3. e nin index'i : " + ucuncue); // 21
            }
        }

    }
}
