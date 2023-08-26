package day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        //-/-/ Koşul Operatörü (Ternary Operator) /-/-/

       // Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        System.out.println(sayi>=0 ? sayi : (-1*sayi));
                               //    -----  ---------
                               //    true :  false

        // Ekranda ne görürüz;
        int y = 112;
        System.out.println((y>5) ? ("Inek") : ("Koyun"));  // Inek
        System.out.println((y<91) ? 9 : 11);               // 11

        int a = 1;
        int b = 1;

        int c = a>10 ? a++ : b++;
        System.out.println(a + "," + b + "," + c);         // 1,2,1



    }
}
