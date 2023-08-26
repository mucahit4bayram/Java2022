package day10_stringManiplation;

public class C03_equals {
    public static void main(String[] args) {

        /*
        5 ) equals : Verilen iki String'in içeriğinin birbirine eşit olup olmadığını kontrol eder.

        Sayısal veya char variable'larda eşitliği kontrol etmek için == kullanıyorduk.
        Ancak String'de == doğru çalışmayabilir.(Aslında Java bunu kesin kurallarla belirlemiştir,
        biz daha sonra öğreneceğiz)

        Eğer verilen Stringlerdeki tüm karakterler (boşluk, büyük harf, küçük harf, özel karakter ...)
        tamamen aynı ise TRUE döner, aksi durumda (bir karakter bile farklı ise) FALSE döner.

        equals() methodu : verilen iki String'in içeriğinin birbirine eşit olup olmadığını kontrol eder.
        == karşılaştırma operatörü : verilen iki String objesinin değerinin yanında referance (adres)'lerine de bakar.
        Aynı değere sahip olsa da farki iki objeyi == ile karşılaştırdığımızda sonuç FALSE olur.
         */
        String str1 = "Ali Can";
        String str2 = "Ali CAN";
        String str3 = "Ali Can" + "";
        String str4 = "Ali Can";
        String str5 = new String("Ali Can");

        System.out.println(str1 == str2);        // false

        System.out.println(str1 == str3);        // true
        System.out.println(str1.equals(str3));   // true

        System.out.println(str1 == str5);        // false
        System.out.println(str1.equals(str5));   // true

        System.out.println(str1==str4);          // true
        System.out.println(str1.equals(str4));   // true

        System.out.println(str3.equals(str5));   // true
        System.out.println(str3==str5);          // false
        /*
        sayisal veya char variable'lerde eşitliği kontrol etmek içim == kullanıyorduk.
        String'lerde aynı String olsa bile == her zaman çalışmaz
        emin olmak isterseniz equals methodunu kullanmalısınız.

        equals kullandığımızda dikkat edeceğimiz tek şey metinlerin bire bir aynı olmasıdır.
         */

    }
}
