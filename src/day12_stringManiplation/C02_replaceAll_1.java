package day12_stringManiplation;

public class C02_replaceAll_1 {
    public static void main(String[] args) {

        String str = "Java'da rakamlar 1234567890";

        System.out.println(str.replaceAll("a","*"));    // J*v*'d* r*k*ml*r 1234567890
        System.out.println(str.replaceAll("\\s","*"));  // Java'da*rakamlar*1234567890
        System.out.println(str.replaceAll("\\S","*"));  // ******* ******** **********
        System.out.println(str.replaceAll("\\w","*"));  // ****'** ******** **********
        System.out.println(str.replaceAll("\\W","*"));  // Java*da*rakamlar*1234567890
        System.out.println(str.replaceAll("\\d","*"));  // Java'da rakamlar **********
        System.out.println(str.replaceAll("\\D","*"));  // *****************1234567890

        /*
        16) replaceFirst() : Verilen String'deki istenen karakter(ler)in ilkini, istenen yeni karakter(ler)
                             ile değiştirir.
         */

        System.out.println(str.replaceFirst("a","*"));   // J*va'da rakamlar 1234567890
        System.out.println(str.replaceFirst("lar","*")); // Java'da rakam* 1234567890
        System.out.println(str.replaceFirst("\\s","*")); // Java'da*rakamlar 1234567890
        System.out.println(str.replaceFirst("\\D","*")); // *ava'da rakamlar 1234567890


    }
}
