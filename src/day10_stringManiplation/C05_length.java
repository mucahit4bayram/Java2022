package day10_stringManiplation;

public class C05_length {
    public static void main(String[] args) {
        /*
        7 ) lenghth() : String'lerdeki karakter sayısını verir. son index = length() -1'dir.
         */
        String str = "Java öğren, işi kap";

        System.out.println(str.length());               // str'in karakter sayısını döndürür ---> 19
        System.out.println(str.charAt(str.length()-1)); // son karakterini yazdıralım        ---> p
        System.out.println(str.charAt(str.length()-3)); // sondan 3. karakteri yazdıralım    ---> k

        /*
        Java'da null pointer (işaretleyici) bir değer değil, karşısına yazıldığı variable'in hiç bir değer almadığının
        işaretçisidir.
        */

        String str2 = "";    // str2'ye bir değer atanmışmıdır: EVET
                             // Bu değer nedir : Hiçlik

        System.out.println(str2.length());  // 0 hiç karakter olmadığını gösteriyor

        String str3 = null;  // str3'e bir değer atanmışmıdır : HAYIR
                             // null bu değer atamamayı işaret etmektedir

        System.out.println(str3.length());  // bir değer atanmamış ki nasıl uzunluğu olsun uyarısını verir
                                            // NullPointerException olarak hata verir.

        //-/-/ null bir eşitliğin karşısında olsa bile bir atama değildir. null değer atanmadığının işaretçisidir.
    }
}
