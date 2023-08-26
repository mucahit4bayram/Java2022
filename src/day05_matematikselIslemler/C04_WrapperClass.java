package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

           //// wrapper (sarmalayıcı)  ////

        // java'da 2 tur data turu vardi
        // primitive sadece value icerir
        // non-primitive data turleri ise deger ve methodlari iceriyordu

        String str="java çok güzel";
        str =str.toUpperCase();
        System.out.println(str);               // JAVA ÇOK GÜZEL
        System.out.println(str.toUpperCase()); // JAVA ÇOK GÜZEL

        int sayi=10;
        // primitive data türlerinin yanında metodlar olmaz
        // java bazı metodları kullanabilmemiz için her bir primitiv data türü için bir wrapper class oluşturmuştur.

        Integer sayi2=10;  // baş harfini büyük yapınca non primitiv oldu.
        sayi2.byteValue();
        System.out.println(sayi2);     // 10

        int num1 = Integer.MAX_VALUE;  // 2147483647
        int num2 = Integer.MIN_VALUE;  // -2147483648

        int num3 = Byte.MAX_VALUE;     // 127
        int num4 = Byte.MIN_VALUE;     // -128

        System.out.println("num1 : " + num1); // 2147483647
        System.out.println("num2 : " + num2); // -2147483648
        System.out.println("num3 : " + num3); // 127
        System.out.println("num4 : " + num4); // -128

        short numShort1 = Short.MAX_VALUE;
        short numShort2 = Short.MIN_VALUE;

        System.out.println("numShort1 : " + numShort1); // 32767
        System.out.println("numShort2 : " + numShort2); // -32768

        byte numShort3 = Byte.MAX_VALUE;
        byte numShort4 = Byte.MIN_VALUE;

        System.out.println("numShort3 : " + numShort3); // 127
        System.out.println("numShort4 : " + numShort4); // -128
    }
}
