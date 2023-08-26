package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1.equals(sb2));  // false

        System.out.println(sb1.equals(sb1));  // true

        // StringBuilder'da equals method'u ancak ayný obje olursa true döner
        // String'deki gibi düþünmek lazým

        System.out.println(sb1.equals(str)); // false
    }
}
