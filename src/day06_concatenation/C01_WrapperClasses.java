package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*
        Wrapper class javanın hazır methodları kullanabilmemiz için primitive data türlerinin herbiri için
        açtığı class'lardır.

        ing  --> Integer
        char --> Character
        diğerleri primitive data türü ile aynı sadece baş hafrleri büyük

         */
        String str ="Java ile hayat ne guzel";

        System.out.println(str.toUpperCase()); // JAVA ILE HAYAT NE GUZEL

        boolean guzelMi = true;
        //guzelMi. boolen primitive olduğundan hazır metodu bulunmuyor

        Boolean buGuzelMi = true;
        buGuzelMi.toString();
        System.out.println(buGuzelMi);       // true

        short numShort1 = Short.MAX_VALUE;
        short numShort2 = Short.MIN_VALUE;

        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.MAX_VALUE); // 32767

        int num1 = Integer.MAX_VALUE;  // 2147483647
        int num2 = Integer.MIN_VALUE;  // -2147483648

        int num3 = Byte.MAX_VALUE;     // 127
        int num4 = Byte.MIN_VALUE;     // -128


        String ogrNo = "123456";

        // kullanıcıdan bir şifre isteyin, eğer şifre sadece rakamlardan oluşuyorsa kabul edelim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");
        String sifre = scan.nextLine();

        Integer sifreSayi= Integer.parseInt(sifre);            // 12312

        System.out.println("girilen sifre : " + sifre);        // 12312
        System.out.println("Integer sifre : " + sifreSayi);    // 12312

        System.out.println("girilen sifrenin 3 fazlasi : " + (sifre+3));      // 123123
        System.out.println("Integer sifrenin 3 fazlasi : " + (sifreSayi+3));  // 12315

        /*
        Wrapper class'lar ileride kullanabileceğimiz pek çok faydali hazır method içerir
         */


    }
}
