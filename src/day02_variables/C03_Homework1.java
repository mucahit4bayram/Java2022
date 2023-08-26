package day02_variables;

public class C03_Homework1 {
    public static void main(String[] args) {

        // Farkli 3 data türünde variable oluşturun ve bunları yazdırın //

        /*
        Primitive (İlkel) Veri Tipleri
    İlkel veri tipleri, genel olarak sayısal veri tutmak için kullanılır.
    Tuttukları sayısal tipler tam sayı ve ondalıklı sayı olarak 2’ye ayrılır.
    Bunun dışında tek karakter tutmak için ya da true-false tiplerinde veriler
    tutmak için kullanılan primitive veri tipleri vardır.

    Byte: Bellek üzerinde 1 byte yer kaplar. Tamsayı türünde -128 ile 127 arasında değerler alır.

    Short: 16 bittir. Byte tipinde tanımlanan sayılardan daha büyük sayılar tanımlanabilir.
                  -32768 ile 32767 arasında değerler tanımlanabilir.

    Integer (int): En fazla kullanılan veri tipidir. Bellekte 4 Byte yer kaplar ve 32 bittir.
               -2³¹ ile 2³¹-1 arasında değerler tanımlanabilir.

    Long: Uzunluğu 64 bittir. Tamsayı türünde -2⁶³ ile 2⁶³-1 arasında değerler tanımlanabilir.

    Float: Uzunluğu 32 bittir. (4 byte) Ondalık sayı türünde -3.4*10³⁸ ile 3.4*10³⁸ arasında değerler alır.
           (7 basamak) arasında değer depolayabilmektedir.
    Double: Uzunluğu 64 bittir. Ondalık sayı türünde -1.7*10³⁰⁸ ile 1.7*10³⁰⁸ arasında değerler alır.
           (17 basamak) arasında değer depolayabilmektedir.
    Char: Veri tipinin uzunluğu 16 bittir. Karakter türünde değerler alır. Tanımlama yapılırken yalnız bir rakam,
          işaret veya harf kullanılabilir. Yapılan tanımlama işlemleri tek tırnak arasında yapılmalıdır.

    Boolean: Diğer değişkenlerden daha farklı olarak sadece 2 değer alır. Bu değerler true veya false’dir.
             Bellekte bir bit yer kaplar. Mantıksal tipler olarak da bilinir.
         */
        byte myByte=126;
        short myShort=327;
        int myInt=1058;
        long myLong=12042L;
        float myFloat= 42.8F;
        double myDouble=8.58;
        char myChar='A';
        boolean myBoolean=true;

        // Referans Veri Tipleri (String ile sınırlı):
        String myText="Merhaba !";

        // Ekrana Yazdırma Komutları:
        System.out.println(myText+"\nByte Degeri:"+myByte+"\nShort Degeri:"+myShort+"\nInteger Degeri:"+myInt+
                                  "\nLong Degeri:"+ myLong+"\nFloat Degeri:"+myFloat+"\nDouble Degeri:"+myDouble+
                                  "\nChar Degeri:"+myChar+"\nBoolean Degeri:"+myBoolean);

        byte bytesayi = 125;      // -128 ve 127 arasında değer alır. 1 byte
        System.out.println("Byte Sayi: " + bytesayi);  // Byte Sayi: 125

        short shortsayi = 15000;  // -32768 ve 32767 arasında değer alır. 2 byte
        System.out.println("Short Sayi: " + shortsayi); // Short Sayi: 15000

        int intsayi = 123456789;  // 9 basamağa kadar çıkabilen sayıları tanımlarken kullanılır. 4 byte
        System.out.println("Int Sayi: " + intsayi);     // İnt Sayi: 123456789

        long maxDeger = Long.MAX_VALUE;
        long minDeger = Long.MIN_VALUE;

        System.out.println("Long max: " +maxDeger); // 9223372036854775807
        System.out.println("Long min: " +minDeger); // -9223372036854775808

        // long sayi = 965874695874; // int olarak tanımlıyor ve değer aralığında değil uyarısı veriyor.
        long sayi = 965874695874L;   // sonuna L harfi koyunca long olarak tanımlayıp sorun çözüldü.

        System.out.println(sayi);  // 965874695874

        long longSayi = 123456789123456789L; // çok büyük sayıları tanımlamak için kullanılır. 8 byte
        System.out.println("Long Sayi: " + longSayi);    // 1234567891234567891

        float floatSayi = 1.123456789123456789f;         // ondalıklı sayıları tanımlamak için kullanılır.
                                                         // noktadan sonra 7 basamağa kadar çıkabilir. 4 byte
                                                         // sayı sonuna f yazmalıyız
        System.out.println("Float Sayi: " + floatSayi);  // 1.1234568

        double double_Max = 1.123456789123456789000;      // ondalıklı sayı tanımlamak için kullanılır
                                                          // noktadan sonra 17 basamağa kadar çıkabilir. 8 byte
        System.out.println("Double Sayi: " + double_Max); // 1.1234567891234568

        boolean boleanSonuc = 5>2;
        boolean boleanSonuc1 = 5<2;
        System.out.println("Boolen Sonuc : " + boleanSonuc);   // true
        System.out.println("Boolen Sonuc1 : " + boleanSonuc1); // false

        char karekter ='?'; // tek bir karakteri tanımlamak için kullanılır ve tek tırnak içerisinde ' ' olmalıdır.
        System.out.println("Char Karakter: " + karekter); // ?

        String metin = "Idris GEMICI " + " Trabzon";      // metinsel ifadeler için kullanılır.
                                                          // yazacağımız metin " " arasında olmalıdır.
        System.out.println("String Metin: " + metin);     // String Metin: İdris GEMİCİ  Trabzon










    }
}
