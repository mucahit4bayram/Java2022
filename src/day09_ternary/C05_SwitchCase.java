package day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        /*
        Kullanıcıdan gün numarasını alıp
        1 ise pazartesi,
        .
        .
        .
        7 ise pazar yazdıralım.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo = scan.nextInt();

        /*
        switch yanına yazılan () neye göre case atayacağımızı gösterir.
        Java girilen değere göre case'i bulur ve o satirdan çalıştırmaya başlar.
        break yazisi görünceye veya switch parantezine kadar devam eder.

         if - else if - .... -else yapisinda oldugu gibi
         hic bir sarta uymayanlari default keyword kullanilir

         switch Statement'da long, double, float ve boolean kullanılmaz.
         */

        switch (gunNo){

            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geserli gun numarası giriniz");

        }


    }
}
