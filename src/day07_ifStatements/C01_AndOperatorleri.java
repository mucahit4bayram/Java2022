package day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
        System.out.println(a>0 && b<20 && c>=b); // true - true - true ----> true

        System.out.println(a<0 && b<20 && c>=b); // false - true - true ----> false

        /*
        java and operotörü konusunda bize iki seçenek sunar.

        && kullanırsak, ilk false bulduğunda, artık sonucun false olacağını bilir ve geriye kalan şartları incelemez

        & kullanırsak tüm şartları kontrol eder sonra sonucu belirler.

        bu çalışma usullerinden dolayı & operatörü, && operatörüne göre daha yavaş olabilir.
         */

        System.out.println(a<0 & b<20 & c>=b); // false - true - true ----> false

    }
}
