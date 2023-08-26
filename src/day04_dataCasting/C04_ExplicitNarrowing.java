package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

                //-/-/ Explicit Narrowing (Manuel Daraltma)  /-/-/

        int sayi1=50;  // 128 yaptığımızda -128 olur
                       // 132 yaptığımızda -124 olur
                       // 136 yaptığımızda -120 olur
                       // -132 yaptığımızda 124 olur
                       // -128------127 (byt) (fazlalığı başa döndürüyor)

        // short sayi2=(short) sayi1;

        byte sayi2=(byte) sayi1;

        System.out.println((sayi2)); //50

        /* Geniş data türündeki değeri, dar data türündeki variable'a atamak isterseniz
        Java sizin geniş data türündeki değerin, dar data türünün sınırlarına uyup uymayacağını
        çalıştırana kadar bilemez
        ama java risk almaz
        Riski sıfıra indirmek için burada  bir sorun olursa
        sorumluluğu kabul etmenizi bekler
        bunun için değerin önüne parantez içerisinde istediğimiz data türünü yazmamız yeterlidir.

        Bu riski üstlendiğimizde 3 durum oluşabilir;

        1- bizim değerimiz, dar kalıp değerlerine uygun olursa hic bir kayıp olmadan cast olur.
        2- double bir sayıyı int'a cast etmek gibi durumlarda data kaybı yaşanabilir.
        3- geniş kalıptan değeri dar kalıba koyduğunuzda sınırları aşan durumlarda
           veri başkalaşabilir.

         */
    }
}
