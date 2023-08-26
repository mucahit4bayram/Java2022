package day12_stringManiplation;

public class C04_substring {
    public static void main(String[] args) {

        String str = "Java cok yasa";


        System.out.println(str.substring(3,4));    // a
        System.out.println(str.substring(5,7));    // co
        System.out.println(str.substring(6,6));    // ""
        System.out.println("====");                // ====
        // System.out.println(str.substring(6,2)); // exception

        /*
        Java'da iki tür hata mesajı alırız.
        1- Compile Time Error (CTE) : Kodumuzu yazarken kod altında kırmızı cizgi olması
        2- Run Time Error (RTE) : Kod çaliştiğinda (Execute) karşılaştığımız hatalar
         */
        System.out.println(str.substring(6)); // ok yasa
    }
}
