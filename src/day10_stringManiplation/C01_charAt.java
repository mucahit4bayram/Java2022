package day10_stringManiplation;

public class C01_charAt {
    public static void main(String[] args) {

        /*
        1 ) Concatination : Birden fazla String'i birleştirerek tek bi String haline getirmek için kullanılır.
        */

        String isim = "Ali";
        String soyisim = "Can";

        System.out.println(isim+" "+soyisim);     // Ali Can   /-/ + (toplama) işareti ile yaptık
        System.out.println(isim.concat(soyisim)); // AliCan    /-/ concat() methodu kullanarak yaptık
        System.out.println(isim.concat(" "+soyisim)); // Ali Can
        // ------------------------------------------------------------------------------------------- //
        /*
        2 ) char At() : İstenen indexteki karakteri (char) döndürür. Index 0'dan başlar,
                        maximum indek (String'in uzunluğu -1) dir.
         */
        String str = "Java öğrenmek ne güzel";

        System.out.println(str.charAt(0));                 // ilk harfi yazdırır J

        System.out.println(str.toUpperCase().charAt(7));   // R
        // uyguladığımız toUpperCase methodu sonrası atama yapmadığımız için kalıcı olarak büyükharfe dönüşmedi.

        System.out.println(str.charAt(21));                // l

        // System.out.println(str.charAt(22));    // StringIndexOutOfBoundsException
        // son harfi bulmak için str'ın uzunluğunun bir eksiğini index olarak gireriz.
        // eğer index olarak, max. indexten daha uzun bir sayıyı girersek java exception verir.

        // charAt() kullandığımızda sonuc char olacağı için artık manuplation yapamayız
        // String method'larından kullanmamız gereken bir method varsa charAt'den önce kullanmalıyız.




    }
}
