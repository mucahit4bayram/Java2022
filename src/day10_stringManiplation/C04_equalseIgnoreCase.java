package day10_stringManiplation;

public class C04_equalseIgnoreCase {
    public static void main(String[] args) {

        /*
        6 ) equalsIgnoreCase : büyük / küçük harf farklarına bakmadan iki metni karşılaştırır.

        Büyük / küçük harf farklılığı dışında herhangi bir karakter farklılığı olduğunda equals methodunda olduğu
        gibi FALSE döndürür.
        */

        String str1 = "Ali Can";
        String str2 = "ali can";
        String str3 = "ALİ CAN";
        String str4 = "Ali Can_";

        System.out.println(str1.equals(str2));           // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1 == str2);                // false

        System.out.println(str2.equals(str3));           // false
        System.out.println(str2.equalsIgnoreCase(str3)); // true
        System.out.println(str2 == str3);                // false

        System.out.println(str1.equals(str4));           // false
        System.out.println(str1.equalsIgnoreCase(str4)); // false
        System.out.println(str1 == str4);                // false

        String str5 = "Ali Can" +"";
        String str6 = "Ali Can" +" ";

        System.out.println (str5==str6);                 // false
        System.out.println(str5.equals(str6));           // false
        System.out.println(str5.equalsIgnoreCase(str6)); // false

        System.out.println (str1==str5);                 // true
        System.out.println(str1.equals(str5));           // true
        System.out.println(str1.equalsIgnoreCase(str5)); // true

        System.out.println (str1==str6);                 // false
        System.out.println(str1.equals(str6));           // false
        System.out.println(str1.equalsIgnoreCase(str6)); // false




    }
}
