package day09_ternary;

import java.util.Scanner;

public class C07_Homework {
    public static void main(String[] args) {

        /*
        Soru : Kullan�c�dan kacinci ay oldugunu sorun ve ay ismini yazd�r�n
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac�nc� ay oldugunu sayi ile giriniz :");
        int ay = scan.nextInt();

        switch (ay){
            case 1 :
                System.out.println("Ocak");
                break;
            case 2 :
                System.out.println("Subat");
                break;
            case 3 :
                System.out.println("Mart");
                break;
            case 4 :
                System.out.println("Nisan");
                break;
            case 5 :
                System.out.println("May�s");
                break;
            case 6 :
                System.out.println("Haziran");
                break;
            case 7 :
                System.out.println("Temmuz");
                break;
            case 8 :
                System.out.println("Agustos");
                break;
            case 9 :
                System.out.println("Eyl�l");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11 :
                System.out.println("Kas�m");
                break;
            case 12 :
                System.out.println("Aral�k");
                break;
            default:
                System.out.println("Gecerli bir sayi giriniz");




        }
    }
}
